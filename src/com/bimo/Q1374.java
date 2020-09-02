package com.bimo;

/**
 * @ClassName: Q1374
 * @Author: 13716
 * @Date: 2020/8/26 11:37
 * @Version: 1.0
 **/


public class Q1374 {
    public String generateTheString(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                stringBuffer.append("a");
            }
            stringBuffer.append("b");
        } else {
            for (int i = 0; i < n; i++) {
                stringBuffer.append("a");
            }
        }
        return stringBuffer.toString();
    }
}
