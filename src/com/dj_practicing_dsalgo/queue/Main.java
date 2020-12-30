package com.dj_practicing_dsalgo.queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>(3);
        queue.add("Linku");
        queue.add("Tinku");
        queue.add("Pinku");
        /*
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
        System.out.println(queue.getFront());
        System.out.println(queue.getEnd());
        */
        // below is the case where array can be oversized.
        System.out.println(queue.getFront());
        System.out.println(queue.getEnd());
        System.out.println("polling : " + queue.poll());
        System.out.println("Front : " + queue.getFront());
        System.out.println("End : " + queue.getEnd());
        System.out.println("----------");
        System.out.println("polling : " + queue.poll());
        System.out.println("Front : " + queue.getFront());
        System.out.println("End : " + queue.getEnd());
        System.out.println("----------");
        queue.printFullQueue();
        queue.add("Chinku");
        queue.printFullQueue();
        System.out.println("Peeking : "+ queue.peek());
        System.out.println("Front : " + queue.getFront());
        System.out.println("End : " + queue.getEnd());
    }
}
