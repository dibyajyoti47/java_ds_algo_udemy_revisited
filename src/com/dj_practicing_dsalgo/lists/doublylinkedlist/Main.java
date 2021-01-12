package com.dj_practicing_dsalgo.lists.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.addToFront("Linku");
        list.addToFront("Pinku");
        list.addToFront("Tinku");
        /*
        System.out.println(list.getSize());
        list.printList();
        System.out.println("-----------");
        list.addToEnd("Chinku");
        System.out.println(list.getSize());
        list.printList();
        System.out.println("-----------");
        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
        System.out.println("-----------");
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
        System.out.println("-----------");
        */
        list.addBefore("Chinku", "Linku");
        list.printList();
    }
}
