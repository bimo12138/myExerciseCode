package com.bimo;

/**
 * @ClassName: Q463
 * @Author: 13716
 * @Date: 2020/8/30 11:33
 * @Version: 1.0
 **/


public class Q463 {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] temp = grid[i];
            for (int j = 0; j < temp.length; j++) {
                int tempNum = 0;
                if (temp[j] == 0) continue;
                 // 第一行
                if (i == 0|| grid[i - 1][j] == 0) tempNum++;
                // 第一列 和 左侧
                if (j == 0 || temp[j - 1] == 0) tempNum++;
                // 最后一列 和 右侧
                if (j == temp.length - 1 || temp[j + 1] == 0) tempNum++;
                // 最后一列 和 下侧
                if (i == grid.length - 1 || grid[i + 1][j] == 0) tempNum++;
                res += tempNum;
            }
        }
        return res;
    }
}
