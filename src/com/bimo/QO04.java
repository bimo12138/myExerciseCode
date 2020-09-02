package com.bimo;

/**
 * @ClassName: QO04
 * @Author: 13716
 * @Date: 2020/9/2 9:52
 * @Version: 1.0
 **/


public class QO04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 1) {
                if (matrix[i][0] == target) return true;
                else continue;
            }
            int left = 0;
            int right = matrix[i].length - 1;
            while(left < right) {
                if (matrix[i][left] == target || matrix[i][right] == target) return true;
                if (matrix[i][left] < target) left++;
                else if (matrix[i][right] < target) continue;
                else if (matrix[i][right] > target) right--;
            }
        }
        return false;
    }
}
