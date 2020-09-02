package com.bimo;

/**
 * @ClassName: Q486
 * @Author: 13716
 * @Date: 2020/9/1 9:37
 * @Version: 1.0
 **/


public class Q486 {
    /**
     *
     *  TODO 看不懂
     * @param nums
     * @return
     */
    public boolean PredictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1, 1) >= 0;
    }

    public int total(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);
        return Math.max(scoreStart * turn, scoreEnd * turn) * turn;
    }

    public static void main(String[] args) {
        Q486 q486 = new Q486();
        q486.PredictTheWinner(new int[] {1,5,233,7});
    }
}
