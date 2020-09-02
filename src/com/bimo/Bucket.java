package com.bimo;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName: Bucket
 * @Author: 13716
 * @Date: 2020/8/30 10:33
 * @Version: 1.0
 **/


public class Bucket {
    private List<Pair<Integer, Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<Pair<Integer, Integer>>();
    }

    public Integer get(Integer key) {
        for (Pair<Integer, Integer> pair : this.bucket) {
            if (pair.getFirst().equals(key)) {
                return pair.getSecond();
            }
        }
        return -1;
    }

    public void update(Integer key, Integer value) {
        boolean found = false;
        for (Pair<Integer, Integer> pair : this.bucket) {
            if (pair.getFirst().equals(key)) {
                pair.setSecond(value);
                found = true;
            }
        }
        if (!found) this.bucket.add(new Pair<Integer, Integer>(key, value));
    }

    public void remove(Integer key) {
        for (Pair<Integer, Integer> pair : this.bucket) {
            if (pair.getFirst().equals(key)) {
                this.bucket.remove(pair);
                break;
            }
        }
    }
}

