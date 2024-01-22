//Chapter 8 - Question 20

import java.util.Scanner;

public class ConnectFour{
	public static void main(String[] args){
		int numRows=6;
		int numCols=7;
		String[][] board=new String[numRows][numCols];
		Scanner sc = new Scanner(System.in);
		int column=0;

		//Display an empty board
		displayBoard(board);

		//play game
		boolean validInput=false;
		int[] nextAvailable = {numRows-1,numRows-1, numRows-1, numRows-1, numRows-1, numRows-1, numRows-1};
		int gameStatus; //0 continue; 1 draw; 2 red win; 3 yellow win

		for(int i=1;i<=numRows*numCols;i++){

			//valid the spot chosen is inside the board and is an empty spot
			while(validInput==false){
				if(i%2==0){
					System.out.println("Drop a red disk at column (0-6): ");
				}else{
					System.out.println("Drop a yellow disk at column (0-6): ");
				}

				column=sc.nextInt();

				if(nextAvailable[column]>=0 && column<7 && column>=0){
					validInput=true;
				}else{
					System.out.println("Place your disk in another spot");
				}
			}

			board[nextAvailable[column]][column]=(i%2==0) ? "R" : "Y";
			displayBoard(board);
			gameStatus=checkGameStatus(board);

			if(gameStatus==1){
				System.out.println("It's a draw.");
				break;
			}else if(gameStatus==2){
				System.out.println("Red player won");
				break;
			}else if(gameStatus==3){
				System.out.println("Yellow player won");
				break;
			}else{
				nextAvailable[column]--;
			}

			validInput=false;
		}
		
	}



	public static int checkGameStatus(String[][] board){
		int numRows=board.length;
		int numCols=board[0].length;

		int patternFound=findPattern(board); //1 not found; 2 red; 3 yellow

		if(patternFound==2){
			return 2;
		}else if(patternFound==3){
			return 3;
		}else{
			if(boardFull(board)==true){
				return 1;
			}else{
				return 0;
			}
		}

	}


	public static int findPattern(String[][] board){
		//1 not found; 2 red; 3 yellow

		int rows=board.length;
		int cols=board[0].length;

				//check rows
		for(int i=0;i<rows;i++){
			for(int j=0;j<=cols-4;j++){
				if(board[i][j]==board[i][j+1] && board[i][j]==board[i][j+2] && board[i][j]==board[i][j+3] && board[i][j] != null){
					if(board[i][j]=="R"){
						return 2;
					}else{
						return 3;
					}
				}
			}
		}


		//check columns
		for(int k=0;k<cols;k++){
			for(int m=0;m<=rows-4;m++){
				if(board[m][k]==board[m+1][k] && board[m][k]==board[m+2][k] && board[m][k]==board[m+3][k] && board[m][k] != null){
					if(board[m][k]=="R"){
						return 2;
					}else{
						return 3;
					}
				}
			}
		}

		
		//check sub diagonals
		for(int a=0;a<=rows-4;a++){
			for(int b=3;b<cols;b++){
				if(board[a][b]==board[a+1][b-1] && board[a][b]==board[a+2][b-2] && board[a][b]==board[a+3][b-3] && board[a][b] != null){
					if(board[a][b]=="R"){
						return 2;
					}else{
						return 3;
					}
				}
			}	
		}
		
      

		//check major diagonals

		for(int c=0;c<=rows-4;c++){
			for(int d=0;d<=3;d++){
				if(board[c][d]==board[c+1][d+1] && board[c][d]==board[c+2][d+2] && board[c][d]==board[c+3][d+3] && board[c][d] != null){
					if(board[c][d]=="R"){
						return 2;
					}else{
						return 3;
					}
				}
			}
		}


		return 1;
	}





	public static boolean boardFull(String[][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(board[i][j]==null){
					return false;
				}
			}
		}

		return true;
	}



	public static void displayBoard(String[][] board){
		int numRows=board.length;
		int numCols=board[0].length;

		for(int i=0;i<numRows;i++){
			System.out.print("|");
			for(int j=0;j<numCols;j++){
				if(board[i][j]!=null){
					System.out.print(board[i][j]+"|");
				}else{
					System.out.print(" |");
				}
			}
			System.out.println("");
		}

		System.out.println("_______________");
	}


}