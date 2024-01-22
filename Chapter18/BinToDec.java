/*18.23 (Binary to decimal) Write a recursive method that parses a binary number as a string into a decimal integer. The method header is:
public static int bin2Dec(String binaryString)
Write a test program that prompts the user to enter a binary string and displays its decimal equivalent.
*/


import java.util.Scanner;

public class BinToDec{
	public static void main(String[] args){
		System.out.println("Enter a binary string: ");
		Scanner sc = new Scanner(System.in);
		String binaryString = sc.next();
		System.out.println(bin2Dec(binaryString));
	}

	public static int bin2Dec(String binaryString){
		int number=0;

		if(binaryString.length()==1){
			if(binaryString.charAt(0)=='1'){
				number=number+1;
			}
		}else{
			if(binaryString.charAt(0)=='1'){
				number=number+(int)Math.pow(2,binaryString.length()-1)+bin2Dec(binaryString.substring(1));
			}else{
				number=number+bin2Dec(binaryString.substring(1));
			}

		}
		return number;
	}

}