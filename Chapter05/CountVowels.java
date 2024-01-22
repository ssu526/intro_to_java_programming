//Chapter 5 - Question 49


import java.util.Scanner;

public class CountVowels{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Ener a string: ");
		String userInput = input.nextLine();
		String lowercaseInput = userInput.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;

		for(int i=0;i<lowercaseInput.length();i++){
			if(lowercaseInput.charAt(i)=='a' || lowercaseInput.charAt(i)=='e' || lowercaseInput.charAt(i)=='i' || lowercaseInput.charAt(i)=='o' || lowercaseInput.charAt(i)=='u'){
				vowelCount=vowelCount+1;
			}
			else if(lowercaseInput.charAt(i)>='b' && lowercaseInput.charAt(i)<='z'){
				consonantCount=consonantCount+1;
			}else{}

		}

		System.out.println(userInput+" has "+vowelCount+" vowel(s).");

		System.out.println(userInput+" has "+consonantCount+" consonant(s).");
	
	
	}


}