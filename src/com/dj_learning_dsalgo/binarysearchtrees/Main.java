package com.dj_learning_dsalgo.binarysearchtrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
//        tree.traverseInOrder();
//        System.out.println(tree.get(27));
//        System.out.println(tree.get(17));
//        System.out.println(tree.get(237));
        System.out.println(tree.min());
        System.out.println(tree.max());
    }
}
