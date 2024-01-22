//Chapter 5 - Question 1


import java.util.Scanner;

public class CountNumbers{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number;
		int countPositive=0;
		int countNegative=0;
		int total=0;
		int average;


		do{
			number=Integer.valueOf(input.next());
			total=total+number;

			if(number>0){
				countPositive=countPositive+1;
			}
			else if(number<0){
				countNegative=countNegative+1;
			}else{}

		}while(number!=0);



		average=total/(countPositive+countNegative);

		System.out.println("The number of positive is "+countPositive);
		System.out.println("The number of negative is "+countNegative);
		System.out.println("The total is "+total);
		System.out.println("The average is "+average);

			
		}
			

	}


