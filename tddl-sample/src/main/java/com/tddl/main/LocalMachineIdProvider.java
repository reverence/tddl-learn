package com.tddl.main;

import com.tddl.main.constants.Constants;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 可以通过在不同的机器特定路径配置machineId,然后通过读取本地路径获取machineId,个人认为比zk的方式更可靠，缺点在于如果需要加机器的时候，运维得记得配置好
 */
public class LocalMachineIdProvider implements MachineIdProvider {

    private static Long machineId;

    //读取本地文件
    static {
        try{
            FileInputStream inputStream = new FileInputStream(Constants.MACHINE_ID_LOCAL_CONFIG_PATH);
            Properties p = new Properties();
            p.load(inputStream);
            machineId = Long.parseLong(p.getProperty("machineId"));
            inputStream.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public long getMachineId() {
        return machineId;
    }
}
