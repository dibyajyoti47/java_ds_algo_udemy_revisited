package com.dj_practicing_dsalgo.queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>(3);
        queue.add("Linku");
        queue.add("Tinku");
        queue.add("Pinku");
        queue.add("Chinku");
        queue.printQueue();
        queue.printFullQueue();
        System.out.println(queue.getSize());
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("peek - "+queue.peek());
        System.out.println(queue.getSize());
        System.out.println("poll - "+queue.poll());
        System.out.println(queue.getSize());
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("--------------------------");
    }
}
