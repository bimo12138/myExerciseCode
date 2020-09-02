package com.bimo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Q257
 * @Author: 13716
 * @Date: 2020/8/29 11:07
 * @Version: 1.0
 **/


public class Q257 {
    public void construct_paths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += Integer.toString(root.val);
            if ((root.left == null) && (root.right == null))  // 当前节点是叶子节点
                paths.add(path);  // 把路径加入到答案中
            else {
                path += "->";  // 当前节点不是叶子节点，继续递归遍历
                construct_paths(root.left, path, paths);
                construct_paths(root.right, path, paths);
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        construct_paths(root, "", paths);
        return paths;
    }

}
