




/*12.11 (Remove text) Write a program that removes all the occurrences of a specified string from a text file. For example, invokingjava Exercise12_11 John filenameremoves the string John from the specified file. Your program should get the arguments from the command line.*/import java.util.*;import java.io.*;public class RemoveText{ public static void main(String[] args) throws IOException{ java.io.File file = new java.io.File(args[1]); if(args.length!=2){ System.out.println("Java program text fileName"); System.exit(1); } if(!file.exists()){ System.out.println("File does not exist"); System.exit(2); } String s=""; Scanner input = new Scanner(file); while(input.hasNext()){ s=s+input.nextLine().replaceAll(args[0],""); } PrintWriter output = new PrintWriter(file); output.print(s); output.close(); }} 
