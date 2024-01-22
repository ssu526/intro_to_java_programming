//Chapter 5 - Question 19

public class Pyramid{
	public static void main(String[] args){

		int lines = 8;
		
		for(int count=1;count<=lines;count++){
			int space=lines-count;
			int power=0;

			for(int i =1;i<=space*4;i++){
				System.out.print(" ");
			}
          
			while(power<count){
				System.out.printf("%3.0f ",Math.pow(2,power));
				power++;

			}
          
            power=power-2;

			while(power>=0){
				System.out.printf("%3.0f ",Math.pow(2,power));
				power--;
			}
			
			System.out.println("");

		

		}	

	}

}