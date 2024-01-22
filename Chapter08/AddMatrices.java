//Chapter 8 - Question 5

/*

(Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:

public static double[][] addMatrix(double[][] a, double[][] b)


*/


import java.util.Scanner;

public class AddMatrices{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		double[][] matrix1=new double[3][3];
		double[][] matrix2=new double[3][3];
		double[][] matrixSum=new double[3][3];

		System.out.println("Enter matrix 1: ");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix1[i][j]=sc.nextDouble();

			}

		}


		System.out.println("Enter matrix 2: ");

		for(int k=0;k<3;k++){
			for(int m=0;m<3;m++){
				matrix2[k][m]=sc.nextDouble();
			}
		}



		matrixSum=addMatrix(matrix1, matrix2);


		for(int n=0;n<3;n++){
              
				for(int d=0;d<3;d++){
					System.out.print(matrix1[n][d]+" ");
				}
          
         	 	if(n==1){
                  System.out.print("  +  ");
                }else{
                   System.out.print("     "); 
                }
          
          		for(int e=0;e<3;e++){
					System.out.print(matrix2[n][e]+" ");
				}

                if(n==1){
                  System.out.print("  =  ");
                }else{
                   System.out.print("     "); 
                }
          
          
          		for(int f=0;f<3;f++){
					System.out.print(matrixSum[n][f]+" ");
				}
          
          		System.out.println("");
		}




	}



	public static double[][] addMatrix(double[][] a, double[][] b){


		double[][] matrixSum=new double[3][3];

		for(int i=0;i<3;i++){
			for(int k=0;k<3;k++){
				matrixSum[i][k]=a[i][k]+b[i][k];

			}

		}


		return matrixSum;


	}




}