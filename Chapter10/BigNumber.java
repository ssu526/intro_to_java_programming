//Chapter 10 - Question 16


import java.math.BigInteger;

public class BigNumber{

	public static void main(String[] args){

		String bigNumber = "1";
		
		for(int i=1;i<49;i++){
			bigNumber=bigNumber+"0";
		}


		BigInteger x = new BigInteger(bigNumber);
		int count=0;

		while(count<=10){
			if(x.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || x.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
				System.out.println(x);
				count++;
			}

			x=x.add(BigInteger.ONE);

		}

	}


}
