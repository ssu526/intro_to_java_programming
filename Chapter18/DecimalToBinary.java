/*
18.21 (Decimal to binary) Write a recursive method that converts a decimal number into a binary number as a string. The method header is:
public static String dec2Bin(int value)
Write a test program that prompts the user to enter a decimal number and dis-
plays its binary equivalent.
*/

import java.util.Scanner;

public class DecimalToBinary{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println(reverseString(dec2Bin(number)));
	}

	public static String dec2Bin(int number){
		String b ="";

		if(number==1){
			b=b+1;
		}else{
			b=number%2+dec2Bin(number/2);
		}

		return b;
	}

	public static String reverseString(String s){
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}

		return reverse;
	}
}