
//Chaper 10 - Question 8


class Tax{

	int filingStatus;
	int[][] brackets;
	double[] rates;
	int taxableIncome;

	public Tax(){
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates,int taxableIncome){
		this.filingStatus=filingStatus;
		this.brackets=brackets;
		this.rates=rates;
		this.taxableIncome=taxableIncome;
	}

	
	public void setFilingStatus(int filingStatus){
		this.filingStatus=filingStatus;

	}

	public void setBrackets(int[][] brackets){
		this.brackets=brackets;
	}


	public void setRates(double[] rates){

		this.rates=rates;
	}

	public void setTaxableIncome(int taxableIncome){
		this.taxableIncome=taxableIncome;

	}

  
	public double getTax(){

		double tax;
		int level=0;

		for(int i=0;i<brackets[filingStatus].length;i++){
			if(taxableIncome<=brackets[filingStatus][i]){
				level=i;
				break;
			}
		}


		if(level==0){
			tax=taxableIncome*rates[0];
		}else{
			tax=brackets[filingStatus][0]*rates[0];

			for(int j=1;j<level;j++){
				tax=tax+(brackets[filingStatus][j]-brackets[filingStatus][j-1])*rates[j];
			}

			tax=tax+(taxableIncome-brackets[filingStatus][level-1])*rates[level];
		}

		return tax;		
		

	}
	
  
}



public class TestTax{

	public static void main(String[] args){

		double[] rates2001 = {0.15,0.275,0.305,0.355,0.391};
		double[] rates2009 = {0.1,0.15,0.25,0.28,0.33,0.35};
		
		int[][] brackets2001 = {{27050,65550,136750,297350},{45200,109250,166500,297350},{22600,54625,83250,148675},{36250,93650,151650,297350}};
		int[][] brackets2009 = {{8350,33950,82250,171550,372950},{16700,67900,137050,208850,372950},{8350,33950,68525,104425,186475},{11950,45500,117450,190200,372950}};


		Tax single2001 = new Tax(0,brackets2001, rates2001,0);
		Tax single2009 = new Tax(0,brackets2009,rates2009,0);
		Tax marriedJointly2001=new Tax(1,brackets2001,rates2001,0);
		Tax marriedJointly2009=new Tax(1,brackets2009,rates2009,0);
		Tax marriedSeparately2001=new Tax(2,brackets2001,rates2001,0);
		Tax marriedSeparately2009=new Tax(2,brackets2009,rates2009,0);
		Tax headOfHousehold2001=new Tax(3,brackets2001,rates2001,0);
		Tax headOfHousehold2009=new Tax(3,brackets2009,rates2009,0);

		for(int income=50000;income<=60000;income+=1000){
			System.out.println("Income: $"+income);
          	System.out.println("-----------------------------------------------------");
			single2001.setTaxableIncome(income);
			System.out.printf("Tax for Single in 2001: %9.2f\n",single2001.getTax());
			single2009.setTaxableIncome(income);
			System.out.printf("Tax for Single in 2009: %9.2f\n",single2009.getTax());

			marriedJointly2001.setTaxableIncome(income);
			System.out.printf("Tax for marriedJointly in 2001: %9.2f\n",marriedJointly2001.getTax());
			marriedJointly2009.setTaxableIncome(income);
			System.out.printf("Tax for marriedJointly in 2009: %9.2f\n",marriedJointly2009.getTax());


			marriedSeparately2001.setTaxableIncome(income);
			System.out.printf("Tax for marriedSeparately in 2001: %9.2f\n",marriedSeparately2001.getTax());
			marriedSeparately2009.setTaxableIncome(income);
			System.out.printf("Tax for marriedSeparately in 2009: %9.2f\n",marriedSeparately2009.getTax());
		

			headOfHousehold2001.setTaxableIncome(income);
			System.out.printf("Tax for headOfHousehold in 2001: %9.2f\n",headOfHousehold2001.getTax());
			headOfHousehold2009.setTaxableIncome(income);
			System.out.printf("Tax for headOfHousehold in 2009: %9.2f\n",headOfHousehold2009.getTax());
          
          	System.out.println("");
		}

	}


}