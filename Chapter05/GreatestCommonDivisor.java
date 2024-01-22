//Chapter 5 - Question 14



import java.util.Scanner;

public class GreatestCommonDivisor{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = input.nextInt();

		int gcd=1;
		int min;
	
		if(n1!=n2){

			if(n1<n2){
				min=n1;
			}else{
				min=n2;
			}


			for(int d=min;d>=1;d--){
				if(n1%d==0 && n2%d==0){
					gcd=d;
					break;

				}
			}

		}else{
			gcd=n1;
		}

		System.out.println("The greatest common divisor of "+n1+" and "+n2+" is "+gcd);
	}
}

