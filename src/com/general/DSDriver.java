package com.general;

import com.own.utils.ds.LinkedList;
import com.own.utils.ds.LinkedStack;
import com.own.utils.ds.Tree;
import com.own.utils.ds.common.Iterator;

public class DSDriver {

	public void checkLinkedList() throws UtilException {

		// With integer only - homogeneous data
		LinkedList<Integer> myList = new LinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.insertAt(0, 2);
		myList.insertAtEnd(55);
		myList.insertAtStart(-2);
		myList.deleteAt(4);

		System.out.println("mylist Size : " + myList.getSize());
		Iterator<Integer> itr = myList.getIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------");
		// With all - heterogeneous data
		LinkedList hetro = new LinkedList();
		hetro.add("IND");
		hetro.add(123);
		hetro.add("USA");
		hetro.add("CAD");
		hetro.add("404-Error :p ");
		System.out.println("hetro Size : " + hetro.getSize());
		itr = hetro.getIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public void checkLinkedStack() {
		System.out.println("---------stack--------");
		LinkedStack<Integer> stack = new LinkedStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		// Integer i = stack.pop();
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	public void checkIntTree() {
		Tree<Integer> t = new Tree<>();
		t.insert(7);
		t.insert(10);
		t.insert(2);
		t.insert(3);
		t.insert(8);
		t.insert(11);
		t.insert(0);
		t.insert(1);
		t.insert(9);
		System.out.println("Tree size : " + t.getSize());
		t.printTree();

	}
	
	public void checkStringTree() {
		Tree<String> t = new Tree<>();
		t.insert("New Zealand");
		t.insert("Australia");
		t.insert("Europe");
		t.insert("India");
		t.insert("Canada");
		t.insert("Zimbabwe");
		t.insert("Asia");
		t.insert("America");
		t.insert("Germany");
		System.out.println("Tree size : " + t.getSize());
		t.printTree();

	}

	public static void main(String args[]) throws UtilException {
		DSDriver dsd = new DSDriver();
		// dsd.checkLinkedList();
		// dsd.checkLinkedStack();
		dsd.checkStringTree();
	}
}
