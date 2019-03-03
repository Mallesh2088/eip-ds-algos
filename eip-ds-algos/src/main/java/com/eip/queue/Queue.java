package com.eip.queue;

import com.eip.linkedList.LinkedList;

public class Queue {
    LinkedList linkedList;

    public boolean enqueue(String data) {
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        return linkedList.addNodeAtStart(data);
    }

    public String dequeue() {
        if (linkedList == null) {
            return null;
        } else {
            return linkedList.deleteAtEnd();
        }
    }

    public void print() {
        linkedList.printLinkedList();
    }
}