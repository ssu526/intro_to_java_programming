//chapter 7 - Question 31

/*
(Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list.

public static int[] merge(int[] list1, int[] list2)

Implement the method in a way that takes at most list1.length + list2.
length comparisons. Write a test program that prompts the user to enter two
sorted lists and displays the merged list. Here is a sample run. Note that the first
number in the input indicates the number of the elements in the list. This number
is not part of the list.

Enter list1: 5 1 5 16 61 111
Enter list2: 4 2 4 5 6
The merged list is 1 2 4 5 5 6 16 61 111

*/

import java.util.Scanner;
import java.util.Arrays;

public class MergeList{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list1: ");
		int lenList1 = sc.nextInt();
		int[] list1 = new int[lenList1];
		for(int i=0;i<lenList1;i++){
			list1[i]=sc.nextInt();
		}


		System.out.println("Enter list 2: ");
		int lenList2=sc.nextInt();
		int[] list2 = new int[lenList2];
		for(int j=0;j<lenList2;j++){
			list2[j]=sc.nextInt();
		}


		int[] mergeList = merge(list1, list2);

		System.out.print("The merged list is ");
		for(int k=0;k<mergeList.length;k++){
			System.out.print(mergeList[k]+" ");
		}

		System.out.println("");
	}



	public static int[] merge(int[] list1, int[] list2){
		
		int length=list1.length+list2.length;
		int[] mergeList=new int[length];

		for(int i=0;i<list1.length;i++){
			mergeList[i]=list1[i];
		}


		for(int j=0;j<list2.length;j++){

			mergeList[list1.length+j]=list2[j];
		}


		Arrays.sort(mergeList);
		return mergeList;

	}

}

