package com.ysliu.learn.service.impl;

import com.ysliu.learn.service.BaseJavaService;
import org.springframework.stereotype.Service;

/**
 * java 基础
 *
 * @author ysliu
 * @since 2021/12/14
 */
@Service
public class BaseJavaServiceImpl implements BaseJavaService {
    @Override
    public void hashTest() {
        System.out.println("hello的hash:".concat(String.valueOf("hello".hashCode())));
    }

    @Override
    public void exceptionTest() {
        Integer i = 0;
        Integer j = 89;
        try {
            int i1 = j / i;
        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
        }
        catch (RuntimeException exception) {
            exception.printStackTrace();
        }
        finally {

        }
    }
}
