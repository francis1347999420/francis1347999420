package com.ysliu.learn.controller;

import com.ysliu.learn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 学习语法
 *
 * @author ysliu
 * @since 2021/12/3
 */
@RestController
@RequestMapping(value = "api/v1/test")
public class TestLearnController {
    @Resource
    private TestService testService;

    @PostMapping("/test")
    public List<Map<String, Object>> getTestList(){
        return testService.getListJdbc();
    }

    @PostMapping("/bean")
    public void myBean(){
        testService.myBean();
    }


}
