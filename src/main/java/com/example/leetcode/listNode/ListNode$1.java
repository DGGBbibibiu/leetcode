package com.example.leetcode.listNode;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc
 * @date 2020/12/25 10:26
 */
public class ListNode$1 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
