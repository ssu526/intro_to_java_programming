//Chapter 7 - Question 7

/*
(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
*/

public class CountSingleDigits{

	public static void main(String[] args){

		int[] numbers = new int[10];
		int index;

		for(int i=0;i<100;i++){
			index=(int)(Math.random()*10);
			numbers[index]++;

		}


		for(int j=0;j<10;j++){
			System.out.println(j+" occurs "+numbers[j]+" time(s)");

		}

	}



}