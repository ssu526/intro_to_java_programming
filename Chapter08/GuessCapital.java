//Chapter 8 - Question 37

import java.util.Scanner;

public class GuessCapital{

	public static void main(String[] args){
		
		FINAL int numberOfStates = 50;
		String[][] stateCapital = new String[3][2];
		String answer;

		Scanner sc = new Scanner(System.in);

		int randomState = (int)(Math.random()*numberOfStates);
		String state = stateCapital[randomState][0];

		System.out.println("What is the capital of "+state+"?");


		answer=sc.next();
		if(answer.equalsIgnoreCase(stateCapital[randomState][1])){
			System.out.println("Your answer is correct");
		}else{
			System.out.println("The correct answer is "+stateCapital[randomState][1]);
		}


	}


}