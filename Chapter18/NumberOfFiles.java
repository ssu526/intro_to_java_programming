/* 18.29
(Number of files in a directory) Write a program that prompts the user to enter a directory and displays the number of the files in the directory.
*/

import java.util.*;
import java.io.*;

public class NumberOfFiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a directory: ");
		String input = sc.next();
		File path = new File(input);

		System.out.println(numberOfFiles(path));
	}

	public static int numberOfFiles(File path){
		int numberOfFiles=0;

		if(!path.isDirectory()){
			numberOfFiles=numberOfFiles+1;
		}else{
			File[] files = path.listFiles();
			for(int i=0;i<files.length;i++){
				numberOfFiles = numberOfFiles + numberOfFiles(files[i]);
			}
		}
		return numberOfFiles;
	}
}