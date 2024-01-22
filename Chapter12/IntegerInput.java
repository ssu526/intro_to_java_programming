
/*12.2 (InputMismatchException) Write a program that prompts the user to readtwo integers and displays their sum. Your program should prompt the user 
toread the number again if the input is incorrect.*/

import java.util.*;

public class IntegerInput{ 
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the numbers: "); 
		int first=0; int second=0; 
		boolean again=true; 
		do{ 
			try{ 
				first=sc.nextInt(); 
				second=sc.nextInt(); 
				again=false; }
			catch(InputMismatchException ex){ 
				System.out.println("Please enter 2 integers"); sc.nextLine(); 
			} 
		}while(again); 

		int sum=first+second; 
		System.out.println(first+" + "+second+" = "+sum); 
	}
} 
