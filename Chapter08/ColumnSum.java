//Chapter 8 - Question 1


/*
(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix
*/

import java.util.Scanner;

public class ColumnSum{

	public static void main(String[] args){
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		Scanner sc = new Scanner(System.in);

		double[][] matrix = new double[3][4];
		
		//read user input
		
		for(int row=0;row<3;row++){
			for(int col=0;col<4;col++){
				matrix[row][col]=sc.nextDouble();	
			
			}		

		}



		for(int i=0;i<4;i++){
			System.out.println("Sum of column "+i+" is "+sumColumn(matrix,i));

		}
	}


	public static double sumColumn(double[][] m, int columnIndex){

		double total=0;


		for(int j=0;j<3;j++){

			total=total+m[j][columnIndex];
		}

		
		return total;

	}
}

