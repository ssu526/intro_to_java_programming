/*18.11 (Sum the digits in an integer using recursion) Write a recursive method that
computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
*/

public class SumDigits{
	public static void main(String[] args){
		int number = 12345;
		System.out.println(sum(number));
	}

	public static int sum(int number){

		if(number<=0 && number>=0){
			return number;
		}else{
			return number%10+sum(number/10);
		}
	}
}