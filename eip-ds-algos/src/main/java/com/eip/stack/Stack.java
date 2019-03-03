package com.eip.stack;

import com.eip.linkedList.LinkedList;

public class Stack {

    LinkedList linkedList;

    public boolean push(String value) {
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        return linkedList.addNodeAtStart(value);
    }

    public String pop() {
        if(linkedList == null) {
            return null;
        } else {
            return linkedList.deleteAtStart();
        }
    }

    public void print(){
        linkedList.printLinkedList();
    }

}