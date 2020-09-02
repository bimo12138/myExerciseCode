package com.bimo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Q589
 * @Author: 13716
 * @Date: 2020/8/28 10:12
 * @Version: 1.0
 **/


public class Q589 {
    public List<Integer> preorder(Node root) {
//        LinkedList<Node> linkedList = new LinkedList<>();
//        LinkedList<Integer> integers = new LinkedList<>();
//        if (root == null) return integers;
//        linkedList.add(root);
//        while(! linkedList.isEmpty()) {
//            Node node = linkedList.pollLast();
//            integers.add(node.val);
//            Collections.reverse(node.children);
//            for (Node child : node.children) {
//                integers.add(child);
//            }
//        }
//        return integers;
        LinkedList<Integer> integers = new LinkedList<>();
        if (root == null) {
            return null;
        } else {
            integers.add(root.val);
            for (Node child : root.children) {
                preorder(child);
            }
        }
        return integers;
    }
}
