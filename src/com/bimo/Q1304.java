package com.bimo;

import java.util.Random;

/**
 * @ClassName: Q1304
 * @Author: 13716
 * @Date: 2020/8/24 19:48
 * @Version: 1.0
 **/


public class Q1304 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int flag = 0;
        if (n % 2 != 0) {
            res[flag++] = 0;
        }
        for(int i = 0; i < n / 2; i ++) {
            res[flag++] = i + 1;
            res[flag++] = - (i + 1);
        }
        return res;
    }
}
