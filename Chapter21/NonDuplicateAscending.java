/*
21.2 (Display nonduplicate words in ascending order) Write a program that reads words from a text file and 
displays all the nonduplicate words in ascending order. The text file is passed as a command-line argument.
*/

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class NonDuplicateAscending{
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		Scanner input = new Scanner(file);

		TreeSet<String> treeSet = new TreeSet<>();
		while(input.hasNext()){
			treeSet.add(input.next());
		}

		System.out.println(treeSet);
	}
}