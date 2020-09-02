package com.bimo;

/**
 * @ClassName: Q1005
 * @Author: 13716
 * @Date: 2020/8/31 10:09
 * @Version: 1.0
 **/


public class Q1005 {
    public int findString(String[] words, String s) {
        /*
        int i = 0;
        for (; i < words.length; i++) {
            if (words[i].equals(s)) return i;
        }
        return i == words.length? -1: i;
        */
        if(words.length == 1 && words[0].equals(s))
            return 0;
        int i = 0, j = words.length - 1;
        while(i <= j){
            while(i < j && words[i].equals("")) i ++;
            while(i < j && words[j].equals("")) j --;
            if(i <= j){
                int mid = (i + j) / 2;
                int tmp = mid;
                while(tmp < j && words[tmp].equals("")) tmp ++;
                // 注意字母相同的情况可能会出现问题，原方法
                if(words[tmp].compareTo(s) > 0){
                    j = mid - 1;
                }else if(words[tmp].compareTo(s) < 0){
                    i = tmp + 1;
                }else{
                    return tmp;
                }
            }
        }
        return -1;
    }
}
