package com.bimo;

/**
 * @ClassName: Q0106
 * @Author: 13716
 * @Date: 2020/8/26 11:18
 * @Version: 1.0
 **/


public class Q106 {
    public String compressString(String S) {
        char ch;
        ch = S.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        int temp = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == ch) {
                temp ++;
            } else {
                stringBuilder.append(ch + ""+ temp);
                ch = S.charAt(i);
                temp = 1;
            }
        }
        if (temp != 1) {
            stringBuilder.append(ch  + ""+  temp);
        }
        return stringBuilder.toString();
    }
}
