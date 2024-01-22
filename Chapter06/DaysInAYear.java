
//Chapter 6 - Question 16

public class DaysInAYear{

	public static void main(String[] args){
		
		int year=2020;
		System.out.println(year+" has "+numberOfDaysInAYear(year)+" days.");
	

	}



	public static int numberOfDaysInAYear(int year){


		int days;

		if(year%400==0 || (year%4==0 && year%100 !=0)){

			days=366;
		}else{
			days=365;
		}

		return days;

	}



}
