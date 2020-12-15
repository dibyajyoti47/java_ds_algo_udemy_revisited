package com.dj_learning_dsalgo.lists.doublylinkedlist;

public class PersonDoublyLinkedList {
    private PersonNode head;
    private PersonNode tail;
    private int size;

    public void addToFront (Person person) {
        PersonNode node = new PersonNode(person);
        if (head == null ) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToEnd (Person person) {
        PersonNode node = new PersonNode(person);
        if ( head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        node.setPrevious(tail);
        tail = node;
        size++;
    }

    public Person removeFromFront () {
        if (isEmpty()) return null;
        Person person = head.getPerson();
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        return person;
    }

    public Person removeFromEnd () {
        if (isEmpty()) return null;
        Person person = tail.getPerson();
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        return person;
    }
    public PersonNode getHead() {
        return head;
    }

    public void setHead(PersonNode head) {
        this.head = head;
    }

    public PersonNode getTail() {
        return tail;
    }

    public void setTail(PersonNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
