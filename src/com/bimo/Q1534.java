package com.bimo;

/**
 * @ClassName: Q1534
 * @Author: 13716
 * @Date: 2020/8/24 19:17
 * @Version: 1.0
 **/


public class Q1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int flag = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) {
                        flag ++;
                    }
                }
            }
        }
        return flag;
    }
}
