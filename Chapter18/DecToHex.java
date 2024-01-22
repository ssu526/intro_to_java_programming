/*
18.22 (Decimal to hex) Write a recursive method that converts a decimal number into a hex number as a string. The method header is:
public static String dec2Hex(int value)
Write a test program that prompts the user to enter a decimal number and dis-
plays its hex equivalent.
*/

import java.util.Scanner;

public class DecToHex{
	public static void main(String[] arges){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println(reverse(dec2Hex(number)));

	}

	public static String reverse(String s){
		String reverse="";

		for(int i = s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}

		return reverse;
	}

	public static String dec2Hex(int number){
		String s = "";

		if(number/16==0){
			s=s+convert(number);
		}else{
			s=convert(number%16)+dec2Hex(number/16);
		}

		return s;
	}

	public static String convert(int n){
		String hex="";
		if(n>=0 && n<=9){
			hex = String.valueOf(n);
		}else{
			switch(n){
				case 10: hex = "A";break;
				case 11: hex = "B";break;
				case 12: hex = "C";break;
				case 13: hex = "D";break;
				case 14: hex = "E";break;
				case 15: hex = "F";
			}
		}

		return hex;
	}
}