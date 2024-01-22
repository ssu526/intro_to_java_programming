

//Chapter 6 - Question 7

public class FutureInvestment{


	public static void main(String[] args){
	
		double investmentAmount = 1000;
		double monthlyInterestRate = 0.09/12;
		double annualInterestRate = monthlyInterestRate*12;


		System.out.printf("The amount invested: %4.0f\n",investmentAmount);
		System.out.printf("Annual interest rate: %1.0f\n",annualInterestRate*100);
		System.out.println("Years \t Future value");

		for(int i=1;i<=30;i++){
			System.out.print(i+" \t ");
          	System.out.printf("%12.2f\n",futureInvestmentValue(investmentAmount, monthlyInterestRate,i));
          
                     
        }


	}


	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
      
      	double value = investmentAmount*Math.pow(1+monthlyInterestRate,years*12);
		return value;
		

	}


}
