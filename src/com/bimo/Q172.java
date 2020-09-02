package com.bimo;

/**
 * @ClassName: Q172
 * @Author: 13716
 * @Date: 2020/8/27 11:13
 * @Version: 1.0
 **/


public class Q172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n / 5 != 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
