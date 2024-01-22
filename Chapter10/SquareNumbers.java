//Chapter 10 - Question 17

import java.math.BigInteger;

public class SquareNumbers{

  public static void main(String[] args){
    
	BigInteger n = new BigInteger(String.valueOf((long)(Math.pow(Long.MAX_VALUE,0.5))));
	BigInteger nSquare = new BigInteger("0");

	for(int i=1;i<=10;i++){
		n=n.add(BigInteger.ONE);
		nSquare=n.multiply(n);
		System.out.println(nSquare);

	}
    
    
  }

}