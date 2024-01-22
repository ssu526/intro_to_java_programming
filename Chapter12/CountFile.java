




/*12.13 (Count characters, words, and lines in a file) Write a program that will countthe number of characters, words, and lines in a file. Words are separated bywhitespace characters. The file name should be passed as a command-lineargument, as shown in Figure 12.13.*/import java.io.*;import java.util.*;public class CountFile{ public static void main(String[] args) throws IOException{ java.io.File file = new java.io.File(args[0]); if(!file.exists()){ System.exit(1); } int numberOfCharacters=0; int numberOfWords=0; int numberOfLines=0; Scanner input = new Scanner(file); while(input.hasNextLine()){ String line=input.nextLine().trim(); if(line.length()>0){ numberOfLines++; String[] wordArray = line.split(" +"); numberOfWords=numberOfWords+wordArray.length; for(int i=0;i<wordArray.length;i++){ numberOfCharacters=numberOfCharacters+wordArray[i].length(); } } } System.out.println("Lines: "+numberOfLines); System.out.println("Words: "+numberOfWords); System.out.println("Characters: "+numberOfCharacters); }} 
