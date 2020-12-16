package com.dj_learning_dsalgo.lists.doublylinkedlist;


public class Main {
    public static void main(String[] args) {
        PersonDoublyLinkedList list = new PersonDoublyLinkedList();
        list.addToFront(new Person("John",22, 101));
        list.addToFront(new Person("Jane",24, 102));
        list.addToFront(new Person("Aaron", 26, 103));
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        System.out.println("------------------------------");
        list.addToEnd(new Person("Billy", 28, 104));
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        System.out.println("------------------------------");
        list.removeFromFront();
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        System.out.println("------------------------------");
        list.removeFromEnd();
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
    }
}
