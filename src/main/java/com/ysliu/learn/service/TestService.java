package com.ysliu.learn.service;

import com.ysliu.learn.form.ListNode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface TestService {
    List<Map<String,Object>> getListJdbc();

    void myBean();


}
