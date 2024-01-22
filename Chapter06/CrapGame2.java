//Chapter 6 - Question 32

/*
(Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
and display the number of winning games.
*/

public class CrapGame2{


	public static void main(String[] args){

    int numberOfWinning=0;

      
	for(int i=1;i<=10000;i++){
		int dice1 =1+(int)(Math.random()*6);
		int dice2 =1+(int)(Math.random()*6);

		int sum=dice1+dice2;
		int point, r1, r2;

		if(sum==2 || sum==3 || sum==12){
				numberOfWinning=numberOfWinning;

		}else if(sum==7 || sum==11){
				numberOfWinning=numberOfWinning+1;
          
		}else{
			
			do{
				point=sum; 
				r1=dice1;
				r2=dice2; 
				dice1 =1+(int)(Math.random()*6);
				dice2 =1+(int)(Math.random()*6);
				sum=dice1+dice2;

			}while(sum!=7 && sum!=point);
				
			point=r1+r2;

			if(sum==7){

				numberOfWinning=numberOfWinning;
			}else{

				numberOfWinning=numberOfWinning+1;


			}
		}
		
	}
      
      
      System.out.println("You won "+numberOfWinning+" times.");
	}

}