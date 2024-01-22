//Chapter 6 - Question 30


/*
(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, Ö, and 6, respectively.
Check the sum of the two dice. 
If the sum is 2, 3, or 12 (called craps), you lose; 
if the sum is 7 or 11 (called natural), you win; 
if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.

*/


public class CrapGame{


	public static void main(String[] args){

		int dice1 =1+(int)(Math.random()*6);
		int dice2 =1+(int)(Math.random()*6);

		int sum=dice1+dice2;
		int point, r1, r2;

		if(sum==2 || sum==3 || sum==12){
			System.out.println("You roll "+dice1+" + "+dice2+" = "+sum);
			System.out.println("You lose.");

		}else if(sum==7 || sum==11){
			System.out.println("You roll "+dice1+" + "+dice2+" = "+sum);
			System.out.println("You win.");
		}else{
			
			do{
				point=sum; 
				r1=dice1;
				r2=dice2; 
				dice1 =1+(int)(Math.random()*6);
				dice2 =1+(int)(Math.random()*6);
				sum=dice1+dice2;

			}while(sum!=7 && sum!=point);
				
			point=r1+r2;

			if(sum==7){

				System.out.println("You rolled "+r1+" + "+r2+" = "+point);
				System.out.println("point is "+point);
				System.out.println("You rolled "+dice1+" + "+dice2+" = "+sum);
				System.out.println("You lose");
			}else{

				System.out.println("You rolled "+r1+" + "+r2+" = "+point);
				System.out.println("point is "+point);
				System.out.println("You rolled "+dice1+" + "+dice2+" = "+sum);
				System.out.println("You win");


			}
		}
		

	}

}

