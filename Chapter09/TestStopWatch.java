package Chapter9Q6;

//Chapter 9 - Question 6

/*
(Stopwatch) Design a class named StopWatch. The class contains:
- Private data fields startTime and endTime with getter methods.
- A no-arg constructor that initializes startTime with the current time.
- A method named start() that resets the startTime to the current time.
- A method named stop() that sets the endTime to the current time.
- A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.

Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.

*/

public class TestStopWatch{

	public static void main(String[] args){

		StopWatch test1 = new StopWatch();
		
		int[] numbers = new int[100000];
		for(int i=0;i<100000;i++){

			numbers[i]=(int)(Math.random()*100000);
		}


		test1.start();
		selectionSort(numbers);
		test1.stop();

		System.out.println("Time elapsed: "+test1.getElapsedTime()+" milliseconds.");
	}

	

	public static int[] selectionSort(int[] numbers){
		int len = numbers.length;
		int smallest, index, temp;

		for(int i=0;i<len-1;i++){

			smallest=numbers[i];
			index=i;

			for(int j=i+1;j<len;j++){
				if(numbers[j]<smallest){
					smallest=numbers[j];
					index=j;
				}

			}

			temp=numbers[i];
			numbers[i]=smallest;
			numbers[index]=temp;

		}
      
      
      	return numbers;


	}

} 



