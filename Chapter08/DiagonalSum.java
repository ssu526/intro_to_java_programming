//Chapter 8 - Question 2


/*
(Sum the major diagonal in a matrix) Write a method that sums all the numbers
in the major diagonal in an n * n matrix of double values using the following
header:

public static double sumMajorDiagonal(double[][] m)

Write a test program that reads a 4-by-4 matrix and displays the sum of all its
elements on the major diagonal.

*/

import java.util.Scanner;

public class DiagonalSum{

	public static void main(String[] args){
		
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		Scanner sc = new Scanner(System.in);
		double[][] matrix = new double[4][4];

		for(int row=0;row<4;row++){
			for(int col=0;col<4;col++){
				matrix[row][col]=sc.nextDouble();
			}
		}



		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
	}


	public static double sumMajorDiagonal(double[][] m){

		double total=0;

		for(int i=0;i<4;i++){
			total=total+m[i][i];

		}

		return total;

	}





}



