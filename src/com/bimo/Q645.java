package com.bimo;

/**
 * @ClassName: Q645
 * @Author: 13716
 * @Date: 2020/8/27 11:04
 * @Version: 1.0
 **/


public class Q645 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[nums.length];
        int err = -1;
        int need_correct = -1;
        for (int i = 0; i < nums.length; i++) {
            if (res[nums[i]] == 0) res[nums[i]] ++;
            else err = nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                need_correct = i;
            }
        }
        return new int[] {err, need_correct};
    }
}
