package com.ysliu.learn.service.impl;

import com.ysliu.learn.service.BaseJavaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * java基础
 *
 * @author ysliu
 * @since 2021/12/14
 */
@SpringBootTest
public class BaseJavaServiceImplTest {
    @Autowired
    private BaseJavaService baseJavaService;

    @Test
    public void testHash(){
        baseJavaService.hashTest();
    }

    @Test
    public void testException(){
        baseJavaService.exceptionTest();
    }
}
