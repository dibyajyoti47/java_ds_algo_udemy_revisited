package com.dj_practicing_dsalgo.lists.doublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public T getHead() {
        return head.getElement();
    }

    public T getTail() {
        return tail.getElement();
    }

    public void addToFront (T element) {
        Node<T> newNode = new Node<T>(element);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    public void addToEnd (T element) {
        Node<T> newNode = new Node<T>(element);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public T removeFromFront () {
        if (isEmpty()) throw new NoSuchElementException();
        Node<T> removedNode = head;
        head = head.getNext();
        head.setPrevious(null);
        size--;
        return  removedNode.getElement();
    }

    public T removeFromEnd () {
        if (isEmpty()) throw new NoSuchElementException();
        Node<T> removedNode = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        size--;
        return  removedNode.getElement();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList () {
        Node<T> currentNode = head;
        System.out.print("head -> ");
        while (currentNode != null) {
            System.out.print(currentNode.getElement() + " -> ");
            currentNode = currentNode.getNext();
        }
        System.out.print("tail");
        System.out.println();
    }

    private class Node<T> {
        private T element;
        private Node<T> next;
        private Node<T> previous;

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
    }
}
