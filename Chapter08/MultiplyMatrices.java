//Chapter 8 - Question 6

/*

(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:

public static double[][] multiplyMatrix(double[][] a, double[][] b)


*/

public class MultiplyMatrices{

	public static void main(String[] args){

      double[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
      double[][] matrix2={{0,2,4},{1,4.5,2.2},{1.1,4.3,5.2}};
	  double[][] matrixProduct=new double[3][3];

		
		matrixProduct=multiplyMatrix(matrix1, matrix2);


		for(int n=0;n<3;n++){
              
				for(int d=0;d<3;d++){
					System.out.print(matrix1[n][d]+" ");
				}
          
         	 	if(n==1){
                  System.out.print("  *  ");
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
					System.out.printf("%3.1f ",matrixProduct[n][f]);
				}
          
          		System.out.println("");
		}
          

	}



	public static double[][] multiplyMatrix(double[][] a, double[][] b){

      double total;
      double[][] matrixProduct=new double[3][3];
      
      for(int i=0;i<3;i++){
        for(int k=0;k<3;k++){
          
          total=0;
          
          for(int m=0;m<3;m++){
         	total=total+a[i][m]*b[m][k]; 
          }
          
          matrixProduct[i][k]=total;
        }
        
      }
      

      return matrixProduct;
    }

}



