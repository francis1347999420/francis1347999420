package com.ysliu.learn.controller;

import com.ysliu.learn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/hello")
public class HelloController {



    @PostMapping("")
    public String postIndex(String name) {
        return "post:hello,".concat(name);
    }

    @GetMapping("")
    public String getIndex(String name){
        return "get:hello,".concat(name);
    }


}
