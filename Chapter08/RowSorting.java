//Chapter 8 - Question 26

/*
(Row sorting) Implement the following method to sort the rows in a two- dimensional array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix.
*/

public class RowSorting{
	public static void main(String[] args){
		double[][] matrix={{0.15,0.875,0.375},{0.55,0.005,0.225},{0.30,0.12,0.4}};
		displayMatrix(matrix);
		System.out.println("");
		System.out.println("The row-sortd array is ");
		displayMatrix(sortRows(matrix));
	}


	public static void displayMatrix(double[][] m){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
	}


	public static double[][] sortRows(double[][] m){
		int numRows=m.length;
		int numCols=m[0].length;
		double temp;
		double smallest;
		int index;

		for(int i=0;i<numRows;i++){
			for(int j=0;j<numCols-1;j++){
				smallest=m[i][j];

				index=j;

				for(int k=j+1;k<numCols;k++){
					if(m[i][k]<smallest){
						smallest=m[i][k];
						index=k;
					}

				}

			temp=m[i][j];
			m[i][j]=m[i][index];
			m[i][index]=temp;
				
			}
		}

		return m;
	}
}