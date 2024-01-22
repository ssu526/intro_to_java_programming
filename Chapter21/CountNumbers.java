/*
21.6 (Count the occurrences of numbers entered) Write a program that reads an unspecified number of integers and finds the one that has the most 
occurrences. The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 3 3 2 0, the number 3 occurred most often. 
If not one but several numbers have the most occurrences, all of them should be reported. For example, since 9 and 3 appear twice in the 
list 9 30 3 9 3 2 4, both occurrences should be reported.
*/

import java.util.*;

public class CountNumbers{
	public static void main(String[] args){
		System.out.println("Enter a list of numbers: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int[] count = new int[10];

		for(int i=0;i<input.length();i++){
			char character = input.charAt(i);
			if(character>='0' && character<='9'){
				int digit = Integer.parseInt(String.valueOf(character));
				count[digit]++;
			}else{
				continue;
			}
		}

		int max=count[0];
		for(int d:count){
			if(d>max){
				max=d;
			}
		}


		for(int k=0;k<10;k++){
			if(count[k]==max){
				System.out.print(k+" ");
			}
		}
		System.out.println("");
	}
}