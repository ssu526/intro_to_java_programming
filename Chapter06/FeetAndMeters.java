
//Chapter 6 - Question 9


public class FeetAndMeters{

	public static void main(String[] args){
		
		System.out.println("Feet \t Meters  | \t Meters   Feet");
		System.out.println("----------------------------------------");
	
		for(int i=1;i<=10;i++){
			double meters=20+(i-1)*5;
          	double foot=i;
          
			System.out.printf("%4.1f \t %5.3f \t | \t %4.1f \t %7.3f \n",foot,footToMeter(foot),meters, meterToFoot(meters));	
		}
	}



	public static double footToMeter(double foot){

		double meter=0.305*foot;
		return meter;

	}


	public static double meterToFoot(double meter){
		double foot=3.279*meter;
		return foot;

	}



}