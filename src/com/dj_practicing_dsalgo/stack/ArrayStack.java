package com.dj_practicing_dsalgo.stack;

import java.lang.reflect.Array;
public class ArrayStack<T> {

    private Object[] stack;

    public ArrayStack (int capacity) {
        this.stack = new Object[capacity];
    }

}
