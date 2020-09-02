package com.bimo;

/**
 * @ClassName: Q1716
 * @Author: 13716
 * @Date: 2020/8/25 11:38
 * @Version: 1.0
 **/


public class Q1716 {
    public int massage(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int left = nums[0], right = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = right;
            right = Math.max(left + nums[i], right);
            left = temp;
        }
        return Math.max(left, right);
    }
}
