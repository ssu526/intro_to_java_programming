//Chapter 8 - Question 19


public class PatternRecognition{

	public static void main(String[] args){

		int numberOfRows=6;
		int numberOfCols=7;

		int[][] board=new int[numberOfRows][numberOfCols];
		String input1="0 1 0 3 1 6 1 0 1 6 8 6 0 1 5 6 2 1 8 6 9 6 5 6 1 1 9 1 1 3 6 1 4 0 7 3 3 3 4 4 0 7";
		String input2="0 1 0 3 1 6 1 0 1 6 8 6 0 1 5 5 2 1 8 2 9 6 5 6 1 1 9 1 1 5 6 1 4 0 7 3 5 3 3 4 0 7";
		String input3="0 1 0 3 1 6 1 0 1 6 8 6 0 1 5 6 2 1 6 2 9 6 5 6 6 1 9 1 1 3 6 1 4 0 7 3 6 3 3 4 0 7";
		String input4="0 1 0 3 1 6 1 0 1 6 8 6 0 1 9 6 2 1 8 2 9 6 9 6 1 1 9 1 1 3 9 1 4 0 7 3 3 3 9 4 0 7";

		String[] inputSplit=input3.split(" ");
		int count=0;

		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfCols;j++){
				board[i][j]=Integer.parseInt(inputSplit[count]);
				count++;
			}
		}


		for(int e=0;e<numberOfRows;e++){
			for(int f=0;f<numberOfCols;f++){
				System.out.print(board[e][f]);
			}
			System.out.println("");
		}


		boolean isConsecutive = isConsecutiveFour(board);

		if(isConsecutive==true){
			System.out.println("The board contains four consecutive numbers");
		}else{
			System.out.println("The board does not contains four consecutive numbers");
		}
		

	}



	public static boolean isConsecutiveFour(int[][] board){
		int rows=board.length;
		int cols=board[0].length;

		//check rows
		for(int i=0;i<rows;i++){
			for(int j=0;j<=cols-4;j++){
				if(board[i][j]==board[i][j+1] && board[i][j]==board[i][j+2] && board[i][j]==board[i][j+3]){
					return true;
				}
			}
		}


		//check columns
		for(int k=0;k<cols;k++){
			for(int m=0;m<=rows-4;m++){
				if(board[m][k]==board[m+1][k] && board[m][k]==board[m+2][k] && board[m][k]==board[m+3][k]){
					return true;
				}
			}
		}

		
		//check sub diagonals
		for(int a=0;a<=rows-4;a++){
			for(int b=3;b<cols;b++){
				if(board[a][b]==board[a+1][b-1] && board[a][b]==board[a+2][b-2] && board[a][b]==board[a+3][b-3]){
					return true;
				}
			}	
		}
		
      

		//check major diagonals

		for(int c=0;c<=rows-4;c++){
			for(int d=0;d<=3;d++){
				if(board[c][d]==board[c+1][d+1] && board[c][d]==board[c+2][d+2] && board[c][d]==board[c+3][d+3]){
					return true;
				}
			}
		}


		return false;

	}

}