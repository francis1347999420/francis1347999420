package com.ysliu.learn.service.impl;

import com.ysliu.learn.entity.User;
import com.ysliu.learn.mapper.UserMapper;
import com.ysliu.learn.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysliu
 * @since 2021-12-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
