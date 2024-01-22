//Chapter 7 - Question 10

/*

(Find the index of the smallest element) Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:

public static int indexOfSmallestElement(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index.


*/


import java.util.Scanner;

public class IndexOfSmallestElement{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten values: ");

		double[] values= new double[10];
	
		for(int i=0;i<10;i++){
			values[i]=sc.nextDouble();

		}


		int index=indexOfSmallestElement(values);
		System.out.println("The smallest element is at index "+index);


	}


	public static int indexOfSmallestElement(double[] array){

		int index=0;
      	double min =array[0];

		for(int i=1;i<10;i++){
			if(array[i]<min){
				min=array[i];
              	index=i;
			}
			

		}
      
      	return index;

	}



}