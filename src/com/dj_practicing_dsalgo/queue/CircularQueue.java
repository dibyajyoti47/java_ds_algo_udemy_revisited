package com.dj_practicing_dsalgo.queue;

import java.util.NoSuchElementException;

public class CircularQueue<T> {
    private int front;
    private int end;
    private Object[] arrayQueue;
    public CircularQueue (int capacity) {
        arrayQueue = new Object[capacity];
    }

    public void add (T element) {
        if (getSize() == arrayQueue.length-1) {
            int items = getSize();
            Object[] newArray = new Object[arrayQueue.length * 2];
            System.arraycopy(arrayQueue, front, newArray, 0, arrayQueue.length-front);
            System.arraycopy(arrayQueue, 0, newArray, arrayQueue.length-front, end);
            arrayQueue = newArray;
            front = 0;
            end = items;
        }
        arrayQueue[end] = element;
        if (end < arrayQueue.length-1 ) {
            end++;
        } else {
            end = 0;
        }
    }

    public T peek () {
        if (getSize() == 0) throw new NoSuchElementException();
        return (T) arrayQueue[front];
    }

    public T poll () {
        if (getSize() == 0) throw new NoSuchElementException();
        T removedElement = (T) arrayQueue[front];
        arrayQueue[front++] = null;
        if (front == arrayQueue.length) front = 0;
        if (front == end) {
            front = 0; end = 0;
        }
        return removedElement;
    }

    public int getSize () {
        if (end >= front) {
            return end - front;
        } else {
            return end - front + arrayQueue.length;
        }
    }

    public void printPositions () {
        System.out.println("Front : "+front+" , " + "End : "+end);
    }

    public void printQueue (){
        System.out.print("{ start -> ");
        if (end > front) {
            for (int i=front; i<end; i++) {
                System.out.print(arrayQueue[i] + " ");
            }
        } else {
            for (int i=front; i< arrayQueue.length; i++) {
                System.out.print(arrayQueue[i] + " ");
            }
            for (int i=0; i< end; i++) {
                System.out.print(arrayQueue[i] + " ");
            }
        }
        System.out.println(" <- end }");
    }

    public void printFullQueue () {
        System.out.print("{ start -> ");
        for (int i=0; i<arrayQueue.length; i++) {
            System.out.print(arrayQueue[i] + " ");
        }
        System.out.println(" <- end }");
    }
}
