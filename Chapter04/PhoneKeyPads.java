import java.util.Scanner;
import java.lang.Character;

public class PhoneKeyPads{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);
		char capitalLetter=Character.toUpperCase(letter);

		if(capitalLetter=='A' || capitalLetter=='B' || capitalLetter=='C' )
			System.out.println("The corresponding number is 2");
		else if(capitalLetter=='D' || capitalLetter=='E' || capitalLetter=='F')
			System.out.println("The corresponding number is 3");
		else if(capitalLetter=='G' || capitalLetter=='H' || capitalLetter=='I')
			System.out.println("The corresponding number is 4");
		else if(capitalLetter=='J' || capitalLetter=='K' || capitalLetter=='L')
			System.out.println("The corresponding number is 5");
		else if(capitalLetter=='M' || capitalLetter=='N' || capitalLetter=='O')
			System.out.println("The corresponding number is 6");
		else if(capitalLetter=='P' || capitalLetter=='Q' || capitalLetter=='R' || capitalLetter=='S')
			System.out.println("The corresponding number is 7");
		else if(capitalLetter=='T' || capitalLetter=='U' || capitalLetter=='V')
			System.out.println("The corresponding number is 8");
		else if(capitalLetter=='W' || capitalLetter=='X' || capitalLetter=='Y' || capitalLetter=='Z')
			System.out.println("The corresponding number is 9");
		else 
			System.out.println(letter+" is an invalid input");			
	
	}

}