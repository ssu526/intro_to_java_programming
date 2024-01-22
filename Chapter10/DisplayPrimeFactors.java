//Chapter 10 - Question 5


/*
(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.
*/


class StackOfIntegers{

	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY=16;


	public StackOfIntegers(){
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity){
		elements = new int[capacity];
	}

	public void push(int value){
		if(size>=elements.length){
			int[] temp = new int[elements.length*2];
			System.arraycopy(elements, 0, temp,0,elements.length);
			elements=temp;
		}
		
		elements[size]=value;
		size++;
	}


	public int pop(){
		return elements[--size];		

	}


	public int peek(){
		return elements[size-1];
	}


	public boolean empty(){
		return size==0;
	}


	public int getSize(){
		return size;
	}

}


public class DisplayPrimeFactors{

	public static void main(String[] args){
		
		int value =120;

		StackOfIntegers factors = new StackOfIntegers(value/2);
		
		while(value!=1){
			
			for(int i=2;i<=value;i++){
				if(value%i==0){
					factors.push(i);
					value=value/i;
					break;
				}

			}

		}


      	int size=factors.getSize();
      	int[] decreasingIntegers = new int[size];
      
		for(int j=0;j<size;j++){
			decreasingIntegers[j]=factors.pop();
		}
      
      
      for(int k=size-1;k>=0;k--){
       		System.out.println(decreasingIntegers[k]); 
      }

	}

}