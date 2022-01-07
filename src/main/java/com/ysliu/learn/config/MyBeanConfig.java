package com.ysliu.learn.config;

import com.ysliu.learn.form.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试bean
 *
 * @author ysliu
 * @since 2021/12/3
 */
@Configuration
public class MyBeanConfig {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
