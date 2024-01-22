import java.util.Scanner;

public class DaysOfMonth{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month: ");
		String month=input.next();
		String monthDisplay = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();

		int days=0;
		

		if(month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("jul") || month.equalsIgnoreCase("aug") || month.equalsIgnoreCase("oct") || month.equalsIgnoreCase("dec")){
			days=31;
		}else if(month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("jun") || month.equalsIgnoreCase("sep") || month.equalsIgnoreCase("nov")){
			days=30;
		}
		else if(month.equalsIgnoreCase("feb")){
			if(year%4==0)
				days=29;
			else
				days=28;
		}else{
			System.out.println("Please check your input.");
		}


		
		System.out.println(monthDisplay+" "+year+" has "+days+" days.");

	}


}
