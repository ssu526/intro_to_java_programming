




/*12.19 (Count words) Write a program that counts the number of words in President Abraham Lincoln’s Gettysburg address from http://se.cs.depaul.edu/Java/Chapter04/Lincoln.txt (was http://cs.armstrong.edu/liang/data/ Lincoln.txt).*/import java.util.*;import java.io.*;public class CountWords{ public static void main(String[] args){ try{ java.net.URL url = new java.net.URL("http://se.cs.depaul.edu/Java/Chapter04/Lincoln.txt"); Scanner input = new Scanner(url.openStream()); int count=0; while(input.hasNext()){ input.next(); count++; } System.out.println(count); } catch(java.net.MalformedURLException ex){ System.out.println("Invalid URL"); } catch(IOException ex){ System.out.println("No such file"); } }} 
