//Chapter 5 - Question 33

public class PerfectNumber{
	public static void main(String[] args){
		

		int sum=0;
		
		for(int number=1;number<=10000;number++){
			for(int divisor = number-1;divisor>=1;divisor--){
				if(number%divisor==0){
					sum=sum+divisor;
				}
			}

			if(number==sum){
				System.out.println(number+" is a perfect number.");
			}

			sum=0;

		}
		
		

	}


}
