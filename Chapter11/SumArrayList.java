/*11.12 (Sum ArrayList) Write the following method that returns the sum of all numbers
in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum.
*/

import java.util.ArrayList;

public class SumArrayList{
	public static double sum(ArrayList<Double> list){
		int size = list.size();
		double sum=0;

		for(int i=0;i<size;i++){
			sum=sum+list.get(i);
		}

		return sum;
	}

	public static void main(String[] args){
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(145.0);
		numbers.add(53.45);
		numbers.add(33.02);
		numbers.add(-4.2);
		numbers.add(99.67);
		System.out.println(sum(numbers));
	}
}
