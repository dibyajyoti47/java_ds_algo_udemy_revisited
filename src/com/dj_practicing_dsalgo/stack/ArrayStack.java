package com.dj_practicing_dsalgo.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {

    private Object[] stack;
    private int size;
    private int pointer = 0;

    public ArrayStack (int capacity) {
        this.stack = new Object[capacity];
    }

    public void push (T element){
        if (size == stack.length) ensureCapacity();
        stack[pointer++] = element;
        size++;
    }

    public T pop () {
        if (size == 0) throw new EmptyStackException();
        T removedElement = (T) stack[--pointer];
        stack[pointer] = null;
        size--;
        return removedElement;
    }

    public void ensureCapacity() {
        Object[] newStack = new Object[size*2];
        System.arraycopy(stack, 0, newStack, 0, size);
        stack = newStack;
    }

    public int getSize() {
        return size;
    }

    public void printFullStack () {
        Arrays.stream(stack).forEach(System.out::println);
    }

    public void printStack () {
        for (int i=0; i<size; i++){
            System.out.println(stack[i]);
        }
    }
}
