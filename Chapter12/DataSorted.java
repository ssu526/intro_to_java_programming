




/*12.21 (Data sorted?) Write a program that reads the strings from file SortedStrings. txt and reports whether the strings in the files are stored in increasing order.*/import java.util.Scanner;import java.io.*;public class DataSorted{ public static void main(String[] args) throws IOException{ File file = new File("SortedString.txt"); Scanner input = new Scanner(file); String previous = input.next(); while(input.hasNext()){ String s = input.next(); if(s.compareTo(previous)<0){ System.out.println("Data is not sorted;"); System.exit(1); } previous=s; } System.out.println("Data is sorted."); }} 
