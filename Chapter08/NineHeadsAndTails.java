//Chapter 8 - Question 11

/*

(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
face up and some face down. You can represent the state of the coins using a
3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:

0 0 0 	1 0 1 	1 1 0 	1 0 1 	1 0 0
0 1 0	0 0 1 	1 0 0 	1 1 0 	1 1 1
0 0 0 	1 0 0 	0 0 1 	1 0 0 	1 1 0

Each state can also be represented using a binary number. For example, the preceding
matrices correspond to the numbers

000010000 101001100 110100001 101110100 100111110

There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
. . . , and 511 to represent all states of the matrix. Write a program that prompts
the user to enter a number between 0 and 511 and displays the corresponding
matrix with the characters H and T.


Here is a sample run:
Enter a number between 0 and 511: 7
H H H
H H H
T T T

The user entered 7, which corresponds to 000000111. Since 0 stands for H and
1 for T, the output is correct.

*/

import java.util.Scanner;

public class NineHeadsAndTails{

	public static void main(String[] args){
		
		System.out.println("Enter a number between 0 and 511: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		String binaryNum = convertBinary(input); 
		System.out.println(binaryNum);   
		char[][] matrix = new char[3][3];
		int position=0;

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(binaryNum.charAt(position)=='0'){
					matrix[i][j]='H';
				}else{
					matrix[i][j]='T';
				}

				position++;
			}
		}


		for(int row=0;row<3;row++){
			for(int col=0;col<3;col++){
				System.out.print(matrix[row][col]);
			}
			
			System.out.println("");
		}
		

	}



	public static String convertBinary(int input){
		
		String binaryNum="";
		String temp="";
      	String nineBinary="";

		do{
			if(input%2==1){
				temp=temp+"1";
			}else{
				temp=temp+"0";
			}

			input=input/2;

		}while(input!=0);
		


		for(int i=temp.length()-1;i>=0;i--){
			binaryNum=binaryNum+temp.charAt(i);

		}
      
      
      
      if(binaryNum.length()==9){
        	nineBinary=binaryNum;
      }else{
        nineBinary=binaryNum;
        for(int k=0;k<9-binaryNum.length();k++){
          	
          	nineBinary="0"+nineBinary;
        }
      }
      
      

		return nineBinary;

	}

}