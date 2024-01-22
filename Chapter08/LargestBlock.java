//Chapter 8 - Question 35

/*
(Largest block) Given a square matrix with the elements 0 or 1, write a program
to find a maximum square submatrix whose elements are all 1s. Your program
should prompt the user to enter the number of rows in the matrix. The program
then displays the location of the first element in the maximum square submatrix
and the number of the rows in the submatrix. Here is a sample run:

Enter the number of rows in the matrix: 5
Enter the matrix row by row:
1 0 1 0 1
1 1 1 0 1
1 0 1 1 1
1 0 1 1 1
1 0 1 1 1
The maximum square submatrix is at (2, 2) with size 3

Your program should implement and use the following method to find the maximum
square submatrix:

public static int[] findLargestBlock(int[][] m)

The return value is an array that consists of three values. The first two values are
the row and column indices for the first element in the submatrix, and the third
value is the number of the rows in the submatrix.

*/

public class LargestBlock{
	public static void main(String[] args){
		int [][] matrix = {{1,0,1,0,1},
			   	  		   {1,1,1,0,1},
			   	 		   {1,0,1,1,1},
			  	  		   {1,0,1,1,1},
			  	  		   {1,0,1,1,1}};

		int numRows=matrix.length;
		int numCols=matrix[0].length;

		int[] subMatrix=findLargestBlock(matrix);

		System.out.println("The maximum square submatrix is at ("+subMatrix[0]+", "+subMatrix[1]+") with size "+subMatrix[2]);
	}
	

	public static int[] findLargestBlock(int[][] m){
		
		int[] subMatrix = {0,0,0};
		int length = m.length;
		int sum;

		for(int i=length;i>=2;i--){
			for(int col=0;col<=length-i;col++){
				for(int row=0;row<=length-i;row++){
                  sum=0;
                  for(int k=row;k<row+i;k++){
					for(int j=col;j<col+i;j++){
						sum=sum+m[k][j];
					}
				  }
                  
                 
                  if(sum==i*i){
					subMatrix[0]=row;
					subMatrix[1]=col;
					subMatrix[2]=i;
                  	return subMatrix;
                }

			   }
              
		}
          

	}
      return subMatrix;

  }
  
}

