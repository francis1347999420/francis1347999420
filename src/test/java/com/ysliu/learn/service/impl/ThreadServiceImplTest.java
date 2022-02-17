package com.ysliu.learn.service.impl;

import com.ysliu.learn.service.ThreadService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ThreadServiceImplTest {
    @Autowired
    public ThreadService threadService;
    @Test
    public void printOneHan(){
        threadService.printOneHan();
    }

    @Test
    public void printOneHan2(){
        threadService.printOneHan2();
    }

}
