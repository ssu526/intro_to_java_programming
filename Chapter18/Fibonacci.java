/*
18.2 (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
*/

import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		System.out.println("Enter an index: ");
		Scanner sc = new Scanner(System.in);
		int index=sc.nextInt();

		System.out.println(getFibonacciSum(index));
	}

	public static int getFibonacciSum(int index){
		if(index==0 || index==1){
			return 1;
		}else{
			return getFibonacciSum(index-1)+getFibonacciSum(index-2);
		}
	}
}
