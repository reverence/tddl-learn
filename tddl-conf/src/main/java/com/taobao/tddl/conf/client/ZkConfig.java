package com.taobao.tddl.conf.client;

import org.apache.curator.framework.recipes.cache.NodeCacheListener;

public class ZkConfig {

    public static void registryListener(ZkClient zkClient, ZkNodeCahce nodeCache, NodeCacheListener dbWeightChangeListener) {
        nodeCache.setZkClient(zkClient);
        ensurePathExists(zkClient,nodeCache.getPath());
        nodeCache.init();
        nodeCache.addListener(dbWeightChangeListener);
    }

    private static void ensurePathExists(ZkClient zkClient, String path) {
        if(!zkClient.exists(path)){
            zkClient.createPath(path);
        }
    }
}
