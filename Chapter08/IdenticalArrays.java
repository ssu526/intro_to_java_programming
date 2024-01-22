//Chapter 8 - Question 29

/*
(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they have the same contents. Write a method that returns true if m1 and m2 are iden- tical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are identical. 

*/

import java.util.Scanner;
import java.util.Arrays;
public class IdenticalArrays{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				list1[i][j]=sc.nextInt();
			}
		}

		System.out.print("Enter list2: ");
		for(int m=0;m<3;m++){
			for(int n=0;n<3;n++){
				list2[m][n]=sc.nextInt();
			}
		}

		boolean isEqual=equals(list1,list2);

		if(isEqual==true){
			System.out.println("The two array are identical");
		}else{
			System.out.println("The two array are not identical");
		}
	}

	public static boolean equals(int[][] m1, int[][] m2){
		int[] list1= new int[9];
		int[] list2=new int[9];
		int count1=0;
		int count2=0;

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				list1[count1]=m1[i][j];
				count1++;
			}
		}

		for(int m=0;m<3;m++){
			for(int n=0;n<3;n++){
				list2[count2]=m2[m][n];
				count2++;
			}
		}

		Arrays.sort(list1);
		Arrays.sort(list2);

		for(int k=0;k<9;k++){
			if(list1[k]!=list2[k]){
				return false;
			}
		}

		return true;
	}



}