package com.bimo;

/**
 * @ClassName: Q198
 * @Author: 13716
 * @Date: 2020/8/25 10:52
 * @Version: 1.0
 **/


public class Q198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int left = nums[0], right = Math.max(nums[0], nums[1]);

        for (int i = 2; i < length; i++) {
            int temp = right;
            right = Math.max(left + nums[i], right);
            left = temp;
        }
        return right;
    }
}
