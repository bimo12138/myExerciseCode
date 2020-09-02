package com.bimo;

/**
 * @ClassName: Q202
 * @Author: 13716
 * @Date: 2020/9/2 12:13
 * @Version: 1.0
 **/


public class Q202 {
    public int kthToLast(ListNode head, int k) {
        if (head == null || head.next == null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
