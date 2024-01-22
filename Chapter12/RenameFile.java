/*
12.28 (Rename files) Suppose you have a lot of files in a directory named Exercisei_j,
where i and j are digits. Write a program that pads a 0 before i if i is a single
digit. For example, a file named Exercise2_1 in a directory will be renamed to
Exercise02_1. In Java, when you pass the symbol * from the command line,
it refers to all files in the directory (see Supplement III.V). Use the following
command to run your program.

java Exercise12_28 *
*/

package Chapter12;
import java.io.*;

public class RenameFile{
	public static void main(String[] args){
		for(String s:args){
			File f = new File(s);
			if(f.isFile() && s.matches("Chapter12/Exercise[\\d]_[\\d+].txt")){
				int index=s.indexOf("_");
				String newName="Chapter12/Exercise0"+s.charAt(index-1)+"_"+s.substring(index+1,s.length());
				File newFile = new File(newName);
				f.renameTo(newFile);
			}
		}
	}
}