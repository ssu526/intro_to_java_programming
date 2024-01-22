/* 18.30
(Find words) Write a program that finds all occurrences of a word in all the files under a directory, recursively. Pass the parameters from the command line as follows:
java Exercise18_30 dirName word
*/
import java.util.*;
import java.io.*;

public class FindWords{
	public static void main(String[] args){
		File path = new File(args[0]);
		String word = args[1];

		System.out.println(countWords(path,word));
	}

	public static int countWords(File path, String word){
		int count = 0;

		try{
			if(path.isFile()){
				Scanner sc = new Scanner(path);
				while(sc.hasNext()){
					if(sc.next().equals(word)){
						count++;
					}
				}
			}else{	
				File[] files = path.listFiles();
				for(int i=0;i<files.length;i++){
					count = count + countWords(files[i],word);
				}

			}
		}catch(FileNotFoundException ex){
			System.out.println("File not found");
		}

		return count;
	}
}