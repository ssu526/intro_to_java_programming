//Chapter 6 - Question 5

public class SortedNumber{
  
  
  public static void main(String[] args){
    
   DisplaySortedNumbers(4,2,3); 
    
  }
  
public static void DisplaySortedNumbers(double num1, double num2, double num3){

		double first, second, third;
  
  if(num1>num2 && num1>num3){
   	first=num1;
    if(num2>num3){
      second=num2;
      third=num3;
    }else{
     	second=num3;
      	third=num2;
    }
    
    
  }else if(num2>num1 && num2>num3){
   		first=num2;
    	if(num1>num3){
      		second=num1;
          	third=num3;
        }else{
          	second=num3;
          	third=num1;
        }
    
    
  }else if(num3>num2 && num3>num1){
    
       	first=num3;
    	if(num1>num2){
      		second=num1;
          	third=num2;
        }else{
          	second=num2;
          	third=num1;
        }
    
    
    
  }else if(num1==num2){
    
    if(num1>num3){
    
    first=num1;
    second=num2;
    third=num3;
    }else{
    first=num3;
    second=num1;
    third=num2;
      
    }
    
  }else if(num1==num3){
    if(num1>num2){
    first=num1;
    second=num3;
    third=num2;
    }else{
    first=num2;
    second=num1;
    third=num3;
      
    }
    
  }else if(num2==num3){
    if(num2>num1){
    first=num2;
    second=num3;
    third=num1;
    }else{
    first=num1;
    second=num2;
    third=num3;
      
    }
    
  }else{
    
    first=num1;
    second=num2;
    third=num3;
    
  }

	System.out.println(first+" "+second+" "+third);
}
}



