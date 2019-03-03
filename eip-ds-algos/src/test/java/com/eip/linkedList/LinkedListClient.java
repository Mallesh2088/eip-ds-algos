package com.eip.linkedList;

public class LinkedListClient {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtStart("Jane");
		linkedList.addNodeAtStart("Aba");
		linkedList.addNodeAtStart("Bob");
		linkedList.deleteAtIndex(2);
		linkedList.printLinkedList();
	}

}
