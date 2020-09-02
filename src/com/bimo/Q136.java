package com.bimo;

/**
 * @ClassName: Q136
 * @Author: 13716
 * @Date: 2020/8/30 11:56
 * @Version: 1.0
 **/


public class Q136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
