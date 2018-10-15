package com.tddl.main;

import com.taobao.tddl.client.sequence.impl.GlobalSequence;
import com.taobao.tddl.conf.client.ZkClient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class SequenceMain {

    public static void main(String[] args){
        final GlobalSequence globalSequence = new GlobalSequence(4l,9l,4l,6l);
        //testWithLocalProvider(globalSequence);
        testWithZkProvider(globalSequence);
    }

    private static void testWithZkProvider(final GlobalSequence globalSequence) {
        final ZookeeperMachineIdProvider zookeeperMachineIdProvider = new ZookeeperMachineIdProvider(new ZkClient(),512);
        zookeeperMachineIdProvider.init();
        final long businessId = 1l;//实际使用中应可配置
        //10000个线程访问同一个sequence,单机测试资源有限
        int size = 10000;
        int loop = 10;
        int count = loop;
        long cost = 0;
        final long machineId = zookeeperMachineIdProvider.getMachineId();
        while (loop-->0){
            List<Thread> threads = new ArrayList<Thread>(size);
            final CountDownLatch latch = new CountDownLatch(size);
            final ConcurrentHashMap<Long,Long> idSet = new ConcurrentHashMap<Long,Long>();
            for(int i=0;i<size;i++){
                Thread t = new Thread("thread-"+loop+"-"+i){
                    @Override
                    public void run() {
                        try{
                            long id = globalSequence.nextValue(businessId,machineId);
                            System.out.println("generate id:"+id);
                            idSet.put(id,id);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        latch.countDown();
                    }
                };
                threads.add(t);
            }
            long start = System.currentTimeMillis();
            for(Thread t:threads){
                t.start();
            }
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            cost+=(end-start);

            if(idSet.size() != size){
                throw new RuntimeException("error");
            }
        }
        //获取size个id需要花多长时间
        System.out.println("loop "+count+" total cost:"+cost+",avg="+(cost/(double)count));
        zookeeperMachineIdProvider.destroy();
    }

    private static void testWithLocalProvider(final GlobalSequence globalSequence) {

        final LocalMachineIdProvider provider = new LocalMachineIdProvider();
        final long businessId = 1l;//实际使用中应可配置
        final long machineId = provider.getMachineId();

        //10000个线程访问同一个sequence,单机测试资源有限
        int size = 10000;
        int loop = 10;
        int count = loop;
        long cost = 0;
        while (loop-->0){
            List<Thread> threads = new ArrayList<Thread>(size);
            final CountDownLatch latch = new CountDownLatch(size);
            final ConcurrentHashMap<Long,Long> idSet = new ConcurrentHashMap<Long,Long>();
            for(int i=0;i<size;i++){
                Thread t = new Thread("thread-"+loop+"-"+i){
                    @Override
                    public void run() {
                        try{
                            long id = globalSequence.nextValue(businessId,machineId);
                            System.out.println("generate id:"+id);
                            idSet.put(id,id);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        latch.countDown();
                    }
                };
                threads.add(t);
            }
            long start = System.currentTimeMillis();
            for(Thread t:threads){
                t.start();
            }
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            cost+=(end-start);

            if(idSet.size() != size){
                throw new RuntimeException("error");
            }
        }
        //获取size个id需要花多长时间
        System.out.println("loop "+count+" total cost:"+cost+",avg="+(cost/(double)count));
    }
}
