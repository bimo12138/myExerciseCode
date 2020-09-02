package com.bimo;

/**
 * @ClassName: Q746
 * @Author: 13716
 * @Date: 2020/8/25 11:17
 * @Version: 1.0
 **/


public class Q746 {
    public int minCostClimbingStairs(int[] cost) {
        int left = 0, right = 0;
        for (int i = 0; i < cost.length; i++) {

            int fo = cost[i] + Math.min(left, right);
//            right = left;
//            left = fo;
            left = right;
            right = fo;
        }
        return Math.min(left, right);
    }
}
