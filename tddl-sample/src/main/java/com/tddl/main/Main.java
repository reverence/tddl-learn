package com.tddl.main;

import com.google.gson.Gson;
import com.taobao.tddl.client.sequence.impl.ShardingSequence;
import com.tddl.main.dao.UserOrderDao;
import com.tddl.main.dto.UserOrderDto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserOrderDao dao = (UserOrderDao)context.getBean(UserOrderDao.class);

        UserOrderDto dto = new UserOrderDto();
        dto.setCreatedAt(new Date());
        dto.setOrderContent("test");
        dto.setUserId(125l);//落到00库,01表

        ShardingSequence sequence = (ShardingSequence)context.getBean("orderSequence");
        Long id = sequence.nextValue(dto.getUserId());

        dto.setId(id);

        dao.insert(dto);

        dto = dao.findByUserId(dto.getUserId());
        System.out.println(new Gson().toJson(dto));
    }
}
