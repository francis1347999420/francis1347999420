package com.ysliu.learn.service.impl;

import com.ysliu.learn.config.MyBeanConfig;
import com.ysliu.learn.form.ListNode;
import com.ysliu.learn.service.TestService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> getListJdbc() {
        String sql = "select * from test";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key + ":" + value);
            }
        }
        return list;
    }

    @Override
    public void myBean() {
        AnnotationConfigApplicationContext myBeanConfig = new AnnotationConfigApplicationContext(MyBeanConfig.class);
        myBeanConfig.getBean("myBean");
    }



}
