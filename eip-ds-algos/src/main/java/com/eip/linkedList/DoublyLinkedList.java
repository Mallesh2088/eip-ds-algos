package com.eip.linkedList;

public class DoublyLinkedList {

	DoublyLinkedListNode head = null;

	public boolean addNodeAtStart(String data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			DoublyLinkedListNode temp = head;
			head = newNode;
			newNode.next = temp;
			temp.prev = newNode;
			return true;
		}
	}

	public boolean addNodeAtEnd(String data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			DoublyLinkedListNode current = head;
			while (current != null) {
				if (current.next == null) {
					current.next = newNode;
					newNode.prev = current;
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	public boolean addAtIndex(String data, int index) {
		DoublyLinkedListNode current = head;
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		if (current == null) {
			head = newNode;
			return true;
		} else {
			while (current != null) {
				if (index == 0) {
					DoublyLinkedListNode temp = current.next;
					current.next = newNode;
					newNode.next = temp;
					newNode.prev = current;
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	public boolean deleteAtStart() {
		if (head != null && head.next != null) {
			DoublyLinkedListNode current = head.next;
			head = current;
			return true;
		}
		return false;
	}

	public boolean deleteAtEnd() {
		if (head != null && head.next != null) {
			DoublyLinkedListNode current = head;
			DoublyLinkedListNode prev = head;
			while (current != null) {
				if (current.next == null) {
					prev.next = null;
					return true;
				}
				prev = current;
				current = current.next;
			}
		}
		return false;
	}

	public boolean deleteAtIndex(int index) {

		if (head != null) {
			DoublyLinkedListNode current = head;
			DoublyLinkedListNode prev = head;
			while (current != null) {
				if (index == 0) {
					prev.next = current.next;
					if(current.next != null) {
						current.next.prev = prev;
					}
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
		DoublyLinkedListNode current = head;
		while (current != null) {
			System.out.print("-" + current.data + "-");
			current = current.next;
		}
	}

	class DoublyLinkedListNode {

		public DoublyLinkedListNode(String data) {
			this.data = data;
		}

		private String data;
		private DoublyLinkedListNode next;
		private DoublyLinkedListNode prev;

		@Override
		public String toString() {
			return "DoublyLinkedListNode [data=" + data + ", next=" + next + "]";
		}

	}
}
