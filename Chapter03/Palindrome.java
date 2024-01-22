import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit integer: ");

		int userInput = input.nextInt();
		int one = userInput%10;
		int hundred = userInput/100;

		if(one==hundred){
			System.out.println(userInput+"is a palindrome");
		}else
		{
			System.out.println(userInput+"is not a palindrome");
		}




	}


}