package com.own.utils.ds;

import com.own.utils.ds.common.Iterator;
import com.own.utils.ds.common.Node;

public class LinkedList<E> implements Iterator<E>{

	protected int size = 0;
	protected Node<E> head = null;
	protected Node<E> last = null;
	private Node<E> itrHasNext = head;

	public LinkedList() {
	}

	public Iterator<E> getIterator() {
		itrHasNext = head;
		return this;
	}

	public boolean hasNext() {
		return (itrHasNext != null ? true : false);
	}
	
	public E next() {
		E e= itrHasNext.getData();
		itrHasNext = itrHasNext.getNext();
		return e;
	}

	public int getSize() {
		return this.size;
	}

	public void add(E e) {
		if (null == head) {
			head = new Node<E>(e, null, null);
			last = head;
		} else {
			Node<E> newNode = new Node<E>(e, null, last);
			last.setNext(newNode);
			last = newNode;
		}
		size++;
	}

}
