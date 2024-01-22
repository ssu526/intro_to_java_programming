/*
21.10 (Count the occurrences of each keyword) Rewrite Listing 21.7 CountKeywords. java to read in a Java source code file and count the occurrence 
of each keyword in the file, but don’t count the keyword if it is in a comment or in a string literal.
*/

import java.io.*;
import java.util.*;

public class CountKeyWords{
	public static void main(String[] args) throws Exception{

		String[] keywordArray = {"abstract", "assert", "boolean",
		"break", "byte", "case", "catch", "char", "class", "const",
		"continue", "default", "do", "double", "else", "enum",
		"extends", "for", "final", "finally", "float", "goto",
		"if", "implements", "import", "instanceof", "int",
		"interface", "long", "native", "new", "package", "private",
		"protected", "public", "return", "short", "static",
		"strictfp", "super", "switch", "synchronized", "this",
		"throw", "throws", "transient", "try", "void", "volatile",
		"while", "true", "false", "null"};

		Map<String, Integer> map = new java.util.HashMap<>();
		for(String s: keywordArray){
			map.put(s,0);
		}

		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String next = sc.next();

			if(next.length()>0){
				if(next.length()>1 && next.substring(0,2).equals("//")){
					do{
						next=sc.next();
					}while(sc.hasNext() && !next.equals("\n"));
				}else if(next.length()>1 && next.substring(0,2).equals("/*")){
					do{
						next=sc.next();
					}while(sc.hasNext() && !next.equals("*/"));
				}else if(next.substring(0,1).equals("\"")){
					do{
						next=sc.next();
					}while(sc.hasNext() && !next.substring(0,1).equals("\""));
				}else{
					if(map.containsKey(next)){
						int value = map.get(next);
						value++;
						map.put(next,value);
					}
				}
			}
		}

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		for(Map.Entry<String, Integer> m: entrySet){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}