package com.dj_learning_dsalgo.stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println("------------------------------");
        stack.push(new Employee(1231,"Dibyajyoti", "Behera"));
        stack.push(new Employee(1232,"Dibyaprava", "Behera"));
        stack.push(new Employee(1233, "Basanti", "Behera"));
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.printStack();
        System.out.println("------------------------------");
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.printStack();
        System.out.println("------------------------------");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.printStack();
    }
}
