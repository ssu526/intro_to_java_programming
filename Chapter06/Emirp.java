//Chapter 6 - Question 27


/*

(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
...

*/


public class Emirp{

	public static void main(String[] args){

		int number=2;
		int count=0;


		while(count<=100){

			if(isEmirp(number)){
				System.out.print(number+" ");
				count=count+1;

				if(count%10==0){
					System.out.println("");
				}
			}

			number=number+1;
		}
		


	}




	public static boolean isEmirp(int number){

		int reverseNumber=reverseNumber(number);

		if(isPrime(number) && isPrime(reverseNumber) && isPalindromic(number)==false){
			return true;
		}else{
			return false;
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




	public static int reverseNumber(int number){

		int originalNumber=number;
		int remainder;
		int reverseNumber=0;
		int power=(int)Math.log10(originalNumber);


		for(int i=power;i>=0;i--){
			remainder=originalNumber%10;
			originalNumber=originalNumber/10;
			reverseNumber=reverseNumber+remainder*(int)Math.pow(10,i);		
		}



		return reverseNumber;

		
	}
	



	public static boolean isPalindromic(int number){

		if(number==reverseNumber(number)){
			return true;
		}else{
			return false;
		}

	}
	
}


