package com.bimo;

/**
 * @ClassName: Q434
 * @Author: 13716
 * @Date: 2020/8/26 14:11
 * @Version: 1.0
 **/


public class Q434 {
    public int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        String[] res = s.split("\\s+");
        return res.length;
    }
}
