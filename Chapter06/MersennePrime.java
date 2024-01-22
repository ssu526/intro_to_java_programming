//Chapter 6 - Question 28

/*

(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2p - 1 for some positive integer p. Write a program that finds all
Mersenne primes with p <= 31 and displays the output as follows:
p 2^p ñ1
2 3
3 7
5 31
...

*/


public class MersennePrime{


	public static void main(String[] args){
		
		System.out.println("p \t 2^p-1");

		for(int p=2;p<=31;p++){
			if(isPrime(powerP(p))){
				System.out.println(p+" \t "+powerP(p));
			}

		}


	}



	public static boolean isPrime(int number){

		boolean isPrime=true;

		for(int i=2;i<=number/2+1;i++){
			if(number%i==0 && i!=number){
				isPrime=false;
			}


		}


		return isPrime;



	}


	
	public static int powerP(int p){

		int result = (int)Math.pow(2,p)-1;
		return result;

	}


}