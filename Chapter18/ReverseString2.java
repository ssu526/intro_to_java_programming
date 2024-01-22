/*
18.12 (Print the characters in a string reversely) Rewrite Programming Exercise 18.9
using a helper method to pass the substring high index to the method. The
helper method header is:
public static void reverseDisplay(String value, int high)
*/

public class ReverseString2{
	public static void main(String[] args){
		String s = "reverse";
		reverseDisplay(s);
	}

	public static void reverseDisplay(String s){
		reverseDisplay(s, s.length()-1);
	}

	public static void reverseDisplay(String s, int high){

		if(high==0){
			System.out.print(s.charAt(0)+"\n");
		}else{
			System.out.print(s.charAt(high));
			reverseDisplay(s,high-1);
		}
	}


}