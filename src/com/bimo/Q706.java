package com.bimo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Q706
 * @Author: 13716
 * @Date: 2020/8/30 10:26
 * @Version: 1.0
 **/


public class Q706 {
    private int keySpace;
    private List<Bucket> hashTable;

    /** Initialize your data structure here. */
    public Q706() {
        this.keySpace = 200;
        this.hashTable = new ArrayList<Bucket>();
        for (int i = 0; i < this.keySpace; i++) {
            this.hashTable.add(new Bucket());
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hashKey = key % this.keySpace;
        this.hashTable.get(hashKey).update(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashKey = key % this.keySpace;
        return this.hashTable.get(hashKey).get(key);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashKey = key % this.keySpace;
        this.hashTable.get(hashKey).remove(key);
    }
}
