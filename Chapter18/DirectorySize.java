/* 18.28
(Nonrecursive directory size) Rewrite Listing 18.7, DirectorySize.java, without using recursion.
*/

//Directory :  /users/sue/Desktop

//Non-Recursive
import java.io.*;
import java.util.*;

public class DirectorySize{
	public static void main(String[] args){
		System.out.println("Enter directory: ");
		Scanner sc = new Scanner(System.in);
		String path=sc.next();

		System.out.println(findSize(new File(path)));
	}

	public static long findSize(File path){

		ArrayList<File> files = new ArrayList<>();
		files.add(path);
		long size=0;

		for(int i=0;i<files.size();i++){
			if(files.get(i).isFile()){
				size=size+files.get(i).length();
			}else if(files.get(i).listFiles()!=null && files.get(i).listFiles().length!=0){
				Collections.addAll(files,files.get(i).listFiles());
			}
		}

		return size;
	}
}




/*Recursive
import java.util.Scanner;
import java.io.*;

public class DirectorySize{
	public static void main(String[] args){
		System.out.println("Enter directory: ");
		Scanner sc = new Scanner(System.in);
		String path=sc.next();

		System.out.println(findSize(new File(path)));
	}

	public static long findSize(File path){
		long size=0;

		if(path.isDirectory()){
			File[] files = path.listFiles();
			for(int i=0;files!=null && i<files.length;i++){
				size=size+findSize(files[i]);
			}
		}else{
			size=size+path.length();
		}
		return size;
	}
}
*/