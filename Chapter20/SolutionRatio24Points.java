/***20.19 (Game: solution ratio for 24-point game) When you pick four cards from a
deck of 52 cards for the 24-point game introduced in Programming Exercise
20.13, the four cards may not have a 24-point solution. What is the number
of all possible picks of four cards from 52 cards? Among all possible picks,
how many of them have 24-point solutions? What is the success ratioóthat is,
(number of picks with solutions)/ (number of all possible picks of four cards)?
Write a program to find these answers.*/


public class SolutionRatio24Points{
	public static void main(String[] args){
		int possiblePicks = 0;
		int numberOfSolutions = 0;

		int[] deck = createDeck();
	    
		int[] cards = new int[4];
		char[] operators = {'+','-','*','/'};

		for(int i=0;i<52;i++){
			swap(0,i,deck);
			cards[0]=deck[i];

			for(int j=1;j<52;j++){
				swap(1,j,deck);
				cards[1]=deck[j];

				for(int k=2;k<52;k++){
					swap(2,k,deck);
					cards[2]=deck[k];

					for(int m=3;m<52;m++){
						swap(3,m,deck);
						cards[3]=deck[m];
						possiblePicks++;

									outerloop:
                    				for(char op1: operators){
                    					for(char op2: operators){
                    						for(char op3: operators){
	                    						int a = cards[0];
	                    						int b = cards[1];
	                    						int c = cards[2];
	                    						int d = cards[3];
	                    
	                    						if((int)(f(f(f(a,b,op1),c,op2),d,op3))==24
									    			|| (int)(f(f(a,b,op1),f(c,d,op2),op3))==24
									    			|| (int)(f(f(a,f(b,c,op1),op2),d,op3))==24
									    			|| (int)(f(a,f(f(b,c,op1),d,op2),op3))==24
									    			|| (int)(f(a,f(b,f(c,d,op1),op2),op3))==24){

													numberOfSolutions++;
													break outerloop;
												}
                    						}
                    
                    					}
                    				}
						swap(m,3,deck);

					}

					swap(k,2,deck);
				}
				swap(j,1,deck);
			}
			swap(i,0,deck);
		}


		System.out.println("Possible Picks: "+possiblePicks);
		System.out.println("Number of Solutions: "+numberOfSolutions);
		System.out.printf("Success ratio: %4.2f%%\n",(double)numberOfSolutions/possiblePicks*100.0);
	}



	public static void swap(int a, int b, int[] cards){
		int temp = cards[a];
		cards[a]=cards[b];
		cards[b]=temp;
	}


	public static double f(double a, double b, char op){
		if(op=='+'){
			return a+b;
		}else if(op=='-'){
			return a-b;
		}else if(op=='*'){
			return a*b;
		}else{
			return a/b;
		}

	}

	public static int[] createDeck(){
		int[] deck = new int[52];

		for(int i=0;i<52;i++){
			deck[i]=i%13+1;
		}

		return deck;
	}

}


