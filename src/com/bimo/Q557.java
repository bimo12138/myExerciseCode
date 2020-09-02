package com.bimo;

/**
 * @ClassName: Q557
 * @Author: 13716
 * @Date: 2020/8/30 9:30
 * @Version: 1.0
 **/


public class Q557 {

/*  传统的 split

    public String reverseWords(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(reverseWord(words[i]));
            if (i != words.length - 1) res.append(" ");
        }
        return res.toString();
    }
    private String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0 ; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
*/
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        if (s.length() == 0) {
            return s;
        }
        int i = 0;
        while(i < s.length()) {
            int start = 0;
            while(i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            for (int j = start + i; j > start; j--) {
                res.append(s.charAt(j));
            }
            while(i < s.length() && s.charAt(i) == ' ') {
                i ++;
                res.append(" ");
            }
        }
        return res.toString();
    }

}
