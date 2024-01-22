
//Chapter 7 - Question 4

/*

(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.


*/


import java.util.Scanner;

public class AnalyzeScores{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the scores: ");		
		
		int[] scores = new int[100];
		int total=0;
		int average;
		int aboveAverage=0;
		int belowAverage=0;
		int count=0;
		
		for(int i=0;i<scores.length;i++){
			scores[i]=sc.nextInt();
			if(scores[i]<0){
				break;
			}
		
			total=total+scores[i];
			count=count+1;
		}



		average=total/count;

		for(int j=0;j<count;j++){
			if(scores[j]>=average){
				aboveAverage++;
			}else{
				belowAverage++;
			}

		}

		System.out.println("The average is "+average);
		System.out.println(aboveAverage+" scores are above or equal to average.");
		System.out.println(belowAverage+" scores are below average.");


	}

 
}
