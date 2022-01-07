package com.ysliu.learn.form;

import lombok.Data;

/**
 * listNode
 *
 * @author ysliu
 * @since 2021/12/3
 */
@Data
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){

    }

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
