//Chapter 8 - Question 13

/*

(Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array.

public static int[] locateLargest(double[][] a)

The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. Write a test program that prompts the user to enter a twodimensional
array and displays the location of the largest element in the array.

Here is a sample run:

Enter the number of rows and columns of the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is at (1, 2)

*/

import java.util.Scanner;

public class LargestElement{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows and columns of the array: ");
		int numberOfRows=sc.nextInt();
		int numberOfCols=sc.nextInt();
		double[][] matrix=new double[numberOfRows][numberOfCols];

		System.out.println("Enter the array: ");
		
		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfCols;j++){
				matrix[i][j]=sc.nextDouble();
			}
		}		
		

		int[] largestElement=new int[2];
		largestElement=locateLargest(matrix);

		System.out.println("The location of the largest element is at ("+largestElement[0]+", "+largestElement[1]+")");


	}


	public static int[] locateLargest(double[][] a){

		int[] largestElement=new int[2];
		double largest=a[0][0];
		largestElement[0]=0;
		largestElement[1]=0;

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]>largest){
					largest=a[i][j];
					largestElement[0]=i;
					largestElement[1]=j;
				}	
			}
		}

		return largestElement;

	}

}