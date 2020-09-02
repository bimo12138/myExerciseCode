package com.bimo;

/**
 * @ClassName: Q108
 * @Author: 13716
 * @Date: 2020/8/29 11:46
 * @Version: 1.0
 **/


public class Q108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(0);
        int left = 0;
        int right = nums.length - 1;
        getNum(nums, left, right, root.right);
        return root.right;
    }
    public void getNum(int[] nums, int left, int right, TreeNode root) {
        if (left > right) return ;
        int mid = (right + left) / 2;
        root.val = nums[mid];
        getNum(nums, left, mid - 1, root.left);
        getNum(nums, mid, right, root.right);
    }

    public static void main(String[] args) {
        Q108 q108 = new Q108();
        q108.sortedArrayToBST(new int[] {-10,-3,0,5,9});
    }
}
