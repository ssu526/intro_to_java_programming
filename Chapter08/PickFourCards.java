// Chapter 7 - Question 29

/*

(Game: pick four cards) Write a program that picks four cards from a deck of 52
cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
12, and 11, respectively. Your program should display the number of picks that
yields the sum of 24.

*/

public class PickFourCards{

	public static void main(String[] args){

		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] rank = { "Ace", "2", "3", "4", "5", "6", "7","8", "9", "10", "Jack", "Queen", "King"};
      
		int[] picks = new int[4];
		int sum;
		int count=0;
		int temp;
      
		do{
			sum=0;
			count++;
          
			for(int i=0;i<4;i++){
              
              do{
              	temp=(int)(Math.random()*52);
              }while(cardExist(picks, temp)==true);
              
              	picks[i]=temp;
				sum=sum+picks[i]%13+1;
			}

		}while(sum != 24);

      
		
		System.out.println("Cards picked are: ");
		for(int j=0;j<4;j++){
         	 	System.out.println(suit[picks[j]/13]+" of "+rank[picks[j]%13]);
		}
		
		System.out.println("It took "+count+" picks to get the sum of 24");		

	}
  
  
  
  	public static boolean cardExist(int[] picks, int tempPick){

		for(int i=1;i<4;i++){
			if(picks[i]==tempPick){
				return true;
			}
		}

		return false;
	}

}


