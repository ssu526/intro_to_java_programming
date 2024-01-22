/* 
12.27 (Replace words) Suppose you have a lot of files in a directory that contain 
words Exercisei_j, where i and j are digits. Write a program that pads a 0 
before i if i is a single digit and 0 before j if j is a single digit. For example, 
the word Exercise02_01 in a file will be replaced by Exercise02_01. In Java, 
when you pass the symbol * from the command line, it refers to all files in 
the directory (see Supplement III.V). Use the following command to run your 
program. 
java Exercise12_27 * 
*/ 



package Chapter12; 
import java.util.Scanner; 
import java.io.*; 

public class ReplaceWords{ 
	public static void main(String[] args) throws IOException{ 
		for(String s: args){ 
			File f = new File(s); 
			if(f.isFile()){ 
				Scanner input = new Scanner(f); 
				String newString=""; 
				String newLine; 

				while(input.hasNext()){ 
					String line = input.nextLine(); 
					Scanner sc = new Scanner(line); 
					newLine=""; 
					while(sc.hasNext()){ 
						String nextWord=sc.next(); 

						if(nextWord.matches("Exercise\\d_\\d")){ 
							String replaceWord = "Exercise0"+nextWord.charAt(nextWord.length()-3)+"_0"+nextWord.charAt(nextWord.length()-1); 
							newLine=newLine+replaceWord+" "; 
						}else if(nextWord.matches("Exercise\\d_\\d+")) { 
							int index = nextWord.indexOf("_"); 
							String replaceWord = "Exercise0"+nextWord.charAt(index-1)+"_"+nextWord.substring(index+1,nextWord.length()); 
							newLine=newLine+replaceWord+" "; 
						}else if(nextWord.matches("Exercise\\d+_\\d")){ 
							int index = nextWord.indexOf("_"); 
							String replaceWord = nextWord.substring(0,index+1)+"0"+nextWord.charAt(nextWord.length()-1); 
							newLine=newLine+replaceWord+" "; 
						}else{ 
							newLine=newLine+nextWord+" "; 
						} 
					} 


					newString=newString+newLine+"\n"; 
				} 

			PrintWriter output = new PrintWriter(f); 
			output.print(newString); 
			output.close(); 
			
			} 
		} 

	} 

} 
