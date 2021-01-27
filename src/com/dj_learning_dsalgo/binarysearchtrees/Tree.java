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

    public TreeNode get (int value) {
        if (root != null)
            return root.get(value);
        return null;
    }

    public void delete (int value) {
        root = delete(root, value);
    }

    private TreeNode delete (TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null)
            return subtreeRoot; //in case tree is empty; also in case there is no child it will stop recursion

        if (value < subtreeRoot.getData())
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        else if (value > subtreeRoot.getData())
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        else {
            //value is equal    // node to delete, which has zero or one child
            if (subtreeRoot.getLeftChild() == null)
                return subtreeRoot.getRightChild(); //it works both cases, i.e
                                                    //if subtree is a leaf node it will be gone
                                                    //if subtree has a right child then it will be replaced with parent's right child
            else if (subtreeRoot.getRightChild() == null)
                return subtreeRoot.getLeftChild();  //vice versa
            //node to delete has 2 children

            //find the minimum value through right edge
            //Replace the value in the subtreeRoot node with the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    public int min () {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return root.min();
    }

    public int max () {
        if (root == null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }

    public void traverseInOrder () {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
