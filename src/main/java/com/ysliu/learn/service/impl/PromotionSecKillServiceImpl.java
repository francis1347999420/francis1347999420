package com.ysliu.learn.service.impl;

import com.ysliu.learn.exception.PromotionException;
import com.ysliu.learn.service.PromotionSecKillService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class PromotionSecKillServiceImpl implements PromotionSecKillService {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

//    @Override
//    public void processSecKill(Long psId, String userId, Integer num) throws PromotionException {
//        String s = redisTemplate.opsForList().leftPop("seckill:count:" + psId);
//        if (!StringUtils.isEmpty(s)) {
//            if (!redisTemplate.opsForSet().isMember("seckill:user:" + psId, userId)) {
//                redisTemplate.opsForSet().add("seckill:user:" + psId, userId);
//                System.out.println("恭喜" + userId + "，抢购成功");
//            } else {
//                redisTemplate.opsForList().rightPush("seckill:count:" + psId, "6666-goodsId");
//                System.out.println("抱歉" + userId + "，不能重复参加活动");
//                throw new PromotionException("抱歉，不能重复参加活动");
//            }
//        } else {
//            System.out.println("抱歉" + userId + "，已抢完");
//            throw new PromotionException("抱歉，已抢完");
//        }
//    }

    @Override
    public void processSecKill(Long psId, String userId, Integer num) throws PromotionException {
        if (!redisTemplate.opsForSet().isMember("seckill:user:" + psId, userId)) {
            String s = redisTemplate.opsForList().leftPop("seckill:count:" + psId);
            if (!StringUtils.isEmpty(s)) {
                redisTemplate.opsForSet().add("seckill:user:" + psId, userId);
                System.out.println("恭喜" + userId + "，抢购成功");
            } else {
                System.out.println("抱歉" + userId + "，已抢完");
                throw new PromotionException("抱歉，已抢完");
            }
        } else {
            System.out.println("抱歉" + userId + "，不能重复参加活动");
            throw new PromotionException("抱歉，不能重复参加活动");
        }
    }
}
