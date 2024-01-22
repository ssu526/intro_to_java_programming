/**22.2 (Maximum increasingly ordered subsequence) Write a program that prompts
the user to enter a string and displays the maximum increasingly ordered subsequence
of characters. Analyze the time complexity of your program. Here is
a sample run:

Enter a string: Welcome
Welo

*/


public class MaxOrderedSubsequence{
	public static void main(String[] args){
		String s = "wphijklmnbcdefghijkdz";
		int length = s.length();
		String substring = "";
		String maxString = "";

		for(int i=0;i<length-1;i++){
			substring=String.valueOf(s.charAt(i));

			for(int j=i+1;j<length;j++){
				if(s.charAt(j)>substring.charAt(substring.length()-1)){
					substring=substring+String.valueOf(s.charAt(j));
				}
			}

			if(maxString.length()<substring.length()){
				maxString=substring;
			}	
		}

		System.out.println(maxString);
	}
}


