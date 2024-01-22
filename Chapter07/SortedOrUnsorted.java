//Chapter 7 - Question 19

/*
(Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list. This number is not part
of the list.


Enter list: 8 10 1 5 16 61 9 11 1
The list is not sorted


Enter list: 10 1 1 3 4 4 5 7 9 11 21
The list is already sorted


*/

import java.util.Scanner;

public class SortedOrUnsorted{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list: ");
		
		int length=sc.nextInt();
		int[] list = new int[length];

		for(int i=0;i<length;i++){

			list[i]=sc.nextInt();

		}


		boolean isSorted = isSorted(list);

		if(isSorted==true){
			System.out.println("The list is already sorted");
		}else{
			System.out.println("The list is not sorted");
		}


	}



	public static boolean isSorted(int[] list){


		boolean isSorted=true;

		for(int i=0;i<list.length-1;i++){

			for(int j=i+1;j<list.length;j++){
				if(list[j]<list[i]){
					isSorted=false;
				}

			}

		}


		return isSorted;

	}






}

