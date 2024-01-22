/*
12.30 (Occurrences of each letter) Write a program that prompts the user to enter
a file name and displays the occurrences of each letter in the file. Letters are
case-insensitive. Here is a sample run:

Enter a filename: Lincoln.txt
Number of A's: 56
Number of B's: 134
...
Number of Z's: 9
*/
import java.util.Scanner;
import java.io.*;

public class LetterOccurence{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a filename: ");
		String fileName=sc.next();
	
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("File does not exist");
			System.exit(1);
		}

		int[] count = new int[52];
		Scanner input = new Scanner(file);
		while(input.hasNext()){
			String word = input.next();
			for(int i=0;i<word.length();i++){
				if(word.charAt(i)>=65 && word.charAt(i)<=90){
					count[(int)(word.charAt(i))-65]++;
				}else if(word.charAt(i)>=97 && word.charAt(i)<=122){
					count[(int)(word.charAt(i))-97+26]++;
				}
			}
		}


		for(int i=0;i<26;i++){
			System.out.println("Number of "+(char)(i+65)+": "+count[i]);
		}

		for(int i=26;i<52;i++){
			System.out.println("Number of "+(char)(i+97-26)+": "+count[i]);
		}
	}
}



