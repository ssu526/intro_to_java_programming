//Chapter 6 - Question 3 
public class PalindromeInteger2{


	public static void main(String[] args){

		int userInput = 123;
	
		System.out.println(isPalindrome(userInput) ? "Palindrome number":"Not a palindrome number");

	}


	public static boolean isPalindrome(int number){

		return (number==reverse(number));


	}


	public static int reverse(int number){
		
		int originalNumber=number;
		int reverse=0;
		int remainder;
		int multiplier;

		multiplier=(int)Math.log10(originalNumber);
		

		for(int i=multiplier;i>=0;i--){

			remainder=originalNumber%10;
			reverse=reverse+remainder*(int)Math.pow(10,i);
			originalNumber=originalNumber/10;					

		}

      
		return reverse;

	}


}