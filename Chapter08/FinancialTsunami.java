//Chapter 8 - Question 17

public class FinancialTsunami{

	public static void main(String[] args){

		int numberOfBanks = 5;
		double limit = 201;
		
		String[] bankDetail = new String[numberOfBanks];
		bankDetail[0]="25 2 1 100.5 4 320.5";
		bankDetail[1]="125 2 2 40 3 85";
		bankDetail[2]="175 2 0 125 3 75";
		bankDetail[3]="75 1 0 125";
		bankDetail[4]="181 1 2 125";

		double[] currentBalance=currentBalance(bankDetail);
		double[] totalAsset=new double[numberOfBanks];
		boolean[] bankStatus = new boolean[numberOfBanks];
		double[][] borrowers = listBorrowers(numberOfBanks,bankDetail);
      
		
		/******calculate total asset and set status*****/

		  totalAsset=calculateAsset(currentBalance,borrowers);     	
		  bankStatus=setStatus(limit, totalAsset);
  

		/******reset borrow amount*****/
		borrowers=resetBorrowAmount(borrowers, bankStatus);



		/******re-calculate total asset and reset status*****/
		  totalAsset=calculateAsset(currentBalance,borrowers);
		  bankStatus=setStatus(limit, totalAsset);



		/******display banks with status "Fail"*****/
		  System.out.print("Unsafe banks are ");
		  for(int i=0;i<numberOfBanks;i++){
			if(bankStatus[i]==true){
				System.out.print(i+" ");
			}
		  }
		
			
	
	}



	public static double[] currentBalance(String[] bankDetail){
		int numberOfBanks=bankDetail.length;
		double[] currentBalance=new double[numberOfBanks];

		for(int i=0;i<numberOfBanks;i++){
			String[] temp=bankDetail[i].split(" ");
			currentBalance[i]=Integer.parseInt(temp[0]);
		}

		return currentBalance;
	}

	
	public static double[][] listBorrowers(int numberOfBanks, String[] bankDetail){
		double[][] borrowers=new double[numberOfBanks][numberOfBanks];
		int numberOfBorrowers, borrower;
		double borrowerAmount;
	
		for(int i=0;i<numberOfBanks;i++){
			String[] temp = bankDetail[i].split(" ");
			numberOfBorrowers=Integer.parseInt(temp[1]);

			for(int j=2;j<temp.length;j=j+2){
				borrower=Integer.parseInt(temp[j]);
				borrowerAmount=Double.parseDouble(temp[j+1]);
				borrowers[i][borrower]=borrowerAmount;
				
			}
		}

		return borrowers;

	}
  
  
  	public static double[] calculateAsset(double[] currentBalance,double[][] borrowers){
		int numberOfBanks=currentBalance.length;
		double[] totalAsset=new double[numberOfBanks];
		double sum;

		for(int i=0;i<numberOfBanks;i++){
			sum=0;

			for(int j=0;j<numberOfBanks;j++){
				sum=sum+borrowers[i][j];
			}

			totalAsset[i]=currentBalance[i]+sum;
		}

		return totalAsset;
	}
  
  
	public static boolean[] setStatus(double limit, double[] totalAsset){

		int numberOfBanks=totalAsset.length;
		boolean[] status = new boolean[numberOfBanks];


		for(int i=0;i<numberOfBanks;i++){
			if(totalAsset[i]<limit){
				status[i]=true;

			}
		}


		return status;
	}
  
  

  	public static double[][] resetBorrowAmount(double[][] borrowers, boolean[] bankStatus){

		int numberOfBanks=borrowers[0].length;
		
		for(int i=0;i<numberOfBanks;i++){
			if(bankStatus[i]==true){
				for(int j=0;j<numberOfBanks;j++){
					borrowers[j][i]=0;
				}
			}
		}

		return borrowers;

	}


}


