package com.elephant.generics;

/**
 * A stack implemented with an internal linked structure
 */

public class LinkedStack<T> {
	// inner class node
	private static class Node<U>{
		U item;
		Node<U> next;
		Node() {item=null;item=null;}
		Node(U item,Node<U> next){this.item=item;this.next=next;}
		boolean end(){return item==null&& next==null;}
	}

	private Node<T> top=new Node<T>(); // End sentinel
// push
	public void push(T item){
		top=new Node<T>(item,top);
	}
// pop
	public T pop(){
		T result=top.item;
		if (!top.end())
			top=top.next;
		return result;
	}

	public static void main(String[] args){
		LinkedStack<String> lss=new LinkedStack<String>();
		for (String s : "Pharsers on stun!".split(" "))
			lss.push(s);
		String s;
		while ((s=lss.pop())!=null)
			System.out.println(s);
	}
}
