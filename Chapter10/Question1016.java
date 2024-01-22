

/*
10.16 (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
*/

import java.math.*;

public class Question1016{
	public static void main(String[] args){

		String bigNumber = "1";
		for(int i=1;i<=49;i++){
			bigNumber=bigNumber+"0";
		}

		BigInteger x = new BigInteger(bigNumber);
		int count=0;

		while(count<10){
			if(x.remainder(new BigInteger("2")).equals(new BigInteger("0")) || x.remainder(new BigInteger("3")).equals(new BigInteger("0"))){
				System.out.println(x);
				count=count+1;
				x=x.add(BigInteger.ONE);
			}
			else{
				x=x.add(BigInteger.ONE);
			}
		}
	}
}