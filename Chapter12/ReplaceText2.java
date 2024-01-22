




/* 12.22 (Replace text) Revise Programming Exercise 12.16 to replace a string in a file with a new string for all files in the specified directory using the command: java Exercise12_22 dir oldString newString */ //Sues-MacBook-Air:Java sue$ java Chapter12/ReplaceText2 Chapter12 Dog Cat package Chapter12; import java.io.*; import java.util.*; public class ReplaceText2{ public static void main(String[] args) throws IOException{ File dir = new File(args[0]); String oldString = args[1]; String newString = args[2]; if(args.length!= 3){ System.out.println("Directory OldString NewString"); System.exit(1); } if(!dir.isDirectory()){ System.out.println("Not a directory"); System.exit(2); } File[] files = dir.listFiles(); for(File f: files){ if(f.isFile()){ replaceString(f, oldString, newString); } } } public static void replaceString(File f, String oldString, String newString) throws IOException{ Scanner input = new Scanner(f); String s=""; while(input.hasNext()){ s=s+input.nextLine(); } String replaced=s.replaceAll(oldString, newString); PrintWriter output = new PrintWriter(f); output.print(replaced); output.close(); } } 
