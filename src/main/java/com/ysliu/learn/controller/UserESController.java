package com.ysliu.learn.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ysliu.learn.entity.User;
import com.ysliu.learn.entity.UserES;
import com.ysliu.learn.service.UserESService;
import com.ysliu.learn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ysliu
 * @since 2021-12-02
 */
@Slf4j
@RestController
@RequestMapping("api/v1/user-es")
public class UserESController {

    @Autowired
    private UserESService userESService;

    @PostMapping("/save")
    public String save(@RequestBody UserES user) {
        long id = System.currentTimeMillis();
        user.setId(id);
        userESService.save(user);
        return "新增成功,id为：" + id;
    }

    @PostMapping("/update")
    public String update(@RequestBody UserES user) {
        userESService.save(user);
        return "修改成功";
    }

    @GetMapping("/{id}")
    public UserES getById(@PathVariable("id") Long id) throws InterruptedException {
        log.info("Thread启动,{}",Thread.currentThread().getName());
        UserES userES = userESService.getById(id);
        log.info("Thread完成,{}", Thread.currentThread().getName());
        return userES;
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        userESService.deleteById(id);
        return "删除成功";
    }
}
