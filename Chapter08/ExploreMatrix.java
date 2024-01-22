//Chapter 8 - Question 14


/*
(Explore matrix) Write a program that prompts the user to enter the length of a
square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
the program:

Enter the size for the matrix: 4

0111
0000
0100
1111

All 0s on row 1
All 1s on row 3
No same numbers on a column
No same numbers on the major diagonal
No same numbers on the sub-diagonal

*/


public class ExploreMatrix{

	public static void main(String[] args){

		int size = 4;
		int[][] matrix=new int[size][size];

		for(int row=0;row<size;row++){
			for(int col=0;col<size;col++){
				matrix[row][col]=(int)(Math.random()*2);
			}
		}

      	displayMatrix(matrix);

		int[] row=new int[size];
		int[] col=new int[size];
		int majorDiagonal;
		int subDiagonal;


		row=getRow(matrix);
		col=getCol(matrix);
		majorDiagonal=getMajorDiagonal(matrix);
		subDiagonal=getSubDiagonal(matrix);


		boolean rowCheck=false;
		boolean colCheck=false;

		for(int i=0;i<size;i++){
			if(row[i] ==0 || row[i] ==4){
				rowCheck=true;
              	break;
			}


		}
      
      
      	for(int m=0;m<size;m++){

			if(col[m] ==0 || col[m] ==4){
				colCheck=true;
             	break;
			}

		}


		
		//display rows

		if(rowCheck==false){
			System.out.println("No same number on a row.");
		}else{
			for(int j=0;j<size;j++){
				if(row[j]==0){
					System.out.println("All 0's in row "+j);
				}else if(row[j]==4){
					System.out.println("All 1's in row "+j);
				}
			}
		}
		

		//display columns

		if(colCheck==false){
			System.out.println("No same number on a col.");
		}else{
			for(int k=0;k<size;k++){
				if(col[k]==0){
					System.out.println("All 0's in column "+k);
				}else if(col[k]==4){
					System.out.println("All 1's in column "+k);
				}
			}
		}


		//display major diagonal

		if(majorDiagonal==0){
			System.out.println("All 0's in major diagonal.");
		}else if(majorDiagonal==4){
				System.out.println("All 1's in major diagonal");
        }else{
         	 System.out.println("No same number on major diagonal.");
        }


		//display sub diagonal

		if(subDiagonal==0){
			System.out.println("All 0's in sub diagonal.");
		}else if(subDiagonal==4){
				System.out.println("All 1's in sub diagonal");
        }else{
         	 System.out.println("No same number on sub diagonal.");
        }


	

	}


	public static int[] getRow(int[][] matrix){
		
		int sum=0;
		int[] rowSum=new int[matrix.length];

		for(int i=0;i<matrix.length;i++){
			sum=0;
			for(int j=0;j<matrix.length;j++){
				sum=sum+matrix[i][j];
			}
	
			rowSum[i]=sum;
		}

		return rowSum;
	}


	public static int[] getCol(int[][] matrix){
		
		int sum=0;
		int[] colSum=new int[matrix.length];

		for(int i=0;i<matrix.length;i++){
			sum=0;
			for(int j=0;j<matrix.length;j++){
				sum=sum+matrix[j][i];
			}
	
			colSum[i]=sum;
		}

		return colSum;
	}

	

	public static int getMajorDiagonal(int[][] matrix){
		
		int sum=0;
		for(int i=0;i<matrix.length;i++){
				sum=sum+matrix[i][i];
		}

		return sum;
	}

	

	public static int getSubDiagonal(int[][] matrix){
		
		int sum=0;

		for(int i=matrix.length-1, j=0;i>=0 && j<matrix.length;i--,j++){
				sum=sum+matrix[i][j];
		}

		return sum;
	}

  
  	public static void displayMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}


	}

	
}

