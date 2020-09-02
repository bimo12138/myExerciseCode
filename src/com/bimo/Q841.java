package com.bimo;

import java.util.List;

/**
 * @ClassName: Q841
 * @Author: 13716
 * @Date: 2020/8/31 9:31
 * @Version: 1.0
 **/


public class Q841 {
    boolean[] res;
    int num;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        res = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x) {
        res[x] = true;
        num++;
        for (Integer integer : rooms.get(x)) {
            if (!res[integer]) dfs(rooms, integer);
        }
    }
}
