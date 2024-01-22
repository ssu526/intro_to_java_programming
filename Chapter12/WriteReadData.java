




/*12.15 (Write/read data) Write a program to create a file named 1215.txt ifit does not exist. Write 100 integers created randomly into the file using textI/O. Integers are separated by spaces in the file. Read the data back from thefile and display the data in increasing order.*/
import java.io.*;
import java.util.*;

public class WriteReadData{ 
		public static void main(String[] args) throws IOException{ 
				File file = new File("1215.txt"); 
				PrintWriter output = new PrintWriter(file); 
				for(int i=0;i<100;i++){ 
					int number = (int)(Math.random()*100)+1; 
					output.print(number+" "); 
				} 

				output.close(); 

				Scanner input = new Scanner(file); 
				int[] randomNumbers = new int[100]; 
				for(int j=0;j<100;j++){ 
					randomNumbers[j]=input.nextInt(); 
				} 
				Arrays.sort(randomNumbers); 
				for(int k=0;k<100;k++){ 
					System.out.print(randomNumbers[k]+" "); 
				} 
				System.out.println(""); 
			}
		} 
