package com.general;

import com.own.utils.ds.LinkedList;
import com.own.utils.ds.LinkedStack;
import com.own.utils.ds.common.Iterator;

public class DSDriver {

	public void checkLinkedList() {

		// With integer only - homogeneous data
		LinkedList<Integer> myList = new LinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);

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

	public static void main(String args[]) {
		DSDriver dsd = new DSDriver();
		dsd.checkLinkedList();
		dsd.checkLinkedStack();
	}
}
