package com.dj_practicing_dsalgo.stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>(3);
        stack.push("Linku");
        stack.push("Tinku");
        stack.push("Pinku");
        stack.push("Chinku");
        stack.printStack();
        System.out.println(stack.getSize());
        System.out.println("-------------------------------");
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        stack.printFullStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); //throws exception
    }
}
