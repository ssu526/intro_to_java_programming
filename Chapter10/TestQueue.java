/*
(The Queue class) Section 10.6 gives a class for Stack. Design a class named Queue for storing integers. Like a stack, a queue holds elements. In a stack, the elements are retrieved in a last-in first-out fashion. In a queue, the elements are retrieved in a first-in first-out fashion. The class contains:
	- An int[] data field named elements that stores the int values in the queue.
	- A data field named size that stores the number of elements in the queue.
	- A constructor that creates a Queue object with default capacity 8.
	- The method enqueue(int v) that adds v into the queue.
	- The method dequeue() that removes and returns the element from the queue.
	- The method empty() that returns true if the queue is empty.
	- The method getSize() that returns the size of the queue.

Implement the class with the initial array size set to 8. 
The array size will be doubled once the number of the elements exceeds the size. 
After an element is removed from the beginning of the array, you need to shift all elements in the array one position the left. 
Write a test program that adds 20 numbers from 1 to 20 into the queue and removes these numbers and displays them.
*/

import java.lang.*;

class Queue{
	
	private int[] items;
	private int size;

	public Queue(){
		items = new int[8];
	}

	public void enqueue(int v){

		if(size==items.length){
			int[] tempArray = new int[size*2];
			System.arraycopy(items,0,tempArray,0,size);
			items=tempArray;
			items[size+1]=v;
			size=size+1;

		}else{
			items[size]=v;
			size=size+1;
		}
		
	}

	public int dequeue(){
		int returnValue = items[0];
		for(int i=0;i<size;i++){
			items[i]=items[i+1];
		}
		size=size-1;
		return returnValue;
	}

	public void empty(){
		for(int i=0;i<size;i++){
			items[i]=0;
		}
		size=0;
	}

	public int getSize(){
		return size;
	}

}

public class TestQueue{
	public static void main(String[] args){
		Queue q = new Queue();

		for(int i=1;i<=20;i++){
			q.enqueue(i);
		}

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.getSize());
	}
}