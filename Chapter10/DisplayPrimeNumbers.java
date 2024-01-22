
//Chapeter 10 - Question 6


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

public class DisplayPrimeNumbers{

	public static void main(String[] args){

		int number = 120;
		StackOfIntegers primes = new StackOfIntegers();

		for(int i=2;i<number;i++){
			if(isPrime(i)){
				primes.push(i);
			}

		}


		int size = primes.getSize();
		int[] primeNumbers = new int[size];

		for(int j=0;j<size;j++){

			primeNumbers[j]=primes.pop();
		}

		for(int k=size-1;k>=0;k--){
			System.out.print(primeNumbers[k]+" ");
		}
		

	}



	public static boolean isPrime(int number){
		
		for(int i=3;i<=number/2+1;i++){
			if(number%i==0){
				return false;
			}
		}

		return true;
		
	}


}
