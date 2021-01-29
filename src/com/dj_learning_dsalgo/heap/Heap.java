package com.dj_learning_dsalgo.heap;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert (int value) {
        if (isFull()) throw new IndexOutOfBoundsException("heap is full");
        heap[size] = value;
        fixHeap(size); //heapify
        size++;
    }

    private void fixHeap (int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            int parentIndex = getParent(index);
            heap[index] = heap[parentIndex];
            index = parentIndex;
        }
        heap[index] = newValue;
    }


    public boolean isFull () {
        return size == heap.length;
    }

    public int getParent (int index) {
        return (index - 1) / 2;
    }
}
