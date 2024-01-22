//Chapter 8 - Question 28

/*
(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. Write a method that returns true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are strictly identical.

*/

import java.util.Scanner;

public class StrictlyIdenticalArrays{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter list 1: ");
		int[][] list1 = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				list1[i][j]=sc.nextInt();
			}
		}

	
		System.out.print("Enter list 2: ");
		int[][] list2 = new int[3][3];
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				list2[a][b]=sc.nextInt();
			}
		}

		boolean isIdentical=equals(list1, list2);

		if(isIdentical==true){
			System.out.println("The two arrays are strictly identical");
		}else{
			System.out.println("The two arrays are not strictly identical");
		}

	}

	public static boolean equals(int[][] m1, int[][] m2){

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(m1[i][j]!=m2[i][j]){
					return false;
				}
			}
		}

		return true;

	}
}