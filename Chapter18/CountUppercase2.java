/*
18.16 (Find the number of uppercase letters in an array) Write a recursive method
to return the number of uppercase letters in an array of characters. You need to
define the following two methods. The second one is a recursive helper method.

public static int count(char[] chars)
public static int count(char[] chars, int high)

Write a test program that prompts the user to enter a list of characters in one line
and displays the number of uppercase letters in the list.
*/

public class CountUppercase2{
	public static void main(String[] args){
		char[] chars ={'a','b','C','D','e','F'};
		System.out.println(count(chars));
	}

	public static int count(char[] chars){
		return count(chars,0);
	}

	public static int count(char[] chars, int high){
		int count = (Character.isUpperCase(chars[high]))? 1:0;

		if(high==chars.length-1){
			return count;
		}else{
			return count+count(chars,high+1);
		}
	}


}
