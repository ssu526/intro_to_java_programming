//Chapter 7 - Question 35


/*

(Guess) Enter a letter in word ******* > p
(Guess) Enter a letter in word p****** > r
(Guess) Enter a letter in word pr**r** > p
p is already in the word
(Guess) Enter a letter in word pr**r** > o
(Guess) Enter a letter in word pro*r** > g
(Guess) Enter a letter in word progr** > n
n is not in the word
(Guess) Enter a letter in word progr** > m
(Guess) Enter a letter in word progr*m > a
The word is program. You missed 1 time
Do you want to guess another word? Enter y or n>


*/

import java.util.Scanner;

public class HangmanGame{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] words = {"hangman","capital","variable","health"};
		String key;
		int keyLength;

		String answer;
		char guess;
		int asteriskCount;
		int wrongGuess;

		boolean alreadyExist;
		boolean notInTheWord;
		char continueGame='y';


	while(continueGame=='y'){
		key=words[(int)(Math.random()*4)];
		keyLength=key.length();
		answer="";
		asteriskCount=keyLength;
		wrongGuess=0;

		for(int i=0;i<keyLength;i++){
			answer=answer+"*";	
		}


		while(asteriskCount !=0){
			System.out.println("(Guess) Enter a letter in word "+answer);
			guess=sc.next().charAt(0);
			
			alreadyExist=false;
			notInTheWord=true;

			for(int j=0;j<keyLength;j++){
				if(answer.charAt(j)==guess){
					alreadyExist=true;
					System.out.println(guess+" is already in the word");
					break;
				}

				if(key.charAt(j)==guess){
					notInTheWord=false;
				}
			}

			if(alreadyExist==false && notInTheWord==true){
					System.out.println(guess+" is not in the word");
					wrongGuess++;
			}


			if(notInTheWord==false){
				answer=updateAnswer(answer,guess,key);
				asteriskCount=countAsterisk(answer);
			}

		}


		System.out.println("The word is "+key);
		System.out.println("You missed "+wrongGuess+" times");
		System.out.println("Do you want to guess another word? Enter y or n");	
		continueGame=sc.next().charAt(0);
		
	   }
	}

	public static String updateAnswer(String answer, char guess,String key){

			int keyLength=key.length();
			char[] answerArray = new char[keyLength];
			String newAnswer="";

			for(int i=0;i<keyLength;i++){
				answerArray[i]=answer.charAt(i);
			}


			for(int j=0;j<keyLength;j++){
				if(key.charAt(j)==guess){
					answerArray[j]=guess;
				}
			}

			for(int k=0;k<keyLength;k++){
				newAnswer=newAnswer+String.valueOf(answerArray[k]);
			}

			return newAnswer;

	}


	public static int countAsterisk(String answer){
		int count=0;

		for(int i=0;i<answer.length();i++){
			if(answer.charAt(i)=='*'){
				count++;
			}
		}

		return count;
	}



}

