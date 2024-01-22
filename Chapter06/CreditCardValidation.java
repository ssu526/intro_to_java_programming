//Chapter 6 - Question 31

public class CreditCardValidation{
  
  
 	public static void main(String[] args){
    
    	long cardNumber = 4388576018410707L;
      	String result=isValid(cardNumber) ? "Valid card" : "Invalid card";
      
      	System.out.println(result);
      	     	
    }

	public static boolean isValid(long number){
      
      	boolean isValid;
      
		if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0 && (getSize(number)>=13 && getSize(number)<=16) && (prefixMatched(number,4) || prefixMatched(number,5) || prefixMatched(number,6) || prefixMatched(number,37))){
			isValid=true;
		}else{
          	isValid=false;
        }
      	return isValid;

	}


	
	public static int sumOfDoubleEvenPlace(long number){

		int sum=0;
		int length=getSize(number);
		long newNumber=number/10;
		int remainder;
		int doubleRemainder;

		for(int i=length-1;i>=0;i--){
			
			remainder=(int)(newNumber%10);
			doubleRemainder=remainder*2;
			sum=sum+getDigit(doubleRemainder);
			newNumber=newNumber/100;

		}
      
      
      	return sum;

	}




/** Return this number if it is a single digit, otherwise,
* return the sum of the two digits */

	public static int getDigit(int number){

		int digit;

		if(number/10==0){
			digit=number;

		}else{
			digit=number%10+number/10;
			
		}
      
      
      	return digit;

	}





/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number){
		//4388576018410707
		long number2=number;
		int length = getSize(number2);
		int sum=0;


		while(number2!=0){

			sum=sum+(int)(number2%10);
			number2=number2/100;
		}


		return sum;

	}




/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d){

		boolean prefixMatched=false;
		int lengthD = getSize(d);

		if(getPrefix(number, lengthD)==d){
			prefixMatched=true;
		}


		return prefixMatched;
	}



/** Return the number of digits in d */

	public static int getSize(long d){
		int length = (int)(Math.log10(d)+1);
		return length;

	}


/** Return the first k number of digits from number. If the
* number of digits in number is less than k, return number. */

	public static long getPrefix(long number, int k){

		String numberString = Long.toString(number);
		String prefixString = numberString.substring(0,k);
		long prefix= Long.parseLong(prefixString);

		return prefix;

	}


}

