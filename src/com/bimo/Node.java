package com.bimo;

import java.util.List;

/**
 * @ClassName: Node
 * @Author: 13716
 * @Date: 2020/8/28 10:10
 * @Version: 1.0
 **/


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
