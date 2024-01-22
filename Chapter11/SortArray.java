/*
11.11 (Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.
*/

import java.util.ArrayList;
public class SortArray{
	public static void sort(ArrayList<Integer> list){
		int size = list.size();
		int min, temp,index;

		for(int i=0;i<size;i++){
			min = list.get(i);
			index=i;
			
			for(int j=i+1;j<size;j++){
				if(list.get(j)<min){
					min=list.get(j);
					index=j;
				}
			}
			
			temp=list.get(i);
			list.set(i,min);
			list.set(index,temp);
		}
	}

	public static void main(String[] args){

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(145);
		numbers.add(53);
		numbers.add(33);
		numbers.add(-4);
		numbers.add(99);
		sort(numbers);
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
	}
}


