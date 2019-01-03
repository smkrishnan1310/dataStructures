package com.own.utils.ds;

import com.own.utils.ds.common.Node;

public class LinkedStack<E> {

	private LinkedList<E> list = null;

	private Node<E> last = null;

	public LinkedStack() {
		list = new LinkedList<E>();
		last = list.last;
	}

	public int getSize() {
		return list.getSize();
	}

	public void push(E e) {
		list.add(e);
		last = list.last;
	}

	public boolean isEmpty() {
		return (list.size == 0);
	}

	public E pop() {
		E e = last.getData();
		last = last.getPrev();
		list.size--;
		return e;
	}
}
