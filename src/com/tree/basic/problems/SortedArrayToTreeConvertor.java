package com.tree.basic.problems;

public class SortedArrayToTreeConvertor {

	/**
	 * Converts sorted array to balanced binary search tree using recursion. Will
	 * return root node of the BST
	 */
	public static Node convert(int ar[]) {
		if (ar != null) {
			int st = 0;
			int en = ar.length - 1;
			return createNewTree(ar, st, en);
		}
		return null;
	}

	public static Node buildLeftTree(int ar[], int st, int en) {
		if (st <= en && en >= 0 && st >= 0) {
			return createNewTree(ar, st, en);
		}
		return null;
	}

	public static Node buildRightTree(int ar[], int st, int en) {
		if (st <= en && en < ar.length && st < ar.length) {
			return createNewTree(ar, st, en);
		}
		return null;
	}

	private static Node createNewTree(int[] ar, int st, int en) {
		int mid = (en + st) / 2;
		Node root = new Node(ar[mid]);
		root.left = buildLeftTree(ar, st, mid - 1);
		root.right = buildRightTree(ar, mid + 1, en);
		return root;
	}

}