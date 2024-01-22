//Chapter 6 - Question 6

public class DisplayPatterns{


public static void main(String[] args){

	displayPattern(6);

}




public static void displayPattern(int n){

	for (int i=1;i<=n;i++){
		for(int j=1;j<=(n-i)*2;j++){
			System.out.print(" ");
		}
		
		for(int k=i;k>=1;k--){

			System.out.print(k+" ");
		}
		
		System.out.println("");

	}

}


}