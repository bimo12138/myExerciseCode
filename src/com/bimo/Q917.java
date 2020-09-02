package com.bimo;

import java.util.Stack;

/**
 * @ClassName: Q917
 * @Author: 13716
 * @Date: 2020/8/26 14:02
 * @Version: 1.0
 **/


public class Q917 {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c)) {
                res.append(letters.pop());
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
