package com.bimo;

/**
 * @ClassName: Q657
 * @Author: 13716
 * @Date: 2020/8/28 9:03
 * @Version: 1.0
 **/


public class Q657 {
    public boolean judgeCircle(String moves) {
        int ho = 0;
        int ve = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') ve++;
            else if (moves.charAt(i) == 'D') ve--;
            else if (moves.charAt(i) == 'L') ho--;
            else ho++;
        }
        return ho == 0 && ve == 0;
    }
}
