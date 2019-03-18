package com.eip.tree;

public class BinarySearchTreeClient {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addNode(6);
		binarySearchTree.addNode(3);
		binarySearchTree.addNode(8);
		binarySearchTree.addNode(1);
		binarySearchTree.addNode(4);
		binarySearchTree.addNode(7);
		System.out.println(binarySearchTree.isBalancedTree());
		System.out.println("In Order");
		binarySearchTree.traverseInOrder();
		System.out.println("Pre Order");
		binarySearchTree.traversePreOrder();
		System.out.println("Post Order");
		binarySearchTree.traversePostOrder();

	}

}
