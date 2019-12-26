package com.tree.basic.problems;

public class TreeFunTester {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		//Array to Tree(BST) converter
		Node root = SortedArrayToTreeConvertor.convert(ar);
		System.out.println("\n pre order");
		TreePrinter.printPreOrder(root);
		System.out.println("\n post order");
		TreePrinter.printPostOrder(root);
		System.out.println("\n In order");
		TreePrinter.printInOrder(root);
		System.out.println("\n Top view : ");
		TreePrinter.printTopView(root);
		System.out.println("\n Leaves : ");
		TreePrinter.printAllLeaves(root);
		System.out.println("\n Internal Nodes : ");
		TreePrinter.printAllInternalNodes(root);

	}

}
