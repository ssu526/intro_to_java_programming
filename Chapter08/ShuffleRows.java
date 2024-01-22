//Chapter 8 - Question 18


public class ShuffleRows{

	public static void main(String[] args){

		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		shuffle(m);

	}


	public static void shuffle(int[][] m){
		int numberOfRows=m.length;
		int random, tempFirst, tempSecond;

		for(int i=0;i<numberOfRows-1;i++){
			random=i+(int)(Math.random()*(numberOfRows-i));
			
			tempFirst=m[i][0];
			tempSecond=m[i][1];
			m[i][0]=m[random][0];
			m[i][1]=m[random][1];
			m[random][0]=tempFirst;
			m[random][1]=tempSecond;
		}


		for(int j=0;j<numberOfRows;j++){

			System.out.print(m[j][0]+", "+m[j][1]);
			System.out.println("");

		}

	}
}