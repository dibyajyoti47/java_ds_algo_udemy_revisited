package com.dj_learning_dsalgo.queue;


import com.dj_learning_dsalgo.queue.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        System.out.println(queue.size());
        System.out.println("------------------------------");
        queue.add(new com.dj_learning_dsalgo.queue.Employee(1231,"Dibyajyoti", "Behera"));
        queue.add(new com.dj_learning_dsalgo.queue.Employee(1232,"Dibyaprava", "Behera"));
        queue.add(new Employee(1233, "Basanti", "Behera"));
        System.out.println(queue.size());
        queue.printQueue();
        System.out.println("------------------------------");
        System.out.println(queue.poll());
        System.out.println(queue.size());
        queue.printQueue();
        System.out.println("------------------------------");
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.printQueue();
    }
}
