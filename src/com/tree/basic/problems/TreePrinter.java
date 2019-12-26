package com.tree.basic.problems;

public class TreePrinter {

	public static void printPreOrder(Node root) {
		if (null != root) {
			System.out.print(root.data + ", ");
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
	}

	public static void printPostOrder(Node root) {
		if (null != root) {
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.print(root.data + ", ");
		}
	}

	public static void printInOrder(Node root) {
		if (null != root) {
			printInOrder(root.left);
			System.out.print(root.data + ", ");
			printInOrder(root.right);
		}
	}

	public static void printTopView(Node root) {
		if (null != root) {
			printLeftViewWithoutRoot(root.left);
			System.out.print(root.data + ", ");
			printRightViewWithoutRoot(root.right);
		}
	}

	public static void printLeftViewWithoutRoot(Node root) {
		if (null != root) {
			printLeftViewWithoutRoot(root.left);
			System.out.print(root.data + ", ");
		}
	}

	public static void printRightViewWithoutRoot(Node root) {
		if (null != root) {
			System.out.print(root.data + ", ");
			printRightViewWithoutRoot(root.right);
		}
	}

	public static void printAllLeaves(Node root) {
		if (null != root && null == root.left && null == root.right) {
			System.out.print(root.data + ", ");
		} else if (root != null) {
			printAllLeaves(root.left);
			printAllLeaves(root.right);
		}
	}

	public static void printAllInternalNodes(Node root) {
		if (null != root) {
			printAllLeftInternalNodes(root.left);
			printAllRightInternalNodes(root.right);
		}
	}

	public static void printAllLeftInternalNodes(Node root) {
		if (null != root) {
			printAllLeftInternalNodes(root.left);
			printInOrderExceptLeaves(root.right);
		}
	}

	public static void printAllRightInternalNodes(Node root) {
		if (null != root) {
			printAllRightInternalNodes(root.right);
			printInOrderExceptLeaves(root.left);
		}
	}

	public static void printInOrderExceptLeaves(Node root) {
		if (null != root) {
			printInOrderExceptLeaves(root.left);

			if (null != root.left && null != root.right)
				System.out.print(root.data + ", ");

			printInOrderExceptLeaves(root.right);
		}
	}
}
