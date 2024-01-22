
//Chapter 7 - Question 5

/*

(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers.

*/



import java.util.Scanner;

public class DistinctNumbers{

	public static void main(String[] args){
		
		System.out.println("Enter 10 numbers: ");
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];

		int temp;
		boolean newNumber=true;
		int count=0;

		for(int i=0;i<10;i++){

			newNumber=true;
			temp=sc.nextInt();

			for(int j=0;j<count;j++){

				if(temp==numbers[j]){
					newNumber=false;
				}

			}


			if(newNumber==true){
				numbers[count]=temp;
				count++;
			}

		}


		System.out.println("The number of distinct number is "+count);
		System.out.println("The distinct numbers are: ");

		for(int m =0;m<count;m++){
			System.out.print(numbers[m]+" ");

		}

		System.out.println("");
	}



}


