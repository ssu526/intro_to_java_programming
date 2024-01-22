//Chapter 8 - Question 23

/*
(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with 0s and 1s. 
All rows and all columns have an even number of 1s. Let the user flip one cell 
(i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which cell was flipped. 
Your program should prompt the user to enter a 6-by-6 array with 0s and 1s and find the first row r and 
first column c where the even number of the 1s property is violated (i.e., the number of 1s is not even). 
The flipped cell is at (r, c).
*/

public class FlippedCell{
	public static void main(String[] args){

		int[][] matrix ={{1,1,1,0,1,1},
						 {1,1,1,1,0,0},
						 {0,1,0,1,1,1},
						 {1,1,1,1,1,1},
						 {0,1,1,1,1,0},
						 {1,0,0,0,0,1}};

		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}

		int r=-1;
		int c=-1;

		for(int row=0;row<6;row++){
			if(checkRow(matrix[row])==false){
				r=row;
			}
		}

		for(int col=0;col<6;col++){
			if(checkCol(col,matrix)==false){
				c=col;
			}
		}

		if(r==-1){
			System.out.println("No flipped cell");
		}else{
			System.out.println("Flipped cell is ("+r+", "+c+")");
		}
	}

	public static boolean checkRow(int[] matrixRow){
		int sum=0;
		for(int i=0;i<6;i++){
			sum=sum+matrixRow[i];
		}

		if(sum%2==0){
			return true;
		}else{
			return false;
		}
	}


	public static boolean checkCol(int col, int[][] matrix){
		int sum=0;
		for(int i=0;i<6;i++){
			sum=sum+matrix[i][col];
		}

		if(sum%2==0){
			return true;
		}else{
			return false;
		}
	}


}