package com.bimo;

/**
 * @ClassName: Q1217
 * @Author: 13716
 * @Date: 2020/9/1 10:40
 * @Version: 1.0
 **/


public class Q1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) even++;
            else odd++;
        }
        return Math.min(odd, even);
    }
}
