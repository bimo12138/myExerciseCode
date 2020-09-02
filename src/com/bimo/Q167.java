package com.bimo;

/**
 * @ClassName: Q167
 * @Author: 13716
 * @Date: 2020/8/31 15:11
 * @Version: 1.0
 **/


public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right) {
            int temp = left + right;
            if (temp == target) return new int[] {left + 1, right + 1};
            else if (temp > target) right--;
            else left++;
        }
        return new int[] {-1, -1};
    }
}
