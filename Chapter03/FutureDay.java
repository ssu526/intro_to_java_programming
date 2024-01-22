import java.util.Scanner;

public class FutureDay{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int userInput, elapsed, test, future;
		String today;
		
		System.out.println("Enter today's day: ");
		userInput= input.nextInt();


		if(userInput<0 || userInput>6){
			System.out.println("Please ener an integer between 0 and 6.");
		}
		else{

			if(userInput==0)
				today="Sunday";
			else if(userInput==1)
				today="Monday";
			else if(userInput==2)
				today="Tuesday";
			else if(userInput==3)
				today="Wednesday";
			else if(userInput==4)
				today="Thursday";
			else if(userInput==5)
				today="Friday";
			else 
				today="Saturday";


			System.out.println("Enter the number of days elapsed since today: ");
			elapsed = input.nextInt();

			test = userInput+ elapsed%7;

			if(test<7){
			future=test;
			}
			else{
			future=test-7;
			}


			switch(future){
				case 0:System.out.println("Today is "+today+" and the future day is Sunday");break;
				case 1:System.out.println("Today is "+today+" and the future day is Monday");break;
				case 2:System.out.println("Today is "+today+" and the future day is Tuesday");break;
				case 3:System.out.println("Today is "+today+" and the future day is Wednesday");break;
				case 4:System.out.println("Today is "+today+" and the future day is Thursday");break;
				case 5:System.out.println("Today is "+today+" and the future day is Friday");break;	
				case 6:System.out.println("Today is "+today+" and the future day is Saturday");
			}

		}
	}
}