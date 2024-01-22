/*
18.3 (Compute greatest common divisor using recursion) The gcd(m, n) can also
be defined recursively as follows:
	If m % n is 0, gcd(m, n) is n.
	Otherwise, gcd(m, n) is gcd(n, m % n).
Write a recursive method to find the GCD. Write a test program that prompts the
user to enter two integers and displays their GCD.
*/

import java.util.Scanner;

public class GCD{
	public static void main(String[] args){

		System.out.println("Enter 2 integers: ");
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m>=n){
			System.out.println("The greatest common division between "+m+" and "+n+" is "+getGCD(m,n));
		}else{
			System.out.println("The greatest common division between "+m+" and "+n+" is "+getGCD(n,m));
		}
	}

	public static int getGCD(int m, int n){
		if(m%n==0){
			return n;
		}else{
			return getGCD(n,m%n);
		}
	}
}
