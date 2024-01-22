/*
11.4 (Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.

public static Integer max(ArrayList<Integer> list)

Write a test program that prompts the user to enter a sequence of numbers ending
with 0, and invokes this method to return the largest number in the input.
*/

import java.util.*;

public class Max{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<>();
		int input;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers: ");
		
		do{
			input=sc.nextInt();
			if(input !=0){
				numbers.add(input);
			}
		}while(input != 0);

		if(numbers.size()==0 || numbers == null){
			System.out.println("Null");
		}else{
			System.out.println("The maximum number in the list is "+max(numbers));
		}
	}

	public static int max(ArrayList<Integer> numbers){
		int size = numbers.size();
		int max=numbers.get(0);

		for(int i=1;i<size;i++){
			if(numbers.get(i)>max){
				max=numbers.get(i);
			}
		}

		return max;
	}

}

