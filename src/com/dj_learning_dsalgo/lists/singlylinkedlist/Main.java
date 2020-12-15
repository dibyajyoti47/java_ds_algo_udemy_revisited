package com.dj_learning_dsalgo.lists.singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        PersonSinglyLinkedList list = new PersonSinglyLinkedList();
        list.addToFront(new Person("John",22, 101));
        list.addToFront(new Person("Jane",24, 102));
        list.addToFront(new Person("Aaron", 26, 103));
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        Person removedPerson = list.removeFromFront();
        System.out.println(removedPerson);
        System.out.println(list.getSize());
        list.printList();
    }
}
