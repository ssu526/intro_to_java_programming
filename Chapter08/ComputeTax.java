//Chapter 8 - Question 12

import java.util.Scanner;

public class ComputeTax{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your taxable income: ");
		double taxableIncome=sc.nextDouble();
		double tax=0;

		double[] rates={0.1,0.15,0.25,0.28,0.33,0.35};
		int[][] brackets = {{8350, 33950, 82250, 171550, 372950}, //Single
							{16700, 67900, 137050, 20885, 372950}, //Married jointly or qualifying widow
							{8350, 33950, 68525, 104425, 186475}, //Married separately
							{11950, 45500, 117450, 190200, 372950} }; //Head of household


		System.out.println("What is your status: ");
		System.out.println("0 - Single");
		System.out.println("1 - Married jointly or qualifying widow");
		System.out.println("2 - Married separately");
		System.out.println("3 - Head of Household");

		int status=sc.nextInt();
		while(status<0 || status>3){
			System.out.println("Please enter a number between 0 and 3:");
			status=sc.nextInt();
		}


		int incomeLevel=0;

		for(int i=4;i>=0;i--){
			if(taxableIncome>=brackets[status][i]){
				incomeLevel=i;
				break;
			}
		}

		if(incomeLevel==0){
			tax=taxableIncome*rates[0];
		}else{
			for(int j=incomeLevel;j>=1;j--){
				tax=tax+(brackets[status][j]-brackets[status][j-1])*rates[j];
			}
			tax=tax+(taxableIncome-brackets[status][incomeLevel])*rates[incomeLevel+1];
		}

		System.out.println("The tax is $"+tax);
		
	}

}