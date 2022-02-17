package com.ysliu.learn.controller;

import com.ysliu.learn.exception.PromotionException;
import com.ysliu.learn.service.PromotionSecKillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@RequestMapping(value = "api/v1/promotion")
public class PromotionController {

    @Resource
    private PromotionSecKillService promotionSecKillService;

    private static ReentrantLock lock = new ReentrantLock();

    @GetMapping("/seckill")
    public String secKill(Long psId, String userId) {
        try {
            // lock.lock();
            System.out.println("接收参数" + userId);
            promotionSecKillService.processSecKill(psId, userId, 1);
        } catch (PromotionException e) {
            return e.getMessage();
        } finally {
            // lock.unlock();
        }
        return "ok";
    }
}
