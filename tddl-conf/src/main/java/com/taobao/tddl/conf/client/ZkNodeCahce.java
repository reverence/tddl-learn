package com.taobao.tddl.conf.client;

import com.taobao.tddl.conf.client.ZkClient;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;

public class ZkNodeCahce {

    private NodeCache nodeCache;

    private ZkClient zkClient;

    private String path;

    public ZkNodeCahce(String path){
        this.path = path;
    }

    public void init(){
        nodeCache = new NodeCache(zkClient.getClient(),path);
        try {
            nodeCache.start(true);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public byte[] getData() {
        return nodeCache.getCurrentData().getData();
    }

    public NodeCache getNodeCache() {
        return nodeCache;
    }

    public void setNodeCache(NodeCache nodeCache) {
        this.nodeCache = nodeCache;
    }

    public ZkClient getZkClient() {
        return zkClient;
    }

    public void setZkClient(ZkClient zkClient) {
        this.zkClient = zkClient;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void addListener(NodeCacheListener dbWeightChangeListener) {
        nodeCache.getListenable().addListener(dbWeightChangeListener);
    }
}
