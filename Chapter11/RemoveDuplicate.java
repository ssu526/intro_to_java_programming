/*
11.13 (Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays
the distinct integers separated by exactly one space. Here is a sample run:
Enter ten integers: 34 5 3 5 6 4 33 2 2 4
The distinct integers are 34 5 3 6 4 33 2
*/

import java.util.ArrayList;

public class RemoveDuplicate{
    public static void removeDuplicate(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(j)==list.get(i)){
					list.remove(j);
				}
			}
		}
    }

	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(1);
		numbers.add(5);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		removeDuplicate(numbers);

		for(int i=0;i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}
	}

}

