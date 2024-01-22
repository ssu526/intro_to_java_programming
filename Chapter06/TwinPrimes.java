//Chapter 6 - Question 29

/*

(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
Write a program to find all twin primes less than 1,000. Display the output as follows:
(3, 5)
(5, 7)
...

*/


public class TwinPrimes{

	public static void main(String[] args){

		int prime1=2;
        int prime2=3;
	
		for(int i=2;i<=1000;i++){
			if(isPrime(i)){

				prime1=i;

				for(int j=i+1;j<=1000;j++){
					if(isPrime(j)){
						prime2=j;
						break;
					}


             }

				if(prime2-prime1==2){
					System.out.println("( "+prime1+", "+prime2+")");

				}


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


}

