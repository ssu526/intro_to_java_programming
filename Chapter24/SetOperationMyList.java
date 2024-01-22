/* 24.1
(Add set operations in MyList) Define the following methods in MyList and implement them in MyAbstractList:

/** Adds the elements in otherList to this list.
* Returns true if this list changed as a result of the call */
// public boolean addAll(MyList<E> otherList);

/** Removes all the elements in otherList from this list
* Returns true if this list changed as a result of the call */
// public boolean removeAll(MyList<E> otherList);

/** Retains the elements in this list that are also in otherList * Returns true if this list changed as a result of the call */
// public boolean retainAll(MyList<E> otherList);

/*
Write a test program that creates two MyArrayLists, list1 and list2, with the initial values {"Tom", "George", "Peter", "Jean", "Jane"} 
and {"Tom", "George", "Michael", "Michelle", "Daniel"}, then per- form the following operations:

- Invokes list1.addAll(list2), and displays list1 and list2.
- Recreates list1 and list2 with the same initial values, invokes list1.removeAll(list2), and displays list1 and list2.
- Recreates list1 and list2 with the same initial values, invokes list1.retainAll(list2), and displays list1 and list2.

*/




public class SetOperationMyList{
	public static void main(String[] args){
		String[] list1 = {"Tom", "George", "Peter", "Jean", "Jane"};
		String[] list2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};

		MyArrayList<String> s1 = new MyArrayList<>(list1);
		MyArrayList<String> s2 = new MyArrayList<>(list2);

		s1.addAll(s2);
		print(s1);
		System.out.println("");

		s1 = new MyArrayList<>(list1);
		s1.removeAll(s2);
		print(s1);
		System.out.println("");

		s1 = new MyArrayList<>(list1);
		s1.retainAll(s2);
		print(s1);
		System.out.println("");
	}

	public static void print(MyArrayList<String> s){
		for(int i=0;i<s.size();i++){
			System.out.print(s.get(i)+" ");
		}
	}
}


