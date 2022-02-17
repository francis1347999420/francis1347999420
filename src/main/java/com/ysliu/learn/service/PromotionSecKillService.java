package com.ysliu.learn.service;

import com.ysliu.learn.exception.PromotionException;

public interface PromotionSecKillService {
    void processSecKill(Long psId, String userId, Integer num) throws PromotionException;
}
