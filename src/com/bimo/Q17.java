package com.bimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Q17
 * @Author: 13716
 * @Date: 2020/8/26 9:51
 * @Version: 1.0
 **/


public class Q17 {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backTrack(res, map, digits, 0, new StringBuffer());
        return res;
    }

    public static void backTrack(List<String> res, Map<Character, String> map,
                          String digits, int index, StringBuffer stringBuffer) {
        if (index == digits.length()) {
            res.add(stringBuffer.toString());
        } else {
            char digit = digits.charAt(index);
            String flag = map.get(digit);
            int lettersCount = flag.length();
            for (int i = 0; i < lettersCount; i++) {
                stringBuffer.append(flag.charAt(i));
                backTrack(res, map, digits, index + 1, stringBuffer);
                stringBuffer.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
}
