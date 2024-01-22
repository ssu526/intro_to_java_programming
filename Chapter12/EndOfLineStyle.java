/*12.12 (Reformat Java source code) Write a program that converts the Java sourcecode from the next-line brace style to the end-of-line brace style. 
For example,the following Java source in (a) uses the next-line brace style. Your programconverts it to the end-of-line brace style in (b).public class 
Test{ public static void main(String[] args) { // Some statements }}(a) Next-line brace stylepublic class Test { public static void main(String[] args) 
	{ // Some statements }}(b) End-of-line brace styleYour program can be invoked from the command line with the Java sourcecodefile as the argument. 
	It converts the Java source code to a new format. Forexample, the following command converts the Java source-code file Test.javato the end-of-line
	 brace style.java Exercise12_12 Test.java*/

import java.util.*;
import java.io.*;
public class EndOfLineStyle{ 
	public static void main(String[] args) throws IOException{ 
		java.io.File file = new java.io.File(args[0]); 
		Scanner input = new Scanner(file); if(!file.exists()){ System.out.println("File does not exist"); System.exit(1); } String s=""; String temp; 

		while(input.hasNext()){ 
			temp=input.nextLine(); 
			if(temp.contains("{") && temp.trim().length()==1){ 
				s=s+"{\n"; 
			}else{ 
				s=s+"\n"+temp; 
			} 
		} 

		PrintWriter output = new PrintWriter(file); 
		output.print(s); 
		output.close(); 
	}
} 
