/*17.1 (Create a text file) Write a program to create a file named Exercise17_01.txt if it does not exist. Append new data to it if it already exists. 
Write 100 integers created randomly into the file using text I/O. Integers are separated by a space.
*/

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



public class CreateATextFile{
	public static void main(String[] args) throws Exception{

		File file = new File("Exercise17_01.txt");

		try(PrintWriter pw = new PrintWriter(new FileOutputStream(file,true))){
			for(int i=0;i<100;i++){
				pw.append((int)(Math.random()*100)+" ");
			}
		}
	}
}

