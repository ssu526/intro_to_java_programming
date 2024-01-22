//Chapter 6 - Question 26

/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...

*/


public class PalindromicPrime{

  public static void main(String[] args){
    
    int number=2;
        int count=0;


    //Check if the number is a palindromic prime and keep track of the number of palindromic prime found.
      while(count<=100){
      if(isPrime(number) && isPalindromic(number)){
        System.out.print(number+" ");
                count=count+1;
                if(count%10==0){
                   System.out.println("");
                 }
      }
        
          number=number+1;

    }

       }

  public static boolean isPrime(int number){

    boolean isPrime=true;

    for(int i=2;i<=number/2+1;i++){
      
      if(number%i==0 && i!=number){
        isPrime=false;
        break;
      }

    }

    return isPrime;
    

  }



  public static boolean isPalindromic(int number){

    if(number==reverseNumber(number)){

      return true;
    }else{
      return false;
    }


  }



  public static int reverseNumber(int number){

    int originalNumber = number;
    int reverseNumber = 0;
    int power = (int)Math.log10(originalNumber);  
    int remainder;
      
    

    for(int i=power;i>=0;i--){
      remainder=originalNumber%10;
      originalNumber=originalNumber/10;
      reverseNumber=reverseNumber+remainder*(int)Math.pow(10,i);


    }
    
    
    return reverseNumber;

  }



}

