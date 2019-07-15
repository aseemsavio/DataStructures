package com.savio.queue;

public class App {

    public static void main(String[] args){
        Queue<Integer> queue = new Queue();
        System.out.println("Size: " + queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Size after enqueue: " + queue.size());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Size after dequeue: " + queue.size());
    }

}
