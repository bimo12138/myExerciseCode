package com.bimo;

import java.util.Scanner;

/**
 * @ClassName: Temp01
 * @Author: 13716
 * @Date: 2020/8/23 20:16
 * @Version: 1.0
 **/


public class Temp01 {
    public static int getSumFromInt(int value) {
        if (value <= 9) {
            return value;
        }

        int sum = 0;
        while(value >= 10) {
            sum += (value % 10);
            value /= 10;
        }
        sum += value;
        return sum;
    }

    public static int getResult(int value) {
        int base = value;
        if (value <= 9) {
            return value;
        }
        int len = 0;
        while(base > 10) {
            len += 1;
            base /= 10;
        }
        len += 1;
        int a = (int) Math.pow(10, len - 1);
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(value / a - 1);
        for (int i = 0; i < len - 1; i++) {
            stringBuffer.append("9");
        }
        int left = Integer.parseInt(stringBuffer.toString());
        return getSumFromInt(left) + getSumFromInt(value - left);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println(0);
        }
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            System.out.println(getResult(temp));
        }
    }
}
