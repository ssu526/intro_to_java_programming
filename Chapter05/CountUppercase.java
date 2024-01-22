//Chapter 5 - Question 50

import java.util.Scanner;

public class CountUppercase{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine();

		int length = userInput.length();
		int uppercaseCount=0;
	
		for(int i=0;i<length;i+=1){
			if(userInput.charAt(i)>='A' && userInput.charAt(i)<='Z'){
				uppercaseCount++;
			}

		}

		System.out.println(userInput+" has "+uppercaseCount+" uppercase letters.");

	}

}