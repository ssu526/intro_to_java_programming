//Chapter 9 - Question 4

/*

(Use the Random class) Write a program that creates a Random object with seed 1000 and displays 
the first 50 random integers between 0 and 100 using the nextInt(100) method.
 
*/

import java.util.Random;

public class RandomNumbers{

	public static void main(String[] args){

		Random random1 = new Random(1000);
		
		for(int i=1;i<=50;i++){
			System.out.print(random1.nextInt(101)+" ");

			if(i%10==0){
				System.out.println("");
			}
		}
	}
}
