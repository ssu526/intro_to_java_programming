
/*12.18 (Add package statement) Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. Write a program to 
insert the statement package chapteri; as the first line for each Java source file under the directory chapteri. Suppose chapter1, chapter2, . . . , 
chapter34 are under the root directory srcRootDirectory. The root directory and chapteri directory may contain other folders and files. Use the following 
command to run the program:java Exercise12_18 srcRootDirectory*/

import java.io.*;
import java.util.*;

public class AddPackageName{ 
	public static void main(String[] args) throws IOException{ 
		for(int i=1;i<4;i++){ 
			File chapterDirectory = new File("srcRootDirectory/chapter"+i); 
			File[] files = chapterDirectory.listFiles(); 
			for(File f:files){ 
				if(f.isFile()==true && f.getName().substring(f.getName().length()-5,f.getName().length()).equals(".java")); 
				addPackage(f,i); 
			} 
		} 
	} 

	public static void addPackage(File f,int chapter) throws IOException{ 
		String s="package chapter"+chapter+"\n"; 
		Scanner input = new Scanner(f); 
		while(input.hasNext()){ 
			s=s+input.nextLine(); 
		} 

		PrintWriter output = new PrintWriter(f); 
		output.print(s); 
		output.close(); 
	}
} 
