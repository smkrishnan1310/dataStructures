package com.own.utils.ds;

import com.own.utils.ds.common.TreeNode;

public class Tree<E> {

	TreeNode<E> root;
	int size = 0;

	public Tree() {
	}

	public int compareMe(E e1, E e2) {
		if (e1.getClass().equals(Integer.class)) {
			return (int) e1 - (int) e2;
		}
		if (e1.getClass().equals(String.class)) {
			return ((String) e1).compareTo((String) e2);
		}
		return 0;
	}

	public int getSize() {
		return size;
	}

	public void printTreeInOrder(TreeNode<E> root) {
		TreeNode<E> nextNode = root;
		if (null != nextNode.getRight())
			printTreeInOrder(nextNode.getRight());

		System.out.println(root.getData() + ", ");
		if (null != nextNode.getLeft())
			printTreeInOrder(nextNode.getLeft());

	}

	public void printTree() {
		printTreeInOrder(root);
	}
	
	public void rotateLeft() {

	}

	public void insert(E data) {
		TreeNode<E> newNode = new TreeNode<E>(data, null);
		if (null == root) {
			root = newNode;
		} else {
			TreeNode<E> parent = root;
			while (null == newNode.getParent()) {
				parent = insertNewNode(data, newNode, parent);
			}

		}
		size++;
	}
	private TreeNode<E> insertNewNode(E data, TreeNode<E> newNode, TreeNode<E> parent) {
		TreeNode<E> next;
		int v = compareMe(parent.getData(), data);
		if (v > 0) {
			next = parent.getRight();
			if (null == next) {
				newNode.setParent(parent);
				parent.setRight(newNode);
			}
			parent = next;
		} else {
			next = parent.getLeft();
			if (null == next) {
				newNode.setParent(parent);
				parent.setLeft(newNode);
			}
			parent = next;
		}
		return parent;
	}
}
