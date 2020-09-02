package com.bimo;

import java.util.*;

public class Solution {
    /**
     *
     * @param N int整型
     * @return int整型
     */
    public boolean IsValidExp (String s) {
        if (s.length() == 0) {
            return true;
        }
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                case '(':
                case '[':
                    stack.add(String.valueOf(s.charAt(i)));
                    break;
                case '}':
                    if (stack.isEmpty()) {return false;}
                    if (stack.peek().equals("{")) { stack.pop(); break; }
                    else { return false; }
                case ')':
                    if (stack.isEmpty()) {return false;}
                    if (stack.peek().equals("(")) { stack.pop(); break; }
                    else { return false; }
                case ']':
                    if (stack.isEmpty()) {return false;}
                    if (stack.peek().equals("[")) { stack.pop(); break; }
                    else { return false; }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(666);
    }
}