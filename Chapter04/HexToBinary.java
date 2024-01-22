import java.util.Scanner;

public class HexToBinary {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a hex digit: ");

	char hex = input.next().charAt(0);
	int decimalNumber=0;
	String binaryNumber;
	
	if(hex>='0' && hex<='9'){
		decimalNumber=hex-'0';
		binaryNumber=Integer.toBinaryString(decimalNumber);
		System.out.println("The binary value is "+binaryNumber);

	}else if(hex>='a' && hex<='f'){
		decimalNumber = hex-'a'+10;
		binaryNumber=Integer.toBinaryString(decimalNumber);
		System.out.println("The binary value is "+binaryNumber);
		
	}else if(hex>='A' && hex<='F'){
		decimalNumber = hex-'A'+10;
		binaryNumber=Integer.toBinaryString(decimalNumber);
		System.out.println("The binary value is "+binaryNumber);

	}else{
		System.out.println(hex + " is an invalid input.");

	}


}

}