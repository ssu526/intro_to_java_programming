//Chapter 8 - Question 27

/*
(Column sorting) Implement the following method to sort the columns in a two- dimensional array. A new array is returned and the original array is intact.
public static double[][] sortColumns(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double values and displays a new column-sorted matrix.

*/


public class ColumnSorting{
	public static void main(String[] args){
		double[][] matrix={{0.15,0.875,0.375},{0.55,0.005,0.225},{0.30,0.12,0.4}};
		displaysMatrix(matrix);
		System.out.println("the sorted matrix is ");
		displaysMatrix(sortColumns(matrix));

	}

	public static double[][] sortColumns(double[][] m){
		double smallest;
		int index;
		double temp;

		for(int col=0;col<3;col++){

			for(int row=0;row<2;row++){
				smallest=m[row][col];
				index=row;

				for(int i=row+1;i<3;i++){
					if(m[i][col]<smallest){
						smallest=m[i][col];
						index=i;
					}
				}

			temp=m[row][col];
			m[row][col]=m[index][col];
			m[index][col]=temp;

			}

		}

		return m;
	}

	public static void displaysMatrix(double[][] m){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
	}


}