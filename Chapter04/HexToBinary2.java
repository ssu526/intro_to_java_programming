
import java.util.Scanner;

public class HexToBinary2{

	public static void main(String[] args){


		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");

		char hex = input.next().charAt(0);
		int decimalNumber=0;
	
	
		if(hex>='0' && hex<='9'){
			decimalNumber=hex-'0';

		}else if(hex>='a' && hex<='f'){
			decimalNumber = hex-'a'+10;
		
		}else if(hex>='A' && hex<='F'){
			decimalNumber = hex-'A'+10;
		}else{
			System.out.println(hex + " is an invalid input.");
		}
		
	
		int binary[]=new int[4];
		int index=0;

		while(index<4){
			binary[index]=decimalNumber%2;
			index++;
			decimalNumber=decimalNumber/2;
		}


		for(int i=3;i>=0;i--){
			System.out.print(binary[i]);
		}

		System.out.println("");
	}



}
