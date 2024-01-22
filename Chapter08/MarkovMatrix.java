//Chapter 8 - Question 25

/*
(Markov matrix) An n * n matrix is called a positive Markov matrix if each element is positive and the sum of the elements in each column is 1. Write the following method to check whether a matrix is a Markov matrix.
public static boolean isMarkovMatrix(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and tests whether it is a Markov matrix.
*/

public class MarkovMatrix{
	public static void main(String[] args){
		double[][] matrix={{0.15,0.875,0.375},
							{0.55,0.005,0.225},
							{0.3,0.12,0.4}};

		double[][] matrix2={{0.95,-0.875,0.375},
							{0.65,0.005,0.225},
							{0.3,0.22,-0.4}};

		boolean isMarkov=isMarkovMatrix(matrix2);

		if(isMarkov==true){
			System.out.println("It is a Markov matrix");{
			}
		}else{
			System.out.println("It is not a Markov matrix");
		}

	}

	public static boolean isMarkovMatrix(double[][] m){

		double sum;

		for(int i=0;i<3;i++){
			sum=0;
			for(int j=0;j<3;j++){
				if(m[j][i]<0){
					return false;
				}
				sum=sum+m[j][i];
			}

			if(sum != 1){
				return false;
			}
		}

		return true;
	}

}