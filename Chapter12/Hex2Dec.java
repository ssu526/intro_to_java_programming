
/**12.6 (NumberFormatException) Listing 6.8 implements the hex2Dec(String hexString) method, which converts a hex string into a decimal number. 
Implement the hex2Dec method to throw a NumberFormatException if the string is not a hex string.*/

import java.util.Scanner;

public class Hex2Dec { 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a hex number: "); 
		String hex = input.nextLine(); 

		try{ 
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase())); 
		}catch(NumberFormatException ex){ 
			System.out.println("Invalid hex number."); 
		} 
	} 

	static int hexToDecimal(String hex) throws NumberFormatException{ 
		int decimalValue = 0; 
		for (int i = 0; i < hex.length(); i++) { 
			char hexChar = hex.charAt(i); 
			if(hexChar >= 'A' && hexChar <= 'F' || hexChar>='1' && hexChar<='9') 
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar); 
			else 
				throw new NumberFormatException(); 
		} 
		return decimalValue; 
	} 

	static int hexCharToDecimal(char ch){ 
		if (ch >= 'A' && ch <= 'F') 
			return 10 + ch - 'A'; 
		else return ch-'0'; 
	}
} 
