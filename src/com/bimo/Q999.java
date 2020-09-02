package com.bimo;

/**
 * @ClassName: Q999
 * @Author: 13716
 * @Date: 2020/8/24 18:27
 * @Version: 1.0
 **/


public class Q999 {
    public static int numRookCaptures(char[][] board) {
        int[][] directs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int x = 0;
        int y = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j ++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }
        int flag = 0;
        int tempX;
        int tempY;
        for(int i = 0; i < directs.length; i ++) {
            int[] current_direct = directs[i];
            tempX = x;
            tempY = y;
            while(true) {
                tempX += current_direct[0];
                tempY += current_direct[1];

                if (tempX == -1 || tempX == 8 || tempY == -1 || tempY == 8) {
                    break;
                }

                char t = board[tempX][tempY];
                if (t == 'B') {
                    break;
                } else if (t == 'p') {
                    flag ++;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
         char[][] temp = {{'.','.','.','.','.','.','.','.'}, {'.','.','.','p','.','.','.','.'}, {'.','.','.','R','.','.','.','p'},
            {'.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.'}, {'.','.','.','p','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures(temp));
    }
}
