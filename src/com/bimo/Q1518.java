package com.bimo;

/**
 * @ClassName: Q1518
 * @Author: 13716
 * @Date: 2020/9/1 10:50
 * @Version: 1.0
 **/


public class Q1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        int other = numBottles;
        while(other >= numExchange) {
            // 可换数量
            int num = numBottles / numExchange;
            // 换总量
            int sum = numExchange * num;
            // 喝了的
            count += sum;
            // 剩下的
            other = other - sum + num;

        }
        return count;
    }
}
