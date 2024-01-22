//Chapter 8 - Question 24

/*
(Check Sudoku solution) Listing 8.4 checks whether a solution is valid by check- ing whether every number is valid in the board. 
Rewrite the program by checking whether every row, every column, and every small box has the numbers 1 to 9.
*/

public class CheckSudokuSolution{
	public static void main(String[] args){
		int[][] solution = {{9,6,3,1,7,4,2,5,8},
							{1,7,8,3,2,5,6,4,9}, 
							{2,5,4,6,8,9,7,3,1}, 
							{8,2,1,4,3,7,5,9,6}, 
							{4,9,6,8,5,2,3,1,7}, 
							{7,3,5,9,6,1,8,2,4}, 
							{5,8,9,7,1,3,4,6,2}, 
							{3,1,7,2,4,6,9,8,5}, 
							{6,4,2,5,9,8,1,7,3}
							};





		boolean isValid=isSolutionValid(solution);

		if(isValid==false){
			System.out.println("The solution is not valid");
		}else{
			System.out.println("The solution is valid");
		}
		
	}

	public static boolean isSolutionValid(int[][] solution){

		boolean[] checkRow = new boolean[10];
		boolean[] checkCol = new boolean[10];
		boolean[] checkSquare = new boolean[10];

		//check rows
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				checkRow[solution[i][j]]=true;
			}

			for(int k=1;k<10;k++){
				if(checkRow[k]==false){
					return false;
				}
			}
		}


		//check columns
		for(int a=0;a<9;a++){
			for(int b=0;b<9;b++){
				checkCol[solution[b][a]]=true;
			}

			for(int c=1;c<10;c++){
				if(checkCol[c]==false){
					return false;
				}
			}
		}

	
		//check squares
		for(int z=0;z<9;z=z+3){
			for(int x=0;x<9;x=x+3){
				for(int y=x;y<x+3;y++){
					for(int w=z;w<z+3;w++){
						checkSquare[solution[y][w]]=true;
					}
				}
			}
		}

		for(int d=1;d<10;d++){
			if(checkSquare[d]==false){
				return false;
			}
		}

		

		return true;

	}
}