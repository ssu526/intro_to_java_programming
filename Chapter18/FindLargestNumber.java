/*
18.13 (Find the largest number in an array) Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element.
*/

public class FindLargestNumber{
	public static void main(String[] args){
		int[] list = {4,6,0,23,-9,18,53,7};
		System.out.println("The largest number is "+findLargest(list));
	}

	public static int findLargest(int[] list){
		return findLargest(list,0,list[0]);
	}

	public static int findLargest(int[] list, int index, int high){

		if(index==list.length-1){
			return high;
		}else{
			if(list[index+1]>high){
				return findLargest(list,index+1,list[index+1]);
			}else{
				return findLargest(list,index+1,high);
			}
		}
	}

}

/*


import java.util.*;

public class LargestNumber{
	public static void main(String[] args){
		int[] list = {4,6,0,23,-9,18,53,7};
		System.out.println("The largest number is "+findLargest(list));
	}

	public static int findLargest(int[] list){
		if(list.length==2){
			return (list[0]>list[1]) ? list[0] : list[1];
		}else{
			int[] list1 = new int[list.length/2];
			int[] list2 = new int[list.length/2];

			for(int i=0;i<list1.length;i++){
				list1[i]=list[i];
			}

			for(int j=list2.length;j<list.length;j++){
				list2[j-list2.length]=list[j];
			}

			int[] newList={findLargest(list1),findLargest(list2)};
			return findLargest(newList);
		}
	}

}
*/