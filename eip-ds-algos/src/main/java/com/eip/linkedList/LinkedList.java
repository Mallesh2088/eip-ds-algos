package com.eip.linkedList;

public class LinkedList {

	LinkedListNode head = null;

	public boolean addNodeAtStart(String data) {
		LinkedListNode newNode = new LinkedListNode(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			LinkedListNode temp = head;
			head = newNode;
			newNode.next = temp;
			return true;
		}
	}

	public boolean addNodeAtEnd(String data) {
		LinkedListNode newNode = new LinkedListNode(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			LinkedListNode current = head;
			while (current != null) {
				if (current.next == null) {
					current.next = newNode;
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	public boolean addAtIndex(String data, int index) {
		LinkedListNode current = head;
		LinkedListNode newNode = new LinkedListNode(data);
		if (current == null) {
			head = newNode;
			return true;
		} else {
			while (current != null) {
				if (index == 0) {
					LinkedListNode temp = current.next;
					current.next = newNode;
					newNode.next = temp;
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	public String deleteAtStart() {
		if (head != null && head.next != null) {
			String value = head.data;
			LinkedListNode current = head.next;
			head = current;
			return value;
		}
		return null;
	}

	public String deleteAtEnd() {
		if (head != null && head.next != null) {
			LinkedListNode current = head;
			LinkedListNode prev = head;
			while (current != null) {
				if (current.next == null) {
					prev.next = null;
					return current.data;
				}
				prev = current;
				current = current.next;
			}
		}
		return null;
	}

	public boolean deleteAtIndex(int index) {

		if (head != null) {
			LinkedListNode current = head;
			LinkedListNode prev = head;
			while (current != null) {
				if (index == 0) {
					prev.next = current.next;
					return true;
				}
				prev = current;
				current = current.next;
				index--;
			}
		}
		return false;
	}

	public void printLinkedList() {
		LinkedListNode current = head;
		while (current != null) {
			System.out.print("-" + current.data + "-");
			current = current.next;
		}
	}

	class LinkedListNode {

		public LinkedListNode(String data) {
			this.data = data;
		}

		private String data;
		private LinkedListNode next;

		@Override
		public String toString() {
			return "LinkedListNode [data=" + data + ", next=" + next + "]";
		}

	}
}
