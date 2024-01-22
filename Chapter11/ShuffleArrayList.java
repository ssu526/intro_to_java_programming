
/*
11.7 (Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)
*/
import java.util.*;

public class ShuffleArrayList{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i=1;i<=10;i++){
			numbers.add(i);
		}

		for(int j=0;j<numbers.size();j++){
			System.out.println(numbers.get(j));
		}
		
		Shuffle(numbers);

		for(int k=0;k<numbers.size();k++){
			System.out.println(numbers.get(k));
		}
	}

	public static void Shuffle(ArrayList<Integer> list){
		int size = list.size();
		int temp;
	
		for(int i=1;i<size-1;i++){
			int index=(int)(Math.random()*(size-i));
			temp=list.get(index);
			list.set(index,list.get(i-1));
			list.set(i-1,temp);				
		}
	}
}

