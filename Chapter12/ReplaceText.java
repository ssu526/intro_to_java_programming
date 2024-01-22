




/*12.16 (Replace text) Listing 12.16, ReplaceText.java, gives a program that replacestext in a source file and saves the change into a new file. Revise the program tosave the change into the original file. For example, invokingjava Exercise12_16 file oldString newStringreplaces oldString in the source file with newString.*/import java.io.*;import java.util.Scanner;public class ReplaceText{ public static void main(String[] args) throws IOException{ if(args.length!=3){ System.out.println("file oldString newString"); System.exit(1); } File file = new File(args[0]); if(!file.exists()){ System.out.println("File does not exist."); System.out.println(2); } String s =""; Scanner input = new Scanner(file); while(input.hasNext()){ s=s+input.nextLine(); } String newString = s.replaceAll(args[1],args[2]); PrintWriter output = new PrintWriter(file); output.print(newString); output.close(); }} 
