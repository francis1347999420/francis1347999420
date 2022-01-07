package com.ysliu.learn.service.impl;

import com.ysliu.learn.dao.UserESDao;
import com.ysliu.learn.entity.UserES;
import com.ysliu.learn.service.UserESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserESServiceImpl implements UserESService {

    @Autowired
    private UserESDao userESDao;

    @Override
    public void save(UserES user) {
        userESDao.save(user);
    }

    @Override
    public UserES getById(Long id) {
        Optional<UserES> find = userESDao.findById(id);
        return find.orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        userESDao.deleteById(id);
    }
}
