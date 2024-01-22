//Chapter 8 - Question 10


/*

(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s. Here is a sample run of the program:

0011
0011
1101
1010
The largest row index: 2
The largest column index: 2

*/


public class LargestRowAndcol{

	public static void main(String[] args){
	
		int[][] matrix = new int[4][4];
		
		for(int row=0;row<4;row++){
			for(int col=0;col<4;col++){
				matrix[row][col]=(int)(Math.random()*2);
			}
		}


		int largestRow=matrix[0][0]+matrix[0][1]+matrix[0][2]+matrix[0][3];
		int rowIndex=0;

		for(int i=1;i<4;i++){
			if(matrix[i][0]+matrix[i][1]+matrix[i][2]+matrix[i][3]>largestRow){
				largestRow=matrix[i][0]+matrix[i][1]+matrix[i][2]+matrix[i][3];
				rowIndex=i;
		}

        }
      
      
		int largestCol=matrix[0][0]+matrix[1][0]+matrix[2][0]+matrix[3][0];
		int colIndex=0;

		for(int j=1;j<4;j++){
			if(matrix[0][j]+matrix[1][j]+matrix[2][j]+matrix[3][j]>largestCol){
				largestCol=matrix[0][j]+matrix[1][j]+matrix[2][j]+matrix[3][j];
				colIndex=j;
			}

        }
      
      	
      for(int k=0;k<4;k++){
        for(int m=0;m<4;m++){
         	System.out.print(matrix[k][m]+" "); 
        }
        System.out.println("");
      }

		System.out.println("The largest row index: "+rowIndex);
		System.out.println("The largest column index: "+colIndex);



	}

      
}


