/*11.10 (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented
using composition. Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes and then implement MyStack. Write
a test program that prompts the user to enter five strings and displays them in
reverse order.
*/

import java.util.ArrayList;

public class MyStack<E> extends ArrayList<E>{

	public boolean isEmpty(){
		return isEmpty();
    }

	public int getSize(){
		return size();
	}

	public E peek(){
		return get(size()-1);
	}
	
	public Object pop(){
		E o = get(size()-1);
		remove(size()-1);
		return o;
	}

	public void push(E o){
		add(o);
	}


	public static void main(String[] args){
		MyStack<String> myStack = new MyStack<>();

		String[] str = {"one", "two","three","four","five"};
		for(int i=0;i<5;i++){
			myStack.add(str[i]);
		}

		for(int i=4;i>=0;i--){
			System.out.println(myStack.peek());
			myStack.pop();
		}
	}
}
