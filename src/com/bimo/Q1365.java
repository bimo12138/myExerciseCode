package com.bimo;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Q1365
 * @Author: 13716
 * @Date: 2020/8/30 11:17
 * @Version: 1.0
 **/


public class Q1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) res[i]++;
            }
        }
        return res;
    }
}
