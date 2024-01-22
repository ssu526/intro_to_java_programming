
//Chapter 7 - Question 6


/*
Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. 
If a divisor is found, n is not prime. 
A more efficient approach is to check whether any of the prime numbers less than or equal to sqrt(n) can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check whether they are possible divisors for n.
*/


public class PrimeNumbers{

	public static void main(String[] args){
		
		int[] primeNumbers=new int[50];
		boolean isPrime;
		int number=2;
		int index;
        int count=0;

		while(count<50){
			
           index=0;
           isPrime=true;
          
		   while(index<count && primeNumbers[index]<=Math.sqrt(number)){

				if(number%primeNumbers[index]==0){

					isPrime=false;
					break;
                  
                }else{
          			index++;
                }
		   }
          
		   
		   if(isPrime==true){
				primeNumbers[count]=number;
             	count++;
		   }

          
			number++;
          
		}


	
		for(int m=0;m<50;m++){
			System.out.print(primeNumbers[m]+" ");

		}
		
		System.out.println("");

	}

}

