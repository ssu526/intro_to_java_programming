//Chapter 6 - Question 21

import java.util.Scanner;

public class PhoneKeypads{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the phone number: ");

    String phoneNumber=input.next();
    
    int length=phoneNumber.length();
    String realPhoneNumber="";
    
    for(int i=0;i<length;i++){
      if(Character.isLetter(phoneNumber.charAt(i))){
        realPhoneNumber=realPhoneNumber+convertToDigit(phoneNumber.charAt(i));
      }else{
        realPhoneNumber=realPhoneNumber+phoneNumber.charAt(i);
      }
      
  }
    
          System.out.println(realPhoneNumber);
  } 
  
  
  public static int convertToDigit(char letter){
    
    int digit;
    char letterLower=Character.toLowerCase(letter);
    
    if(letterLower>='a' &&  letterLower<='c'){
    	digit=2;
    }else if(letterLower>='d' && letterLower<='f'){
        digit=3;
    }else if(letterLower>='g' && letterLower<='i'){
      	digit=4;
    }else if(letterLower>='j' && letterLower<='l'){
     	digit=5;
    }else if(letterLower>='m' && letterLower<='o'){
     	digit=6;
    }else if(letterLower>='p' && letterLower<='s'){
      	digit=7;
    }else if(letterLower>='t' &&  letterLower<='v'){
     	digit=8;
    }else{
      	digit=9;
  	}
          
    return digit;
  }

}
