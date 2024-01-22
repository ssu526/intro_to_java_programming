




/*12.14 (Process scores in a text file) Suppose that a text file contains an unspecifiednumber of scores separated by blanks. Write a program that prompts the userto enter the file, reads the scores from the file, and displays their total andaverage.*/import java.io.*;import java.util.Scanner;public class ProcessScore{ public static void main(String[] args)throws IOException{ Scanner sc = new Scanner(System.in); System.out.println("Enter the directory of the file: "); File file = new File(sc.nextLine()); double total=0; double average=0; int count=0; Scanner fileInput = new Scanner(file); while(fileInput.hasNext()){ total=total+fileInput.nextDouble(); count++; } average=total/count; System.out.println("Total: "+total+"\nAverage: "+average); }} 
