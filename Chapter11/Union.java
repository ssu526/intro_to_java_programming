/*11.14 (Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)

For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
each with five integers, and displays their union. The numbers are separated by
exactly one space in the output. Here is a sample run:

Enter five integers for list1: 3 5 45 4 3
Enter five integers for list2: 33 51 5 4 13
The combined list is 3 5 45 4 3 33 51 5 4 13
*/

import java.util.ArrayList;

public class Union{
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> unionList = new ArrayList<>();

        if(list1.size()>0){
    		for(int i=0;i<list1.size();i++){
    			unionList.add(list1.get(i));
    		}
        }

        if(list2.size()>0){
    		for(int j=0;j<list1.size();j++){
    			unionList.add(list2.get(j));
    		}
        }

		return unionList;
	}

	public static void main(String[] args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 =new ArrayList<>();

		list1.add(3);
		list1.add(5);
		list1.add(45);
		list1.add(4);
		list1.add(3);
		list2.add(33);
		list2.add(51);
		list2.add(5);
		list2.add(4);
		list2.add(13);

		ArrayList<Integer> union = union(list1, list2);

		System.out.print("The combined list is: ");
		for(int i=0;i<union.size();i++){
			System.out.print(union.get(i)+" ");
		}
	}
	
}
