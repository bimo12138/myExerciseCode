package com.bimo;

import java.util.Arrays;

/**
 * @ClassName: Q345
 * @Author: 13716
 * @Date: 2020/9/2 11:38
 * @Version: 1.0
 **/


public class Q345 {
    private final char[] checked = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] raw = s.toCharArray();
        while(left < right) {
            while(left < raw.length && !isY(raw[left]) ) left++;
            while(right >= 0 && !isY(raw[right])) right--;
            if (left < right) {
                char temp = raw[left];
                raw[left] = raw[right];
                raw[right] = temp;
            }
            left++;
            right--;
        }
        return new String(raw);
    }

    public boolean isY(char raw) {

        for (int i = 0; i < checked.length; i++) {
            if (checked[i] == raw) return true;
        }
        return false;
    }
}
