package com.ysliu.learn.service.impl;

import com.ysliu.learn.service.ThreadService;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ThreadServiceImpl implements ThreadService {
    static volatile int flag = -1;
    static AtomicInteger NUM = new AtomicInteger(100);
    static CountDownLatch COL = new CountDownLatch(100);
    @Override
    public void printOneHan() {
        for (int i = 0; i < 101; i++) {
            int finalI = i;
            new Thread(() -> {
                while (true){
                    if(flag == finalI - 1){
                        System.out.println(Thread.currentThread().getName() + "处理:" + NUM.getAndIncrement());
                        flag = finalI;
                        break;
                    }
                }
            }, "t" + i).start();
        }

    }

    @Override
    public void printOneHan2() {
        for (int i = 100; i < 201; i++) {
            int finalI = i;
            new Thread(() -> {
                while (true){
                    if(finalI == 200 - COL.getCount()){
                        System.out.println(Thread.currentThread().getName() + "处理:" + finalI);
                        COL.countDown();
                        break;
                    }
                }
            }, "t" + i).start();
        }
    }
}
