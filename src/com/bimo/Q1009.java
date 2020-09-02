package com.bimo;

/**
 * @ClassName: Q1009
 * @Author: 13716
 * @Date: 2020/8/27 10:30
 * @Version: 1.0
 **/


public class Q1009 {
    public int bitwiseComplement(int N) {
        int count = 0;
        for (int i = N; i > 0;) {
            count++;
            i = i >> 1;
        }
        int right = (int) (Math.pow(2, count) - 1);
        return right ^ N;
    }

    public static void main(String[] args) {
        Q1009 q1009 = new Q1009();
        System.out.println(q1009.bitwiseComplement(7));
    }
}
