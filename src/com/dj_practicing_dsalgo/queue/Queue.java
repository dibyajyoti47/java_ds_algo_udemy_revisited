package com.dj_practicing_dsalgo.queue;

import java.util.NoSuchElementException;

public class Queue<T> {
    private int front;
    private int end;
    private Object[] arrayQueue;
    public Queue (int capacity) {
        arrayQueue = new Object[capacity];
    }

    public void add (T element) {
        if (end == arrayQueue.length) endureCapacity();
        arrayQueue[end++] = element;
    }

    public T peek () {
        if (getSize() == 0) throw new NoSuchElementException();
        return (T) arrayQueue[front];
    }

    public T poll () {
        if (getSize() == 0) throw new NoSuchElementException();
        T removedElement =  (T) arrayQueue[front];
        arrayQueue[front++] = null;
        return removedElement;
    }

    public void endureCapacity () {
        int size = getSize();
        Object[] newQueue = new Object[arrayQueue.length * 2];
        System.arraycopy(arrayQueue, front, newQueue, 0, size);
        arrayQueue = newQueue;
        front = 0;
        end = size;
    }
    public int getSize () {
        return end - front;
    }

    public void printQueue (){
        System.out.print(" { start -> ");
        for (int i=front; i<end; i++) {
            System.out.print(arrayQueue[i] + " ");
        }
        System.out.println(" <- end }");
    }

    public void printFullQueue () {
        System.out.print(" { start -> ");
        for (int i=0; i<arrayQueue.length; i++) {
            System.out.print(arrayQueue[i] + " ");
        }
        System.out.println(" <- end }");
    }
}
