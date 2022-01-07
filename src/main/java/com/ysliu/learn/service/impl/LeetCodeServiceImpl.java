package com.ysliu.learn.service.impl;

import com.ysliu.learn.form.ListNode;
import com.ysliu.learn.service.LeetCodeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCodeService
 *
 * @author ysliu
 * @since 2022/1/6
 */
@Service
public class LeetCodeServiceImpl implements LeetCodeService {
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i=" + i);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("j=" + j);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    @Override
    public int[] twoSumSmall(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[]{map.get(j), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = 0;
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        merge(l1, num1);
        System.out.println("num1=" + num1);
        merge(l2, num2);
        System.out.println("num2=" + num2);
        int length = Math.max(num1.size(), num2.size());
        System.out.println("length = " + length);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int temp = plus;
            if (num1.size() > i) {
                temp = temp + num1.get(i);
            }
            if (num2.size() > i) {
                temp = temp + num2.get(i);
            }
            if (temp > 9) {
                temp = temp - 10;
                plus = 1;
            } else {
                plus = 0;
            }
            System.out.println("temp=" + temp);
            result.add(temp);
        }
        if (plus > 0) {
            result.add(plus);
        }
        System.out.println(result);
        // list to listNode
        ListNode resultNode = null;
        ListNode other = resultNode;
        for (int i = 1; i < result.size(); i++) {
            ListNode temp = new ListNode(result.get(i));
            other = new ListNode(result.get(i - 1), temp);
            other = temp;
        }
        return resultNode;
    }

    private void merge(ListNode l, List<Integer> num) {
        num.add(l.getVal());
        if (l.getNext() != null) {
            merge(l.getNext(), num);
        }
    }

    @Override
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    @Override
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder(String.valueOf(s.charAt(i)));
            int temp_l = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (!temp.toString().contains(String.valueOf(s.charAt(j)))) {
                    temp_l = temp_l + 1;
                    temp.append(s.charAt(j));
                } else {
                    break;
                }
            }
            if (temp_l > l) {
                l = temp_l;
            }
        }
        return l;
    }

    @Override
    public int lengthOfLongestSubstring2(String s) {
        Integer[] chars = new Integer[128];
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            Integer index = chars[r];
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }
            res = Math.max(res, right - left + 1);
            chars[r] = right;
            right++;
        }
        return res;
    }
}
