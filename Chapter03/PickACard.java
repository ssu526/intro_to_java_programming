
public class PickACard{

	public static void main(String[] args){

		int rank = 1+(int)(Math.random()*13);
		int suit = 1+(int)(Math.random()*4);
		String suitOutput;



		if(suit==1){
			suitOutput="Clubs";
		}else if(suit==2){
			suitOutput="Diamonds";
		}else if(suit==3){
			suitOutput="Hearts";
		}else{
			suitOutput="Spades";
		}


		if(rank==1){
			System.out.println("The card you pick is Ace of "+suitOutput);
		}else if(rank==11){
			System.out.println("The card you pick is Jack of "+suitOutput);
		}else if(rank==12){
			System.out.println("The card you pick is Queen of "+suitOutput);
		}else if(rank==13){
			System.out.println("The card you pick is King of "+suitOutput);
		}else{
			System.out.println("The card you pick is "+rank+" of "+suitOutput);
		}
	}
}