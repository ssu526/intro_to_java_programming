/*20.6 (Use iterators on linked lists) Write a test program that stores 5 million integers
in a linked list and test the time to traverse the list using an iterator vs. using
the get(index) method.*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Date;

public class IteratorVSLinkedList{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<5000000;i++){
			list.add((int)(Math.random()*10000)+1);
		}

		Iterator<Integer> iterator = list.iterator();

		Long begin = System.currentTimeMillis();
		System.out.println(begin);
		while(iterator.hasNext()){
			iterator.next();
		}

		Long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end-begin);
		System.out.println();

		begin=System.currentTimeMillis();
		System.out.println(begin);
		for(int i=0;i<5000000;i++){
			list.get(i);
		}
		end=System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end-begin);
	}
}