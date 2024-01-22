/*
**21.3 (Count the keywords in Java source code) Revise the program in Listing 21.7. If a keyword is in a comment or in a string, 
don’t count it. Pass the Java file name from the command line. Assume that the Java source code is correct and line comments and paragraph 
comments do not overlap.

*/

import java.io.File;
import java.util.*;

public class CountKeyWord{
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		int count = 0;

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

		Set<String> keywords = new java.util.HashSet<>(Arrays.asList(keywordArray));
		//Set<String> keywords = new LinkedHashSet<>(Arrays.asList(keywordArray));
		
		while(sc.hasNext()){
			String next = sc.next();

			if(next.equals("//")){
				do{
					next = sc.next();
				}while(!next.equals("\n"));

			}else if(next.equals("/*")){
				do{
					next = sc.next();
				}while(!next.equals("*/"));
			}else if(next.equals("\"")){
				do{
					next=sc.next();
				}while(!next.equals("\""));
			}else{
				if(keywords.contains(next)){
					System.out.println(next);
					count++;
				}
			}
		}

		System.out.println(count);
	}
}