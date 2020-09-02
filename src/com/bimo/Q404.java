package com.bimo;

/**
 * @ClassName: Q404
 * @Author: 13716
 * @Date: 2020/8/29 10:26
 * @Version: 1.0
 **/


public class Q404 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
