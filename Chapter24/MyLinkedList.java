/*

*24.2 (Implement MyLinkedList) The implementations of the methods 

contains(E e)
get(int index)
indexOf(E e)
lastIndexOf(E e)
set(int index, E e) 

are omitted in the text. Implement these methods.

*/

public class MyLinkedList<E> extends MyAbstractList<E>{
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
		newNode.next=head;
		head=newNode;
		size++;

		if(tail==null){
			tail=head;
		}

	}

	public void addLast(E e){
		Node<E> newNode = new Node<>(e);

		if(tail==null){
			head=newNode;
			tail=head;

		}else{
			tail.next=newNode;
			tail=tail.next;
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
			previous.next=newNode;
			(previous.next).next=temp;
			size++;

		}
	}

	public E removeFirst(){
		if(size==0){
			return null;
		}else{
			Node<E> removed = head;
			head=head.next;
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
			Node<E> previous=head;
			for(int i=0;i<index-1;i++){
				previous=previous.next;
			}

			Node<E> removed = previous.next;
			previous.next=removed.next;
			size--;
			return (E)removed.element;

		}

	}


	public boolean contains(E e){
		if(size==0){
			return false;
		}else{
			Node current = head;
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
		Node next;

		public Node(E element){
			this.element=element;
		}
	}


	private class LinkedListIterator implements java.util.Iterator<E>{

		private Node<E> current=head;
		private Node<E> previous1=null;
		private Node<E> previous2=null;
		private boolean removeCalled = false;

		public boolean hasNext(){
			return current.next!=null;
		}

		public E next(){
			E e = current.element;
			previous2=previous1;
			previous1=current;
			current=current.next;
			removeCalled=false;
			return e;
		}

		public void remove(){
			if(previous1==null || removeCalled==true){  //next() is called at least once; remove() is not called immediately after a remove();
				throw new IllegalStateException();
			}else if(previous2==null){ //the last next() call return the head
				head=current;
			}else{
				previous2.next=current;
			}

			removeCalled=true;

			size--;
		}

	}



}


