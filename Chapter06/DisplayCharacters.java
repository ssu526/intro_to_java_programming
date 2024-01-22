//Chapter 6 - Question 12

public class DisplayCharacters{

	public static void main(String[] args){

		printChars('1','z',10);

	}


	public static void printChars(char ch1, char ch2, int numberPerLine){

     
		for(char i=ch1;i<=ch2;i++){
          
          System.out.print(i+" ");
          
          if((i-ch1+1)%numberPerLine==0){
            System.out.println("\n");
         
		}

	}

}
  
}
