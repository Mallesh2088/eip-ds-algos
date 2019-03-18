package com.eip.linkedList;

public class LinkedList<T> {

	public LinkedListNode<T> head = null;

	public boolean addNodeAtStart(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			LinkedListNode<T> temp = head;
			head = newNode;
			newNode.setNext(temp);
			return true;
		}
	}

	public boolean addNodeAtEnd(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			LinkedListNode<T> current = head;
			while (current != null) {
				if (current.getNext() == null) {
					current.setNext(newNode);
					return true;
				}
				current = current.getNext();
			}
		}
		return false;
	}

 public boolean addAtIndex(T data, int index) {
		LinkedListNode<T> current = head;
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if (current == null) {
			head = newNode;
			return true;
		} else {
			while (current != null) {
				if (index == 0) {
					LinkedListNode<T> temp = current.getNext();
					current.setNext(newNode);
					newNode.setNext(temp);
					return true;
				}
				current = current.getNext();
			}
		}
		return false;
	} 

	 public T deleteAtStart() {
		if (head != null && head.getNext() != null) {
			T value = head.getData();
			LinkedListNode<T> current = head.getNext();
			head = current;
			return value;
		}
		return null;
	}

	public T deleteAtEnd() {
		if (head != null && head.getNext() != null) {
			LinkedListNode<T> current = head;
			LinkedListNode<T> prev = head;
			while (current != null) {
				if (current.getNext() == null) {
					prev.setNext(null);
					return current.getData();
				}
				prev = current;
				current = current.getNext();
			}
		}
		return null;
	}

	public boolean deleteAtIndex(int index) {

		if (head != null) {
			LinkedListNode<T> current = head;
			LinkedListNode<T> prev = head;
			while (current != null) {
				if (index == 0) {
					prev.setNext(current.getNext());
					return true;
				}
				prev = current;
				current = current.getNext();
				index--;
			}
		}
		return false;
	} 

	public void printLinkedList() {
		LinkedListNode<T> current = head;
		while (current != null) {
			System.out.print("-" + current.getData() + "-");
			current = current.getNext();
		}
	}

	
}
