package com.bimo;

/**
 * @ClassName: Q453
 * @Author: 13716
 * @Date: 2020/8/27 10:46
 * @Version: 1.0
 **/


public class Q453 {
    public int minMoves(int[] nums) {
        int flag = 0;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min) {
                flag += (nums[i] - min);
            }
        }
        return flag;
    }
}
