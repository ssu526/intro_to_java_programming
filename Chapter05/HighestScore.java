/* Find the highest score) Write a program that prompts the user to enter the number of students 
and each student’s name and score, and finally displays the name of the student with the highest 
score. */

//Chapter 5 - Question 8


import java.util.Scanner;

public class HighestScore{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		input.nextLine();
		String name, name2;
		double score, score2;
		

		if(numberOfStudents>0){		

			System.out.println("Enter the name of the student: ");
			name=input.nextLine();

			System.out.println("Enter score: ");
			score=input.nextDouble();
			input.nextLine();
		
			for(int count=1;count<numberOfStudents;count++){
				System.out.println("Enter the name of the student: ");
				name2=input.nextLine();

				System.out.println("Enter score: ");
				score2=input.nextDouble();
				input.nextLine();

				if (score2>score){
					name=name2;
					score=score2;
				}

			}

			System.out.println(name+" has the highest score, "+score);
		
		}else{
			System.out.println("There is no student.");
		}
				

	}

}