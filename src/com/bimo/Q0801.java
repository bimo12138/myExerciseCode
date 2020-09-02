package com.bimo;

/**
 * @ClassName: Q0801
 * @Author: 13716
 * @Date: 2020/8/25 10:15
 * @Version: 1.0
 **/


public class Q0801 {

    public static int waysToStep(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] + dp[i - 3]) % 1000000007) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int a = waysToStep(61);
        System.out.println(a);
    }
}
