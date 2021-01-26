package com.dj_learning_dsalgo.binarysearchtrees;

public class Tree {
    private TreeNode root;

    public void insert (int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}
