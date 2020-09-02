package com.bimo;

/**
 * @ClassName: Q1704
 * @Author: 13716
 * @Date: 2020/8/27 13:17
 * @Version: 1.0
 **/


public class Q1704 {
    public int missingNumber(int[] nums) {
        int res = 0;
        /**
         * 原理：
         * A ^ A = 0
         * 0 ^ A = A
         * A ^ C ^ B = A ^ ( B ^ C)
         */
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        res ^= nums.length;
        return res;
    }
}
