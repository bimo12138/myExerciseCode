package com.bimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Q350
 * @Author: 13716
 * @Date: 2020/8/31 11:18
 * @Version: 1.0
 **/


public class Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int tmp = map.getOrDefault(nums2[i], 0);
            if (tmp != 0) {
                res.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Q350 q350 = new Q350();
        q350.intersect(new int[] {1,2,2,1}, new int[] {2,2});
    }
}
