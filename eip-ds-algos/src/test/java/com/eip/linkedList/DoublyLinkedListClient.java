package com.eip.linkedList;

public class DoublyLinkedListClient {

    public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.addNodeAtStart("Jane");
		linkedList.addNodeAtStart("Aba");
		linkedList.addNodeAtStart("Bob");
		linkedList.deleteAtIndex(2);
		linkedList.printLinkedList();
	}
}