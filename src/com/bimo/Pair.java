package com.bimo;


/**
 * @ClassName: Pair
 * @Author: 13716
 * @Date: 2020/8/30 10:33
 * @Version: 1.0
 **/


public class Pair<U, V> {
    private U first;
    private V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
