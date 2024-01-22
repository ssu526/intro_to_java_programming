import java.util.Scanner;

public class Shipping{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of the package: ");
		double weight = input.nextDouble();


		if(weight<0){
			System.out.println("Please enter a positive number.");
		}else if (weight<=1) {
			System.out.println("The shipping cost is "+weight*3.5);
		}else if(weight<=3){
			System.out.println("The shipping cost is "+weight*5.5);
		}else if(weight<=10){
			System.out.println("The shipping cost is "+weight*8.5);
		}else if(weight<=20){
			System.out.println("The shipping cost is "+weight*10.5);
		}else{
			System.out.println("Item cannot be shipped");
		}
	}
}