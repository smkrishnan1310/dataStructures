package com.own.utils.ds;

import com.general.UtilException;
import com.own.utils.ds.common.Iterator;
import com.own.utils.ds.common.Node;

public class LinkedList<E> implements Iterator<E> {

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
		E e = itrHasNext.getData();
		itrHasNext = itrHasNext.getNext();
		return e;
	}

	public int getSize() {
		return this.size;
	}

	private void checkIndexBoundary(int index) throws UtilException {
		if (index > size || index < 0)
			throw new UtilException("Out of index");
	}

	public void insertAtStart(E e) throws UtilException {
		insertAt(e, 0);
	}

	public void insertAtEnd(E e) {
		add(e);
	}

	private void setAllNull(Node<E> node) {
		node.setData(null);
		node.setNext(null);
		node.setPrev(null);
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

	public void insertAt(E e, int index) throws UtilException {
		checkIndexBoundary(index);
		Node<E> nxt = head;
		if (index == size) {
			add(e);
		} else if (index == 0) {
			head = new Node<E>(e, null, null);
			head.setNext(nxt);
			nxt.setPrev(head);
		} else {
			for (int i = 0; i < index; i++) {
				nxt = nxt.getNext();
			}
			Node<E> prev = nxt.getPrev();
			Node<E> nw = new Node<E>(e, nxt, prev);
			prev.setNext(nw);
			nxt.setPrev(nw);
		}
		size++;
	}

	public void deleteAt(int index) throws UtilException {
		checkIndexBoundary(index);
		Node<E> del = head;
		if (index == 0) {
			head = head.getNext();
		} else if (index == size - 1) {
			del = last;
			last = last.getPrev();
			last.setNext(null);
		} else {
			for (int i = 0; i < index; i++) {
				del = del.getNext();
			}
			Node<E> nxt = del.getNext();
			Node<E> prev = del.getPrev();
			prev.setNext(nxt);
			nxt.setPrev(prev);
		}
		setAllNull(del);
		size--;
	}
}
