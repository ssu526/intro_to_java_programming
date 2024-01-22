//Chapter 7 - Question 17

/*

(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are swapped;
otherwise, the values remain unchanged. The technique is called a bubble sort or
sinking sort because the smaller values gradually ìbubbleî their way to the top
and the larger values ìsinkî to the bottom. Write a test program that reads in ten
double numbers, invokes the method, and displays the sorted numbers.


*/


import java.util.Scanner;

public class BubbleSort{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers: ");

		double[] numbers=new double[10];

		for(int i=0;i<numbers.length;i++){
			numbers[i]=sc.nextDouble();
			
		}

		double[] sortedNumbers=bubbleSort(numbers);

		for(int j=0;j<sortedNumbers.length;j++){
			System.out.println(sortedNumbers[j]);

		}

	}


	public static double[] bubbleSort(double[] numbers){

		double temp;
      	int length=numbers.length;
      	int index=length-1;

      while(index>0){ 
		for(int i=0;i<index;i++){
			if(numbers[i]>numbers[i+1]){

				temp=numbers[i];
				numbers[i]=numbers[i+1];
				numbers[i+1]=temp;
				
			}

        }
          
          index--;
          
        }

		return numbers;


	}





}