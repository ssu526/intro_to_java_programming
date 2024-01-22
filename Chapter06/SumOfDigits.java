//Chapter 6 - Question 2


import java.util.Scanner;

public class SumOfDigits{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		long digits = input.nextLong();

		System.out.println("The sum of digits is "+sumDigits(digits));
		
	}

	
	public static int sumDigits(long n){

		long number = n;
		int sum=0;

		do{
			sum=sum+(int)number%10;	
			number=number/10;

		}while(number/10 != 0);

		sum=sum+(int)number;
		return sum;
	}



}