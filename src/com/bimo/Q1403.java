package com.bimo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Q1403
 * @Author: 13716
 * @Date: 2020/9/1 10:14
 * @Version: 1.0
 **/


public class Q1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            total += nums[i];
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (total < sum) return res;
            total -= nums[i];
            res.add(nums[i]);
            sum += nums[i];
        }
        return res;
    }
}
