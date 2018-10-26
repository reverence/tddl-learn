package com.taobao.tddl.conf.client;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

import java.util.List;

public class ZkClient {

    private String location="127.0.0.1:2181";//zk地址

    private int sessionTimeoutMs=60000;//会话超时时间,默认1分钟

    private int connectionTimeoutMs=3000;//连接超时时间,默认3s

    private int retryMaxRetries=5;//最大尝试次数

    private int retryBaseSleepTimeMs=1000;//重试等待时间,默认1s

    private CuratorFramework client;

    public ZkClient(){

    }

    public ZkClient location(String location){
        this.location = location;
        return this;
    }

    public ZkClient sessionTimeout(int timeout){
        this.sessionTimeoutMs = timeout;
        return this;
    }

    public ZkClient connectionTimeout(int timeout){
        this.connectionTimeoutMs = timeout;
        return this;
    }

    public ZkClient retryTimes(int times){
        this.retryMaxRetries = times;
        return this;
    }

    public ZkClient retryBaseSleepTime(int time){
        this.retryBaseSleepTimeMs = time;
        return this;
    }


    public ZkClient(String location,String filePath,int sessionTimeoutMs,int connectionTimeoutMs
            ,int retryMaxRetries,int retryBaseSleepTimeMs){
        this.location = location;
        this.sessionTimeoutMs = sessionTimeoutMs;
        this.connectionTimeoutMs = connectionTimeoutMs;
        this.retryMaxRetries = retryMaxRetries;
        this.retryBaseSleepTimeMs = retryBaseSleepTimeMs;

    }

    public void init(){
        client =  CuratorFrameworkFactory.builder()
                .connectString(location)
                .sessionTimeoutMs(sessionTimeoutMs)
                .connectionTimeoutMs(connectionTimeoutMs)
                .retryPolicy(new ExponentialBackoffRetry(retryBaseSleepTimeMs, retryMaxRetries))
                .build();
        client.start();
    }

    public void close(){
        client.close();
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSessionTimeoutMs() {
        return sessionTimeoutMs;
    }

    public void setSessionTimeoutMs(int sessionTimeoutMs) {
        this.sessionTimeoutMs = sessionTimeoutMs;
    }

    public int getConnectionTimeoutMs() {
        return connectionTimeoutMs;
    }

    public void setConnectionTimeoutMs(int connectionTimeoutMs) {
        this.connectionTimeoutMs = connectionTimeoutMs;
    }

    public int getRetryMaxRetries() {
        return retryMaxRetries;
    }

    public void setRetryMaxRetries(int retryMaxRetries) {
        this.retryMaxRetries = retryMaxRetries;
    }

    public int getRetryBaseSleepTimeMs() {
        return retryBaseSleepTimeMs;
    }

    public void setRetryBaseSleepTimeMs(int retryBaseSleepTimeMs) {
        this.retryBaseSleepTimeMs = retryBaseSleepTimeMs;
    }

    public CuratorFramework getClient() {
        return client;
    }

    public boolean exists(String path) {
        try {
            Stat stat = client.checkExists().forPath(path);
            return null != stat;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void createPath(String path) {
        try {
            client.create().creatingParentsIfNeeded().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String createEphemeralSequencePath(String path){
        try {
            String name = client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath(path);
            return name;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public List<String> getChildren(String seqPrefix) {
        try {
            List<String> list = client.getChildren().forPath(seqPrefix);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void createEphemeralPath(String pat) {
        try {
            client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(pat);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void registryConnectionStatListener(ConnectionStateListener listener){
        client.getConnectionStateListenable().addListener(listener);
    }
}
