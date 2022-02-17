package com.ysliu.learn.task;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class SecKillJobs {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    private static boolean flag = false;

    @Scheduled(cron = "0/5 * * * * ? ")
    public void cornJob() {
        if (!flag) {
            flag = true;
            System.out.println(new Date() + "...>>cron执行<<...");
            // "seckill:count:活动id"
            // "seckill:user:活动id“
            for (int i = 0; i < 10; i++) {
                redisTemplate.opsForList().rightPush("seckill:count:6", "6666-goodsId");
            }
            System.out.println(new Date() + "...>>cron执行完成<<...");
        }
    }
}
