package com.ysliu.learn.service.impl;

import com.ysliu.learn.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试
 *
 * @author ysliu
 * @since 2021/12/8
 */
@SpringBootTest
public class EmailServiceImplTest {

    @Autowired
    private EmailService emailService;

    @Test
    public void sendSimpleMail(){
        emailService.sendSimpleMail();
    }
}
