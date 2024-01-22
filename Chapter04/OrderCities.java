
// Chapter 4 - Question 24

import java.util.Scanner;

public class OrderCities{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.println("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.println("Enter the third city: ");
		String city3 = input.nextLine();

		
		String first, second, third;

		if(city1.compareToIgnoreCase(city2)<0 && city1.compareToIgnoreCase(city3)<0){
			first = city1;
			if(city2.compareToIgnoreCase(city3)<0){
				second=city2;
				third=city3;
			}else{
				second=city3;
				third=city2;
			}
		}else if(city2.compareToIgnoreCase(city1)<0 && city2.compareToIgnoreCase(city3)<0){
			first = city2;
			if(city1.compareToIgnoreCase(city3)<0){
				second=city1;
				third=city3;
			}else{
				second=city3;
				third=city1;
			}
		}else if(city3.compareToIgnoreCase(city1)<0 && city3.compareToIgnoreCase(city2)<0){
			first = city3;
			if(city2.compareToIgnoreCase(city1)<0){
				second=city2;
				third=city1;
			}else{
				second=city1;
				third=city2;
			}
		}else if(city1.equalsIgnoreCase(city2)){
			if(city2.compareToIgnoreCase(city3)<0){
				first=city1;
				second=city2;
				third=city3;
			}else{
				first=city3;
				second=city1;
				third=city2;
			}
		}else if(city2.equalsIgnoreCase(city3)){
			if(city2.compareToIgnoreCase(city1)<0){
				first=city2;
				second=city3;
				third=city1;
			}else{
				first=city1;
				second=city2;
				third=city3;
			}
		}else if(city1.equalsIgnoreCase(city3)){
			if(city2.compareToIgnoreCase(city1)<0){
				first=city2;
				second=city3;
				third=city1;
			}else{
				first=city1;
				second=city3;
				third=city2;
			}
		}else{
			first=city1;
			second=city2;
			third=city3;
		}

		System.out.println("The three cities in alphabetical order are "+first +" "+second+" "+third);


	}


}
