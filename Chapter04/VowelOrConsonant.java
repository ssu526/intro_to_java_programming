
import java.util.Scanner;


public class VowelOrConsonant{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);

		if(letter>='a' && letter<='z' || letter>='A' && letter<='Z'){
			if(letter=='a' || letter == 'e' || letter=='i' || letter=='o' || letter=='u' || letter=='A' || letter == 'E' || letter=='I' || letter=='O' || letter=='U'){
				System.out.println(letter+" is a vowel.");
			}else{
				System.out.println(letter+" is a consonant.");
			}
		}else{
			System.out.println(letter+" is an invalid input.");
		}
	}

}