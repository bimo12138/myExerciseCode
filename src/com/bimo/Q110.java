package com.bimo;


/**
 * @ClassName: Q110
 * @Author: 13716
 * @Date: 2020/8/28 9:35
 * @Version: 1.0
 **/


public class Q110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
