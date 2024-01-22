import java.util.Scanner;

public class FindYears{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();

		int totalDays = minutes/60/24;
		int years = totalDays/365;
		int days = totalDays - years*365;

		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");


	}
}