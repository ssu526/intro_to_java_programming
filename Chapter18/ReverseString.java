/*18.9 (Print the characters in a string reversely) Write a recursive method that displays
a string reversely on the console using the following header:
public static void reverseDisplay(String value)
For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.
*/

public class ReverseString{
	public static void main(String[] args){
		String s ="abcd";
		reverse(s);
	}

	public static void reverse(String s){
		if(s.length()==1){
			System.out.print(s+"\n");
		}else{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
	}
}