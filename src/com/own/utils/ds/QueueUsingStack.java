package com.own.utils.ds;
import java.util.Stack;

/** Implement Queue using two stack in efficient way */
public class QueueUsingStack {

	public static void main(String[] args) {
		Queue<Integer> q=new Queue<Integer>();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.enQueue(13);
		q.enQueue(14);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}

class Queue<E> {
	Stack<E> s1, s2;

	public Queue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void enQueue(E e) {
		s1.push(e);
	}

	public E deQueue() {
		if (s2.size() > 0)
			return s2.pop();
		else if (s1.size() > 0) {
			while (s1.size()>0) {
				s2.push(s1.pop());
			}
			return s2.pop();
		}
		return null;
	}
}