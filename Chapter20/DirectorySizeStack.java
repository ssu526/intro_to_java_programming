/*20.20 (Directory size) Rewrite Programming Exercise 18.28 using a stack instead of
a queue.*/

import java.util.*;
import java.io.*;

public class DirectorySizeStack{
	public static void main(String[] args){
		String input = args[0];
		File directory = new File(input);
		Stack<File> files = new Stack<>();
		files.push(directory);
		long size=0;

		while(!files.isEmpty()){
			File f = files.pop();
			if(f.isFile()){
				size=size+f.length();
			}else{
				Collections.addAll(files,f.listFiles());
			}
		}
		
		System.out.println(size);
		
	}	
}