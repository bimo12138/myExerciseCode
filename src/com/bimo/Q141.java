package com.bimo;

/**
 * @ClassName: Q141
 * @Author: 13716
 * @Date: 2020/9/2 9:13
 * @Version: 1.0
 **/


public class Q141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
