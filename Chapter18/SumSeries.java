
/*
18.4 (Sum series) Write a recursive method to compute the following series:
m(i) = 1 +1/2 +1/3 + ... + 1/i

Write a test program that displays m(i) for i = 1, 2, . . ., 10.
*/

public class SumSeries{
	public static void main(String[] args){
		int i = 10;
		for(int k=1;k<=i;k++){
			System.out.printf("%d: %5.4f\n",k,m(k));
		}
	}

	public static double m(int i){
		if(i==1){
			return 1;
		}else{
			return (1.0/i)+m(i-1);
		}
	}
}