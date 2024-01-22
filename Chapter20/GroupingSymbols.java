/*20.11 (Match grouping symbols) A Java program contains various pairs of grouping
symbols, such as:
- Parentheses: ( and )
- Braces: { and }
- Brackets: [ and ]
Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal.
Write a program to check whether a Java source-code file has correct pairs of
grouping symbols. Pass the source-code file name as a command-line argument.
*/
import java.util.*;
import java.io.*;

public class GroupingSymbols{
	public static void main(String[] args) throws IOException{
		String input = args[0];
		File file = new File(input);
		Stack<Character> symbols = new Stack<>();

		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String token = sc.next();
			for(int i=0;i<token.length();i++){
				if((token.charAt(i)=='(') || (token.charAt(i)=='{') || (token.charAt(i)=='[')){
					symbols.push(token.charAt(i));
				}else if(token.charAt(i)==')'){
					if(symbols.peek()=='('){
						symbols.pop();
					}else{
						System.out.println("symbols are not correct");
						System.exit(0);
					}
				}else if(token.charAt(i)=='}'){
					if(symbols.peek()=='{'){
						symbols.pop();
					}else{
						System.out.println("symbols are not correct");
						System.exit(0);
					}
				}else if(token.charAt(i)==']'){
					if(symbols.peek()=='['){
						symbols.pop();
					}else{
						System.out.println("symbols are not correct");
						System.exit(0);
					}
				}	

			}
		}
		System.out.println("Symbols are correct");
	}
}

