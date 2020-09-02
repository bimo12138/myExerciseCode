package com.bimo;

/**
 * @ClassName: Q214
 * @Author: 13716
 * @Date: 2020/8/29 10:00
 * @Version: 1.0
 **/


public class Q214 {
    /***
     * 还需要阅读啊，TODO 不会啊
     * @param s
     * @return
     */
    public String shortestPalindrome(String s) {
        int n = s.length();
        int base = 131, mod = 1000000007;
        int left = 0, right = 0, mul = 1;
        int best = -1;
        for (int i = 0; i < n; ++i) {
            left = (int) (((long) left * base + s.charAt(i)) % mod);
            right = (int) ((right + (long) mul * s.charAt(i)) % mod);
            if (left == right) {
                best = i;
            }
            mul = (int) ((long) mul * base % mod);
        }
        String add = (best == n - 1 ? "" : s.substring(best + 1));
        StringBuffer ans = new StringBuffer(add).reverse();
        ans.append(s);
        return ans.toString();
    }

    public static void main(String[] args) {
        Q214 q214 = new Q214();
        System.out.println(q214.shortestPalindrome("aacecaaa"));
    }
}
