package com.ysliu.learn.service;

import com.ysliu.learn.form.ListNode;

/**
 * leetCode
 *
 * @author ysliu
 * @since 2022/1/6
 */
public interface LeetCodeService {
    int[] twoSum(int[] nums,int target);

    int[] twoSumSmall(int[] nums,int target);

    ListNode addTwoNumbers(ListNode l1, ListNode l2);

    ListNode addTwoNumbers2(ListNode l1, ListNode l2);

    int lengthOfLongestSubstring(String s);

    int lengthOfLongestSubstring2(String s);
}
