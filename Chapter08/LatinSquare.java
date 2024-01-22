//Chapter 8 - Question 36

/*

(Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
each occurring exactly once in each row and once in each column. Write a program that prompts the user to enter the number n and the array of characters,
as shown in the sample output, and checks if the input array is a Latin square.
The characters are the first n characters starting from A.


Enter number n: 4
Enter 4 rows of letters separated by spaces:
A B C D
B A D C
C D B A
D C A B
The input array is a Latin square

Enter number n: 3
Enter 3 rows of letters separated by spaces:
A F D
Wrong input: the letters must be from A to C


*/

import java.util.Arrays;

public class LatinSquare{

	public static void main(String[] args){

		char[][] square = {{'A','B','C','D'},
				     {'B','A','D','C'},
				     {'C','D','B','A'},
				     {'D','C','A','B'}};


		boolean isLatinSquare = isLatinSquare(square);

		int length=square.length;
		char lastLetter=(char)('A'+length-1);

		if(isLatinSquare==true){
			System.out.println("The input array is a Latin square.");

		}else{
			System.out.println("Wrong input: the letters must be from A to "+lastLetter);
		}

	}


	public static boolean isLatinSquare(char[][] square){
		int length=square.length;
		char matchingCharacter;
		char[][] s = new char[length][length];
      
      for(int m=0;m<length;m++){
        for(int n=0;n<length;n++){
          s[m][n]=square[m][n];
        }
        
      }
      
		//check rows
		for(int i=0;i<length;i++){
			Arrays.sort(s[i]);
			matchingCharacter='A';

                 
		  for(int j=0;j<length;j++){
				if(s[i][j] != matchingCharacter+j){
					return false;
				}
		  }
	   }

      
		
		//Check column
		char[] column=new char[length];

		for(int col=0;col<length;col++){
			for(int row=0;row<length;row++){
				column[row]=square[row][col];
				
			}

          
			matchingCharacter='A';
			Arrays.sort(column);
          


			for(int k=0;k<length;k++){
				if(column[k] != (char)(matchingCharacter+k)){
					return false;
				}
			}
		}
		
		
      
		return true;
		

	}
}

