import java.util.*;

public class TestMyLinkedList{
	public static void main(String[] args){
		MyLinkedList<String> myList = new MyLinkedList<>();
		myList.add("rose");
		myList.add("stars");
		myList.add("sunny");
		myList.add("bubble");
		myList.add("cozy");
		myList.add("stars");

		/*
		System.out.println(myList.getFirst());
		System.out.println(myList.getLast());
		myList.addFirst("lamp");
		System.out.println(myList.getFirst());
		myList.addLast("shower");
		System.out.println(myList.getLast());
		myList.remove("stars");
		myList.removeFirst();
		myList.removeLast();
		System.out.println(myList.toString());
		*/

		/*
		System.out.println(myList.contains("bubble"));
		System.out.println(myList.contains("house"));
		System.out.println(myList.get(2));
		System.out.println(myList.indexOf("stars"));
		System.out.println(myList.lastIndexOf("stars"));
		myList.set(myList.size()-1,"house");
		System.out.println(myList.toString());
		*/

		/*
		Iterator<String> it = myList.iterator();
		System.out.println(it.next());
		System.out.println(it.hasNext());
		it.remove();
		System.out.println(myList.toString());
		*/


		myList.add(1,"house");
		System.out.println(myList.toString());
	}
}