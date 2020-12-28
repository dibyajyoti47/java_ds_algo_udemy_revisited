package com.dj_practicing_dsalgo.lists.singlylinkedlist;

import com.dj_practicing_dsalgo.common.Employee;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("linku");
        list.add("pinku");
        list.add("tinku");
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.remove());
        System.out.println(list.getSize());
    }
}
