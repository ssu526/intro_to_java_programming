/*20.1 (Display words in ascending alphabetical order) Write a program that reads
words from a text file and displays all the words (duplicates allowed) in ascending
alphabetical order. The words must start with a letter. The text file is passed
as a command-line argument.*/


import java.util.*;
import java.io.*;

public class WordsInAlphabeticalOrder{
	public static void main(String[] args) throws IOException{
		String input = args[0];
		File file = new File(input);
		ArrayList<String> words = new ArrayList<>();

		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()){
			String word = sc.next();
			if(word.charAt(0)>='a' && word.charAt(0)<='z' || word.charAt(0)>='A' && word.charAt(0)<='Z'){
				words.add(word);
			}
		}


		Collections.sort(words);

		for(String w: words){
			System.out.println(w);
		}
	}
}