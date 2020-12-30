package com.dj_practicing_dsalgo.queue;

public class Main2 {
    public static void main(String[] args) {
        CircularQueue<String> queue = new CircularQueue<String>(3);
        queue.add("Linku");
        queue.add("Tinku");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("adding new element to the last index..");
        queue.add("Pinku");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("polling : " + queue.poll());
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("polling : " + queue.poll());
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("adding...");
        queue.add("Chinku");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("Peeking : "+ queue.peek());
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        /*System.out.println("polling : " + queue.poll());
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");*/
        /*System.out.println("polling : " + queue.poll());
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");*/
        /*System.out.println("polling : " + queue.poll());
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");*/
        System.out.println("adding...");
        queue.add("Chinku-2");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("adding...");
        queue.add("Chinku-3");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("adding...");
        queue.add("Chinku-4");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
        System.out.println("adding...");
        queue.add("Chinku-5");
        System.out.println("size : " + queue.getSize());
        queue.printPositions();
        queue.printQueue();
        queue.printFullQueue();
        System.out.println("----------");
    }
}