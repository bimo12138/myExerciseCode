package com.bimo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Q897
 * @Author: 13716
 * @Date: 2020/8/28 13:21
 * @Version: 1.0
 **/


public class Q897 {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for (Integer re : res) {
            cur.right = new TreeNode(re);
            cur = cur.right;
        }
        return ans.right;
    }
    public void inOrder(TreeNode node, List<Integer> integerList) {
        if (node == null) return ;
        inOrder(node.left, integerList);
        integerList.add(node.val);
        inOrder(node.right, integerList);
    }
}
