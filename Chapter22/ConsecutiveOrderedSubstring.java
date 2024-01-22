/* 22.1 (Maximum consecutive increasingly ordered substring) Write a program that prompts the user to enter a string and displays the maximum 
consecutive increasingly ordered substring. Analyze the time complexity of your program. Here is a sample run:

Enter a string:abcabcdgabxy
abcdg

Enter a string: abcabcdgabmnsxy
abmnsxy

*/

import java.util.Scanner;

public class ConsecutiveOrderedSubstring{
	public static void main(String[] args){
		String s = "abcabcdgabmnxyz";
		int length = s.length();
		int start = 0;
		int end = 0;
		int maxStart = 0;
		int maxEnd=0;
		int max = end-start+1;

		while(end<length-1){
			if(s.charAt(end)<s.charAt(end+1)){
				end++;
			}else{
				if(max<end-start+1){
					max=end-start+1;
					maxStart=start;
					maxEnd=end;
				}

				end++;
				start=end;
			}
		}

		if(max<end-start+2){
			maxStart=start;
			maxEnd=end;
		}

		System.out.println(s.substring(maxStart,maxEnd+1));
	}
}