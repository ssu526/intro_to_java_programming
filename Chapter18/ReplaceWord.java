/*
18.31
(Replace words) Write a program that replaces all occurrences of a word with a new word in all the files under a directory, recursively. Pass the parameters from the command line as follows:
java Exercise18_31 dirName oldWord newWord
*/

import java.util.*;
import java.io.*;

public class ReplaceWord.java{
	public static void main(String[] args){
		File path = new File(args[0]);
		String oldWord = args[1];
		String newWord = args[2];

		replace(path, oldWord, newWord);
	}

	public static void replace(File path, String oldWord, String newWord){

		if(path.isFile()){
			String newLine="";
			Scanner sc = new Scanner(path);
			while(sc.hasNext){
				newLine=newLine+sc.nextLine();
			}
			newLine=newLine.replace(oldWord,newWord);

			PrintWriter output = new PrintWriter(path);
			output.write(newLine);
			
		}else{
			File[] files = path.listFiles();
			for(int i=0;i<files.length;i++){
				replace(files[i],oldWord,newWord);
			}
		}
	}
}