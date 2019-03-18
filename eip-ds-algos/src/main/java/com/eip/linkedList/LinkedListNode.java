package com.eip.linkedList;

public class LinkedListNode<T> {

    public LinkedListNode(T data) {
        this.data = data;
    }

    private T data;
    private LinkedListNode<T> next;

    @Override
    public String toString() {
        return "LinkedListNode [data=" + data + ", next=" + next + "]";
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public LinkedListNode<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

}