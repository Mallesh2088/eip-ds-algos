package com.eip.tree;

public class BinarySearchTree {

	Node root;

	public void addNode(int data) {
		root = addRec(root, data);
	}

	private Node addRec(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = addRec(root.left, data);
		} else if (data > root.data) {
			root.right = addRec(root.right, data);
		}
		return root;
	}

	public boolean isBalancedTree() {
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);
		int depthDiff = Math.abs(leftDepth - rightDepth);
		return depthDiff < 2;
	}

	private int getDepth(Node node) {
		return getDepthRec(node, 0, 0);
	}

	private int getDepthRec(Node node, int leftDepth, int rightDepth) {
		if (node == null) {
			return 0;
		}
		if (node.left != null) {
			leftDepth = 1 + getDepthRec(node.left, leftDepth, rightDepth);
		}

		if (node.right != null) {
			rightDepth = 1 + getDepthRec(node.right, leftDepth, rightDepth);
		}
		return Math.max(leftDepth, rightDepth);
	}

	public void traverseInOrder() {
		traverseInOrderRec(root);
	}

	public void traversePreOrder() {
		traversePreOrderRec(root);
	}

	public void traversePostOrder() {
		traversePostOrderRec(root);
	}

	private boolean traverseInOrderRec(Node node) {
		if (node == null) {
			return false;
		}
		traverseInOrderRec(node.left);
		System.out.println(node.data);
		traverseInOrderRec(node.right);
		return true;
	}

	private boolean traversePreOrderRec(Node node) {
		if (node == null) {
			return false;
		}
		System.out.println(node.data);
		traversePreOrderRec(node.left);
		traversePreOrderRec(node.right);
		return true;
	}

	private boolean traversePostOrderRec(Node node) {
		if (node == null) {
			return false;
		}
		traversePostOrderRec(node.left);
		traversePostOrderRec(node.right);
		System.out.println(node.data);
		return true;
	}

	class Node {

		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
		}

	}

}

class Node {

	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}
