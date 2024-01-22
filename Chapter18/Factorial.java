/*18.1 (Factorial) Using the BigInteger class introduced in Section 10.9, you can
find the factorial for a large number (e.g., 100!). Implement the factorial
method using recursion. Write a program that prompts the user to enter an integer
and displays its factorial.
*/

import java.util.Scanner;
import java.math.*;

 public class Factorial{
 	public static void main(String[] args){
 		System.out.println("Enter an integer: ");
 		Scanner sc = new Scanner(System.in);
 		int number = sc.nextInt();

 		System.out.println(factorial(number));
 	}

 	public static BigInteger factorial(int n){
 		if(n==1){
 			return BigInteger.ONE;
 		}else{
 			return new BigInteger(String.valueOf(n)).multiply(factorial(n-1));
 		}
 	}
 }
	