/*
**21.8 (Count the occurrences of words in a text file) Rewrite Listing 21.9 to read the text from a text file. 
The text file is passed as a command-line argument. Words are delimited by whitespace characters, punctuation marks (,;.:?), quotation marks ('"), 
and parentheses. Count words in case-insensitive fashion (e.g., con- sider Good and good to be the same word). The words must start with a letter. 
Display the output in alphabetical order of words, with each word preceded by its occurrence count.
*/

import java.io.*;
import java.util.*;

public class CountWords{
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		Scanner input = new Scanner(file);
		Map<String, Integer> map = new TreeMap<>();

		while(input.hasNext()){
			String next = input.nextLine();
			String[] words = next.split("[ ,;.:?'\"()]");

			for(String w: words){
				if(w.length()>0){
					String word = w.toLowerCase();
					if(word.charAt(0)>='a' && word.charAt(0)<='z' && !map.containsKey(word)){
						map.put(word,1);
					}else if(map.containsKey(word)){
						int value = map.get(word);
						value++;
						map.put(word,value);
					}else{
						continue;
					}
				}
			}
		}

		System.out.println(map);
	}
}