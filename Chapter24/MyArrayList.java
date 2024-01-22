

import java.util.*;

public class MyArrayList<E> extends MyAbstractList<E>{

	public static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];


	public MyArrayList(){
	}


	public MyArrayList(E[] objects){
		for(int i=0;i<objects.length;i++){
			add(objects[i]);
		}
	}

	public void add(int index, E e){
		ensureCapacity();

		for(int i=size-1;i>=index;i--){
			data[i+1]=data[i];
		}

		data[index]=e;
		size++;
	}

	public void ensureCapacity(){
		if(size>=data.length){
			E[] temp = (E[]) new Object[data.length*2+1];
			System.arraycopy(data,0,temp,0,size);
			data = temp;
		}
	}

	public void clear(){
		data = (E[]) new Objects[INITIAL_CAPACITY];
		size=0;
	}

	public boolean contains(E e){
		for(int i=0;i<size;i++){
			if(data[i].equals(e)){
				return true;
			}
		}

		return false;
	}


	public E get(int index){
		checkIndex(index);
		return data[index];
	}

	public void checkIndex(int index){
		if(index< 0 || index>=size){
			throw new IndexOutOfBoundsException("Index out of bound");
		}
	}


	public int indexOf(E e){

		for(int i=0;i<size;i++){
			if(data[i].equals(e)) return i;
		}

		return -1;
	}

	
	public int lastIndexOf(E e){
		for(int i=size-1;i>=0;i--){
			if(data[i].equals(e)){
				return i;
			}
		}

		return -1;
	}
	

	
	public E remove(int index){
		checkIndex(index);

		E removed = data[index];
		for(int i=index;i<size-1;i++){
			data[i]=data[i+1];
		}
		data[size-1]=null;
		size--;
		return removed;
	}
	
	public E set(int index, E e){
		checkIndex(index);

		E replaced = data[index];
		data[index]=e;

		return replaced;
	}


	//textbook uses StringBuilder
	public String toString(){
		String str="";

		for(E e:data){
			str = str +" "+e;
		}

		return str;
	}

	public void trimtosize(){
		E[] temp = (E[]) new Object[size];
		System.arraycopy(data,0,temp,0,size);
		data=temp;
	}

	public java.util.Iterator<E> iterator(){
		return new ArrayListIterator();
	}


	private class ArrayListIterator implements java.util.Iterator<E>{
		private int current = 0;

		public boolean hasNext(){
			return current<size;   //textbook: current<size-1;
		}


		public E next(){
			return data[current++];
		}

		public void remove(){
			MyArrayList.this.remove(current);
		}


	}


	/** Adds the elements in otherList to this list.
	* Returns true if this list changed as a result of the call */
	public boolean addAll(MyList<E> otherList){
		int lastSize=size;

		for(int i=0;i<otherList.size();i++){
			add(otherList.get(i));
		}

		return lastSize!=size;
	}


	/** Removes all the elements in otherList from this list
	* Returns true if this list changed as a result of the call */
	public boolean removeAll(MyList<E> otherList){
		int lastSize = size;

		for(int i=0;i<size;i++){
			if(otherList.contains(get(i))){
				remove(i);
			}
		}

		return lastSize!=size;
	}



	public boolean retainAll(MyList<E> otherList){
		int lastSize=size;

		for(int i=0;i<size;i++){
			if(!otherList.contains(get(i))){
				remove(i);
			}
		}

		return lastSize!=size;
	}

}
