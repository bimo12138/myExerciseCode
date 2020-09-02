package com.bimo;

/**
 * @ClassName: Q1370
 * @Author: 13716
 * @Date: 2020/8/26 10:50
 * @Version: 1.0
 **/


public class Q1370 {
    public static String sortString(String s) {
        if(s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int[] arrays = new int[26];
        int flag = 0;

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            arrays[chars[i] - 'a'] ++;
            flag ++;
        }
        while(true) {
            if (flag == 0) break;
            for (int i = 0; i < 26; i++) {
                if (arrays[i] <= 0) {
                    continue;
                }
                res.append((char) (i + 'a'));
                arrays[i] --;
                flag -= 1;
            }
            for (int i = 25; i >= 0 ; i++) {
                if (arrays[i] <= 0) {
                    continue;
                }
                res.append((char) (i + 'a'));
                arrays[i] --;
                flag -= 1;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
