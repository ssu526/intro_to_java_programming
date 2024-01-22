/*
20.18

(Directory size) Listing 20.7, DirectorySize.java, gives a recursive method for finding a directory size. 
Rewrite this method without using recursion. Your program should use a queue to store the subdirectories under a directory. 
The algorithm can be described as follows:

long getSize(File directory) { 
	long size = 0;
	add directory to the queue;
	while (queue is not empty) {
		Remove an item from the queue into t; 
		if (t is a file)
            size += t.length();
		else
            add all the files and subdirectories under t into the queue;
	}
	return size; 
}

*/
import java.io.*;
import java.util.*;

public class DirectorySize{
	public static void main(String[] args){
		String input = args[0];
		File directory = new File(input);
		System.out.println(getSize(directory));
	}

	public static long getSize(File directory){
		long size=0;
		LinkedList<File> files = new LinkedList<>();
		files.offer(directory);

		while(!files.isEmpty()){
			File f = files.remove();
			if(f.isFile()){
				size=size+f.length();
			}else{
				Collections.addAll(files,f.listFiles());
			}
		}
		return size;
	}
	
}
