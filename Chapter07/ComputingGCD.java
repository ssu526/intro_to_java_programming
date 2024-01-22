//Chapter 7 - Question 14


/*

(Computing gcd) Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:

public static int gcd(int... numbers)

Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.

*/

import java.util.Scanner;

public class ComputingGCD{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];

		System.out.println("Enter five integers: ");

		for(int i=0;i<5;i++){
			numbers[i]=sc.nextInt();
		}


		System.out.println("GCD is: "+gcd(numbers));


	}



	public static int gcd(int...numbers){

		int length=numbers.length;
		int min=numbers[0];
		boolean isGCD=true;

		for(int i=0;i<length;i++){
			if(numbers[i]<min){
				min=numbers[i];
			}

		}

		int gcd=min;

		for(int j=min;j>=1;j--){
          
			gcd=j;
            isGCD=true;
          
			for(int k=0;k<5;k++){
       
				if(numbers[k]%j !=0){
      				
					isGCD=false;
					break;
				}

			}


			if(isGCD==true){
				break;
			}

		}
		
		return gcd;

	}




}


