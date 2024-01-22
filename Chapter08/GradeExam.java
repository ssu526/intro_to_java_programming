//Chapter 8 - Question 3

/*

(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
students in increasing order of the number of correct answers.

*/



public class GradeExam{

	public static void main(String[] args){

		char[][] answers={
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
 			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
 			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};



		char[] keys={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


		int[][] correctCount=new int[answers.length][2];

		int count;

		for(int row=0;row<answers.length;row++){

			count=0;
			correctCount[row][0]=row;

			for(int col=0;col<answers[0].length;col++){

				if(answers[row][col]==keys[col]){
					count++;
					
				}


			correctCount[row][1]=count;

			}

		}


		int max, maxIndex, tempScore, tempStudNum;

		for(int i =0;i<correctCount.length-1;i++){

			max=correctCount[i][1];
			maxIndex=i;
			
			for(int j=i+1;j<correctCount.length;j++){

				if(correctCount[j][1]>max){
					max=correctCount[j][1];
					maxIndex=j;

					tempScore=correctCount[i][1];
					tempStudNum=correctCount[i][0];
					correctCount[i][1]=correctCount[j][1];
					correctCount[i][0]=correctCount[j][0];
					correctCount[j][1]=tempScore;
					correctCount[j][0]=tempStudNum;
				}

			}


		}



		for(int k=0;k<correctCount.length;k++){
			System.out.println("Student "+correctCount[k][0]+"'s correct count is "+correctCount[k][1]);

		}
		
		

	}


}









