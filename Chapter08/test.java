//Chapter 8 - Question 26

/*
(Row sorting) Implement the following method to sort the rows in a two- dimensional array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix.
*/

public class test{
	public static void main(String[] args){
		double[] m={0.55,0.005,0.225};

		double temp;
		double smallest;
		int index;

		for(int j=0;j<2;j++){
			smallest=m[j];
			index=j;

			for(int k=j+1;k<3;k++){
				if(m[k]<smallest){
					smallest=m[k];
					index=k;
		
				}

			}

							temp=m[j];
				m[j]=m[index];
				m[index]=temp;
				
		}



		for(int x=0;x<3;x++){
			System.out.println(m[x]+" ");
		}

	}
}