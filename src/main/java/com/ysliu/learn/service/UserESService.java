package com.ysliu.learn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ysliu.learn.entity.User;
import com.ysliu.learn.entity.UserES;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ysliu
 * @since 2021-12-02
 */
public interface UserESService {
    void save(UserES user);

    UserES getById(Long id);

    void deleteById(Long id);

}
