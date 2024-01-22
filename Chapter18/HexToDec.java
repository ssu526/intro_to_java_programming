/*18.24
(Hex to decimal) Write a recursive method that parses a hex number as a string into a decimal integer. The method header is:
public static int hex2Dec(String hexString)
Write a test program that prompts the user to enter a hex string and displays its
decimal equivalent.
*/

import java.util.Scanner;

public class HexToDec{
	public static void main(String[] args){
		System.out.println("Enter a hex String: ");
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		System.out.println(hex2Dec(hex));
	}

	public static int hex2Dec(String hexString){
		int number = 0;

		if(hexString.length()==1){
			number=number+convert(hexString.charAt(0));
		}else{
			number=number+convert(hexString.charAt(0))*(int)Math.pow(16,hexString.length()-1)+hex2Dec(hexString.substring(1));
		}

		return number; 
	}

	public static int convert(char c){
		int number=0;

		if(c>='0' && c<='9'){
			number=Integer.parseInt(String.valueOf(c));
		}else{
			switch(c){
				case 'A': number = 10;break;
				case 'B': number = 11;break;
				case 'C': number = 12;break;
				case 'D': number = 13;break;
				case 'E': number = 14;break;
				case 'F': number = 15;
			}
		}

		return number;
	}
}