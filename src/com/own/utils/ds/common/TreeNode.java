package com.own.utils.ds.common;

public class TreeNode<E> {

	E data;
	TreeNode<E> left;
	TreeNode<E> right;
	TreeNode<E> parent;

	public TreeNode(E data, TreeNode<E> left, TreeNode<E> right, TreeNode<E> parent) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	public TreeNode(E data, TreeNode<E> parent) {
		this.data = data;
		this.parent = parent;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}

	public TreeNode<E> getParent() {
		return parent;
	}

	public void setParent(TreeNode<E> parent) {
		this.parent = parent;
	}

}
