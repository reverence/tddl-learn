package com.tddl.main;

import com.taobao.tddl.conf.client.ZkClient;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.zookeeper.KeeperException;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.tddl.main.constants.Constants.ZK_GLOBAL_MACHINE_ID_PREFIX;

/**
 * 基于zookeeper提供machineId，bean创建时自动向zk注册获取machineId，可靠性依赖zk的维护
 */
public class ZookeeperMachineIdProvider implements MachineIdProvider {

    private ZkClient zkClient;

    private long maxMachineId;

    private static DecimalFormat _10 = new DecimalFormat("0000000000");

    public ZookeeperMachineIdProvider(ZkClient client,long maxMachineId){
        this.zkClient = client;
        this.maxMachineId = maxMachineId;
    }

    public void init(){
        zkClient.init();
        zkClient.registryConnectionStatListener(new ConnectionStateListener() {
            @Override
            public void stateChanged(CuratorFramework curatorFramework, ConnectionState connectionState) {
                if(connectionState == ConnectionState.RECONNECTED){
                    try{
                        determineMachineId();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        });
    }

    public void destroy(){
        zkClient.close();
    }

    private long determineMachineId(String path) {
        /**
         * 如果SEQ_PREFIX下的节点数超过了maxMachineId,获取SEQ_PREFIX下的节点数，如果超过了maxMachineId,异常
         * 如果没有超过，这里先删除SEQ_PREFIX下的所有节点，通过订阅事件重新获取到machineId,
         * 或者选出一个没有的节点序号，重新创建节点---这样影响貌似最小
         */
        //获取所有子节点
        int retryTimes = 3;
        long id = -1;
        while(retryTimes-->0){
            try {
                List<String> childList = zkClient.getChildren(ZK_GLOBAL_MACHINE_ID_PREFIX);
                if(childList.size()>=maxMachineId){
                    throw new RuntimeException("cannot add new machine");
                }
                List<Long> machineIdList = new ArrayList<Long>(childList.size());
                for(String str : childList){
                    String n = str.substring(path.length());
                    machineIdList.add(Long.valueOf(n));
                }
                Collections.sort(machineIdList);

                //找到第一个不连续的起始id，o(n)
                id = findDiscontinuousId(machineIdList);
                if(-1 == id){
                    throw new RuntimeException("can not add new machine");
                }
                id = id+1;
                //format
                String pat = path+_10.format(id);
                zkClient.createEphemeralPath(pat);//创建临时节点,可能会有竞争，这里尝试3次
            }catch (Exception e){
                if(retryTimes == 0){
                    throw new RuntimeException(e);
                }
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return id;
    }

    private long determineMachineId() {
        if(!zkClient.exists(ZK_GLOBAL_MACHINE_ID_PREFIX)){
            try {
                zkClient.createPath(ZK_GLOBAL_MACHINE_ID_PREFIX);
            }catch (Exception e){
                if(e instanceof RuntimeException){
                    Throwable throwable = e.getCause();
                    if(!(throwable instanceof KeeperException.NodeExistsException)){
                        throw (RuntimeException)e;
                    }
                }else{
                    throw new RuntimeException(e);
                }

            }

        }
        String path = ZK_GLOBAL_MACHINE_ID_PREFIX+"/"+"machine";
        String name = zkClient.createEphemeralSequencePath(path);
        String machine = name.substring(path.length());
        Long machineid = Long.valueOf(machine);
        if(machineid>=maxMachineId){
            long id = determineMachineId(path);
            if(-1 == id){
                throw new RuntimeException("cannot get machine id");
            }
            machineid = id;

        }
        return machineid;
    }

    private long findDiscontinuousId(List<Long> machineIdList) {
        for(int i=1;i<machineIdList.size();i++){
            long pre = machineIdList.get(i-1);
            long cur = machineIdList.get(i);
            if(cur-pre>1){
                return pre;
            }
        }
        return -1l;
    }

    @Override
    public long getMachineId() {
        return determineMachineId();
    }

    public void setZkClient(ZkClient zkClient) {
        this.zkClient = zkClient;
    }

    public void setMaxMachineId(long maxMachineId) {
        this.maxMachineId = maxMachineId;
    }
}
