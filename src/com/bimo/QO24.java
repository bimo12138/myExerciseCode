package com.bimo;

/**
 * @ClassName: QO24
 * @Author: 13716
 * @Date: 2020/9/1 11:02
 * @Version: 1.0
 **/


public class QO24 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
