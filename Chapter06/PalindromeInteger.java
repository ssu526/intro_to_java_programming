//Chapter 6 - Question 3

import java.util.Scanner;

public class PalindromeInteger{


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int userInput = input.nextInt();;

		System.out.println(isPalindrome(userInput) ? "Palindrome number":"Not a palindrome number");

	}


	public static boolean isPalindrome(int number){

		return (number==reverse(number));


	}


	public static int reverse(int number){

		String numberString = Integer.toString(number);
		int length = numberString.length();
		String reverseNumber="";
		int reverse;
		
		for(int i=length-1;i>=0;i--){

			reverseNumber=reverseNumber.concat(Character.toString(numberString.charAt(i)));
		
		}

		reverse=Integer.parseInt(reverseNumber);
      
		return reverse;

	}


}