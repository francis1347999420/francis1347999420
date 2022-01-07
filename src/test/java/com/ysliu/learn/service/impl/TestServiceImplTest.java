package com.ysliu.learn.service.impl;

import com.ysliu.learn.form.ListNode;
import com.ysliu.learn.service.LeetCodeService;
import com.ysliu.learn.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestServiceImplTest {

    @Resource
    private LeetCodeService testService;

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = testService.twoSum(nums,target);
        for(int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void twoSumSmall() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = testService.twoSumSmall(nums,target);
        for(int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void addTwoNumbers(){
        ListNode l11 = new ListNode();
        l11.setVal(2);
        ListNode l12 = new ListNode();
        l12.setVal(4);
        l11.setNext(l12);
        ListNode l13 = new ListNode();
        l13.setVal(3);
        l12.setNext(l13);

        ListNode l21 = new ListNode();
        l21.setVal(5);
        ListNode l22 = new ListNode();
        l22.setVal(6);
        l21.setNext(l22);
        ListNode l23 = new ListNode();
        l23.setVal(8);
        l22.setNext(l23);
        testService.addTwoNumbers(l11,l21);
    }

    @Test
    public void lengthOfLongestSubstring(){
        System.out.println(testService.lengthOfLongestSubstring("pwwkewww"));
    }
}
