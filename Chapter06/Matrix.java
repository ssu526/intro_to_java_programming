//Chapter 6 - Question 17

public class Matrix{

	public static void main(String[] args){

		printMatrix(5);
	}


	public static void printMatrix(int n){

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
	
				System.out.print((int)(Math.random()*2)+" ");

			}

			System.out.println("");


		}

	}



}
