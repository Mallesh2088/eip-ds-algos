package com.eip.queue;

public class QueueClient {

    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.enqueue("Java");
        queue.enqueue("Spring");
        queue.enqueue("Spring Data");
        queue.enqueue("Oracle DB");
        queue.print();
        queue.dequeue();
        System.out.println();
        queue.print();
    }

}