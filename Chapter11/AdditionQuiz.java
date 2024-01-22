/*11.16 (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
if an answer is entered again. Hint: use an array list to store answers. Here is a
sample run:
What is 5 + 9? 12
Wrong answer. Try again. What is 5 + 9? 34
Wrong answer. Try again. What is 5 + 9? 12
You already entered 12
Wrong answer. Try again. What is 5 + 9? 14
You got it!
*/

import java.util.Scanner;
import java.util.ArrayList;

public class AdditionQuiz{
	public static void main(String[] args){
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		ArrayList<Integer> attempts = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int answer;
		do{
			System.out.println("What is "+number1+" + "+number2+"? ");
			answer=sc.nextInt();

			if(attempts.contains(answer)){
				System.out.println("You already tried "+answer+" Try again");
				attempts.add(answer);
			}else{
				System.out.println("Wrong Answer. Try again");
				attempts.add(answer);
			}

		}while(answer!=number1+number2);

		System.out.println("You got it!");
	}	

}
