package com.bimo;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static boolean Game24Points (int[] arr) {
        // write code here
        char[] ways = {'+', '-', '*', '/'};
        Arrays.sort(arr);
        HashMap<Character, Character> maps = new HashMap<Character, Character>();
        maps.put('}', '{');
        maps.put(']', '[');
        maps.put(')', '(');
        return true;
    }
    public static void main(String[] args) {
        Game24Points(new int[]{7, 2, 1, 10});
    }
}
