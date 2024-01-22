//Chapter 6 - Question 18

//at least 8 characters, only letters/digits, at least 2 digits

import java.util.Scanner;

public class CheckPassword{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password=input.next();
      
   
		if(password.length()<8 || CheckLettersOrDigits(password)==false || CheckNumberOfDigits(password)<2){
			System.out.println("Invalid Password");
		}else{
			System.out.println("Valid Password");
		}

	}



	public static boolean CheckLettersOrDigits(String password){

		boolean letterOrDigit=true;


		for(int i=0;i<password.length();i++){
			if(Character.isDigit(password.charAt(i))==false && Character.isLetter((password.charAt(i)))==false){                
				letterOrDigit=false;
                break;

			}
		}
      
      
      	return letterOrDigit;

    }

  
  
	public static int CheckNumberOfDigits(String password){

		int digitCount=0;

		for(int i=0;i<password.length();i++){
			if(Character.isDigit(password.charAt(i))==true){
				digitCount++;
			}

		}

		return digitCount;

    }



}

