package com.tddl.main.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.tddl.main.dto.UserOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserOrderDao {

    @Autowired
    @Qualifier("sqlMapClient")
    private SqlMapClient sqlMapClient;

    public void insert(UserOrderDto dto){
        try {
            sqlMapClient.insert("USER_ORDER.insert",dto);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public UserOrderDto findByUserId(Long userId){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("userId",userId);
        try {
            return (UserOrderDto)sqlMapClient.queryForObject("USER_ORDER.selectByUserId",params);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
