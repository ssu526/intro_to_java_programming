//Chapter 5 - Question 46

import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String userInput = input.nextLine();

	int length=userInput.length();

	for(int i=length-1;i>=0;i--){
		System.out.print(userInput.charAt(i));
	}

	System.out.println("");


	}

}