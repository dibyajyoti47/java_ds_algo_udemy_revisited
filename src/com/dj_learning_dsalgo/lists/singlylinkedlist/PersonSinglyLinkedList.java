package com.dj_learning_dsalgo.lists.singlylinkedlist;

public class PersonSinglyLinkedList {

    private PersonNode head;
    private int size;

    public void addToFront (Person person) {
        PersonNode node = new PersonNode(person);
        node.setNext(head);
        head = node;
        size++;
    }

    public Person removeFromFront () {
        if (isEmpty()) {
            return null;
        }
        Person person = head.getPerson();
        head = head.getNext();
        size--;
        return person;
    }

    public int getSize () {
        return size;
    }


    public void printList() {
        PersonNode pointer = head;
        System.out.print("Head -> ");
        while(pointer != null) {
            System.out.print(pointer.getPerson());
            pointer = pointer.getNext();
            System.out.print(" -> ");
        }
        System.out.print(" null ");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
