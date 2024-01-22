//Chapter 8 - Question 9

/*

(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either
X or O). When one player has placed three tokens in a horizontal, vertical, or
diagonal row on the grid, the game is over and that player has won. A draw (no
winner) occurs when all the cells on the grid have been filled with tokens and
neither player has achieved a win. Create a program for playing tic-tac-toe.
The program prompts two players to enter an X token and O token alternately.
Whenever a token is entered, the program redisplays the board on the
console and determines the status of the game (win, draw, or continue).

*/



import java.util.Scanner;

public class TicTacToe{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String player="X";
		int gameStatus=0;
		int row=0;
		int col=0;
		String[][] board=new String[3][3];

		displayBoard(board);

		for(int i=1;i<=9;i++){

			if(i%2==1){
				player="X";
			}else{
				player="O";
			}

			System.out.println("Enter a row for player "+player+": ");
			row=sc.nextInt();
			System.out.println("Enter a column for player "+player+": ");
			col=sc.nextInt();

			board=updateBoard(row, col,board,player);
			displayBoard(board);
			gameStatus=checkStatus(board);

			if(gameStatus!=0){
				break;
			}


		}


		System.out.println(gameStatus);
		if(gameStatus==0){
			System.out.println("It's a draw");
		}else if(gameStatus==1){
			System.out.println("X won");
		}else{
			System.out.println("O won");
		}

	}


	public static String[][] updateBoard(int row, int col, String[][] board, String player){
		board[row][col]=player;
		return board;
	}

	public static void displayBoard(String[][] board){

		System.out.println("-------------------");

		for(int row=0;row<3;row++){
			System.out.print("|");
			for(int col=0;col<3;col++){
				if(board[row][col]==null){
					System.out.print("   "+"  |");
				}else{
					System.out.print("  "+board[row][col]+"  |");
				}
			}
			System.out.println("");
			System.out.println("-------------------");
		}
	}


	public static int checkStatus(String[][] board){

		int status=0;

		//check row and column
		for(int i=0;i<3;i++){
			if(board[i][1]==board[i][2] && board[i][1]==board[i][0] && board[i][1]!=null || board[0][i]==board[1][i] && board[0][i]==board[2][i] && board[0][i]!=null){
				if(board[i][i]=="X"){
					status=1;
				}else{
					status=2;
				}
			}
		}


		//Check diagonal

		if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[2][2]!=null || board[0][2]==board[1][1] && board[2][0]==board[1][1] && board[1][1]!=null){
				if(board[1][1]=="X"){
					status=1;
				}else{
					status=2;
				}
		}


		return status;


	}

}