/*
21.4 (Count consonants and vowels) Write a program that prompts the user to enter a text file name and displays the number of vowels and 
consonants in the file. Use a set to store the vowels A, E, I, O, and U.
*/

import java.util.Scanner;
import java.io.File;
import java.util.Set;
import java.util.Collections;

public class ConsonantsAndVowels{
	public static void main(String[] args) throws Exception{
		System.out.println("Enter a text file name");
		Scanner sc = new Scanner(System.in);
		File file = new File(sc.next());
		Scanner input = new Scanner(file);
		Set<Character> vowels = new java.util.HashSet<>();
		Collections.addAll(vowels,'A','E','I','O','U');
		int countVowels=0;
		int countConsonants=0;

		while(input.hasNext()){
			String next = input.next();
			for(int i=0;i<next.length();i++){
				if(vowels.contains(Character.toUpperCase(next.charAt(i)))){
					countVowels++;
				}else if(!vowels.contains(Character.toUpperCase(next.charAt(i))) && Character.toUpperCase(next.charAt(i))>=65 && Character.toUpperCase(next.charAt(i))<=90){
					countConsonants++;
				}else{

				}

			}
		}

		System.out.println(countConsonants);
		System.out.println(countVowels);

	}
	
}