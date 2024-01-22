//Chapter 8 - Question 22

/*
 (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, displays the matrix, 
 and checks if every row and every column have an even number of 1s.
 */

 public class EvenNumberOfOnes{
 	public static void main(String[] args){

 		int[][] matrix = new int[6][6];
 		for(int i=0;i<6;i++){
 			for(int j=0;j<6;j++){
 				matrix[i][j]=(int)(Math.random()*2);
 			}
 		}

 		 for(int m=0;m<6;m++){
 			for(int n=0;n<6;n++){
 				System.out.print(matrix[m][n]+" ");
 			}
 			System.out.println("");
 		}


 		boolean[] checkRows=checkRows(matrix);
 		boolean[] checkColumns=checkColumns(matrix);

 		System.out.print("Rows with even number of ones are: ");
 		for(int k=0;k<6;k++){
 			if(checkRows[k]==true){
 				System.out.print(k+" ");
 			}
 		}
 		System.out.println("");


 		System.out.print("Columns with even number of ones are: ");
 			for(int x=0;x<6;x++){
 				if(checkColumns[x]==true){
 				System.out.print(x+" ");
 			}
 		}
 		System.out.println("");


 	}

 	public static boolean[] checkRows(int[][] matrix){
 		int sum;
 		boolean[] checkRows = new boolean[6];

 		for(int i=0;i<6;i++){
 			sum=0;
 			for(int j=0;j<6;j++){
 				sum=sum+matrix[i][j];
 			}

 			checkRows[i]=(sum%2==0) ? true:false;
 		}

 		return checkRows;
 	}



 	public static boolean[] checkColumns(int[][] matrix){
 		int sum;
 		boolean[] checkColumns = new boolean[6];

 		for(int i=0;i<6;i++){
 			sum=0;
 			for(int j=0;j<6;j++){
 				sum=sum+matrix[j][i];
 			}

 			checkColumns[i]=(sum%2==0) ? true:false;
 		}

 		return checkColumns;
 	}


 }