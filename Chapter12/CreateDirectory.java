




/* 12.26 (Create a directory) Write a program that prompts the user to enter a directory name and creates a directory using the FileÆs mkdirs method. The program displays the message "Directory created successfully" if a directory is created or "Directory already exists" if the directory already exists. */ import java.util.Scanner; import java.io.*; public class CreateDirectory{ public static void main(String[] args) throws IOException{ System.out.println("Enter a directory name"); Scanner input = new Scanner(System.in); File dir = new File(input.next()); if(dir.exists()){ System.out.println("Directory already exists"); }else{ dir.mkdir(); System.out.println("Directory created successfully"); } } } 
