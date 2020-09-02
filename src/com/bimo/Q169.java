package com.bimo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: Q169
 * @Author: 13716
 * @Date: 2020/8/24 19:58
 * @Version: 1.0
 **/


public class Q169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        Map.Entry<Integer, Integer> temp = null;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (temp == null || entry.getValue() > temp.getValue()) {
                temp = entry;
            }
        }
        return temp.getKey();
    }
}
