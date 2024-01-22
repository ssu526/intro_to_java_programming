/*
18.8 (Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:
public static void reverseDisplay(int value)
For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal.
*/

public class ReverseInteger{
	public static void main(String[] args){
		int number =1234567;
		reverse(number);
	}

	public static void reverse(int n){
		if(n>=0 && n<=9){
			System.out.print(n+"\n");
		}else{
			System.out.print(n%10);
			reverse(n/10);
		}
	}
}