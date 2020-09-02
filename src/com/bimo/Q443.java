package com.bimo;

/**
 * @ClassName: Q443
 * @Author: 13716
 * @Date: 2020/8/26 15:23
 * @Version: 1.0
 **/


public class Q443 {
    public static int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b', 'c', 'c', 'c'});
    }
}
