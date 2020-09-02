package com.bimo;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: QO32
 * @Author: 13716
 * @Date: 2020/8/28 11:43
 * @Version: 1.0
 **/


public class QO32 {

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        height(root, 0);
        return res;
    }
    public void height(TreeNode root, int deep) {
        if(root == null) {
            return;
        }
        if (res.size() == deep) {
            res.add(new LinkedList<>());
        }
        res.get(deep).add(root.val);
        height(root.left, deep + 1);
        height(root.right, deep + 1);
    }
}
