/*

24.3 (Implement a doubly linked list) The MyLinkedList class used in Listing 24.6 is a one-way directional linked list that enables one-way traversal of the list. Modify the Node class to add the new data field name previous to refer to the previous node in the list, as follows:

public class Node<E> { 
	E element;
	Node<E> next; 
	Node<E> previous;

	public Node(E e) { 
		element = e;
	} 
}


Implement a new class named TwoWayLinkedList that uses a doubly linked list to store elements. 
The MyLinkedList class in the text extends MyAbstractList. Define TwoWayLinkedList to extend the java.util.AbstractSequentialList class. 
You need to implement all the methods defined in MyLinkedList as well as the methods listIterator() and listIterator(int index). 
Both return an instance of java.util.ListIterator<E>. The former sets the cursor to the head of the list and the latter to the element at the 
specified index.

*/

/*
void	add(int index, E element)
boolean	addAll(int index, Collection<? extends E> c)
E	get(int index)
Iterator<E>	iterator()
abstract ListIterator<E>	listIterator(int index)
E	remove(int index)
E	set(int index, E element)
*/

import java.util.*;

public class TwoWayLinkedList<E> extends java.util.AbstractSequentialList{

	private Node head, tail;

	public MyLinkedList(){

	}

	public MyLinkedList(E[] objects){
		super(objects);
	}

	public E getFirst(){
		if(size==0){
			return null;
		}else{
			return (E)head.element;
		}
	}


	public E getLast(){
		if(size==0){
			return null;
		}else{
			return (E)tail.element;
		}
	}


	public void addFirst(E e){

		Node<E> newNode = new Node<>(e);

		if(head==null){
			head=newNode;
			tail=head;
		}else{
			head.previous=newNode;
			newNode.next=head;
			head=newNode;
			size++;
		}


	}

	public void addLast(E e){
		Node<E> newNode = new Node<>(e);

		if(tail==null){
			head=newNode;
			tail=head;

		}else{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
		}

		size++;

	}

	public void add(int index, E e){

		Node<E> newNode = new Node(e);

		if(index==0){
			addFirst(e);
		}else if(index>=size){
			addLast(e);
		}else{
			Node<E> previous = head;
			for(int i=0;i<index-1;i++){
				previous=previous.next;
			}

			Node<E> temp=previous.next;
			newNode.previous=previous;
			previous.next=newNode;
			newNode.next=temp;
			temp.previous=newNode;
			size++;

		}
	}

	public E removeFirst(){
		if(size==0){
			return null;
		}else{
			Node<E> removed = head;
			head=head.next;
			head.previous=null;
			size--;

			if(head==null) tail=null;
			return removed.element;
		}
	}


	public E removeLast(){
		if(size==0){
			return null;
		}else if(size==1){
			Node<E> temp = head;
			head=null;
			tail=head;
			size=0;
			return (E)temp.element;

		}else{
			
			Node<E> previous = head;

			for(int i=0;i<size-2;i++){
				previous=previous.next;
			}

			Node<E> removed = tail;
			tail=previous;
			tail.next=null;
			size--;
			return (E)removed.element;
		}
	}
	

	public E remove(int index){
		
		if(index<0 || index>=size){
			return null;
		}else if(index==0){
			return removeFirst();
		}else if(index>=size-1){
			return removeLast();
		}else{
			Node<E> current=head;
			for(int i=0;i<index;i++){
				current=current.next;
			}

			Node<E> removed = current;
			current.previous.next=current.next;
			current.next.previous=current.previous;

			size--;
			return (E)removed.element;

		}

	}


	public boolean contains(E e){
		if(size==0){
			return false;
		}else{
			Node<E> current = head;
			for(int i=0;i<size;i++){
				if(current.element.equals(e)){
					return true;
				}else{
					current=current.next;
				}
			}
		}

		return false;
	}

	public E get(int index){
		if(index<0 || index>size-1){
			return null;
		}else{
			Node current = head;
			for(int i=0;i<index;i++){
				current=current.next;
			}
			return (E)current.element;
		}
	}

	public int indexOf(E e){
		Node<E> current=head;

		for(int i=0;i<size;i++){
			if(current.element.equals(e)){
				return i;
			}else{
				current=current.next;
			}
		}

		return -1;
	}


	public int lastIndexOf(E e){
		Node<E> current = head;
		int lastIndex = -1;

		for(int i=0;i<size;i++){
			if(current.element.equals(e)){
				lastIndex=i;
			}
			current=current.next;
		}

		return lastIndex;

	}


	public E set(int index, E e){
		Node<E> current=head;

		for(int i=0;i<index;i++){
			current=current.next;
		}

		E temp = current.element;
		current.element=e;

		return temp;

	}


	public java.util.Iterator<E> iterator(){
		return new LinkedListIterator();
	}

	public void clear(){
		head=null;
		tail=head;
		size=0;
	}


	public String toString(){
		String str = "";
		Node current=head;

		for(int i=0;i<size;i++){
			str=str+current.element+" ";
			current=current.next;
		}

		return str;
	}


	private static class Node<E>{
		E element;
		Node<E> next;
		Node<E> previous;

		public Node(E element){
			this.element=element;
		}
	}


	private class LinkedListIterator implements java.util.Iterator<E>{

		private Node<E> current=head;
		private boolean removeCalled = false;

		public boolean hasNext(){
			return current.next!=null;
		}

		public E next(){
			E e = current.element;
			current=current.next;
			removeCalled=false;
			return e;
		}

		public void remove(){

			if(removeCalled==true{
					throw new IllegalStateException();

			}else if(current==null){
				current.previous.previous=null;
			}else{
				current.previous.previous.next=current;
				current.previous=current.previous.previous;
			}

			removeCalled=true;

			size--;
		}

	}

}