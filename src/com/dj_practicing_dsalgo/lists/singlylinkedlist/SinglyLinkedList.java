package com.dj_practicing_dsalgo.lists.singlylinkedlist;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    public void add(T element) {
        if (isEmpty()) {
            head = new Node<T>(element);
            size++;
        } else {
            Node newNode = new Node<T>(element);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public T remove () {
        if (isEmpty()) throw new NoSuchElementException();
        T removedElement = head.element;
        head = head.next;
        size--;
        return removedElement;
    }

    public int getSize () {
        return size;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void printList () {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.element);
            currentNode = currentNode.next;
        }
    }

    private class Node<T> {
        private Node<T> next;
        private T element;
        Node (T element) {
            this.element = element;
        }
    }
}
