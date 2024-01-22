//Chapter 10 - Question 22


class MyString1{

	char[] myString;

	public MyString1(char[] chars){
		myString=chars;				
    }

      
	public char charAt(int index){
		return myString[index];
	}


	public int length(){
		return myString.length;
	}


	public MyString1 substring(int begin,int end){
		char[] substring= new char[end-begin+1];

		for(int i=begin;i<=end;i++){
			substring[i-begin]=myString[i];
		}

		return new MyString1(substring);
	}


	public MyString1 toLowerCase(){
		for(int i=0;i<myString.length;i++){
			if(myString[i]>='A' && myString[i]<='Z'){
				myString[i]=(char)(myString[i]+32);
			}
		}
		
		return new MyString1(myString);
	}


	public boolean equals(MyString1 s){
		for(int i=0;i<myString.length;i++){
			if(myString[i] != s.myString[i]){
				return false;
			}

		}

		return true;
	}
  
  public void print(){
    for(int i=0;i<myString.length;i++){
     		System.out.print(myString[i]); 
    }
    	System.out.println("");
    
  }


	public static MyString1 valueOf(int j){
		
      	int lastIndex = (int)Math.log10(j);
      	char[] number = new char[lastIndex+1];
      
      for(int i=0;i<number.length;i++){
       	number[i]=(char)(((int)(j/Math.pow(10,lastIndex-i)))%10+'0'); 
        
      }
      		
      
      	return new MyString1(number);
	}
    
}

   
public class TestMyString1{
        
  public static void main(String[] args){
    
    	char[] char1 = {'J','a','v','a'};
    	char[] char2= {'J','a','v','a'};
    	MyString1 string1 = new MyString1(char1);
    	MyString1 string2 = new MyString1(char2);
    
    	string1.print();
    	System.out.println(string1.charAt(0));
    
    	MyString1 substring = string1.substring(0,2);
    	substring.print();
    
    	string1.toLowerCase();
    	string1.print();
    	System.out.println(string1.equals(string2));
    	
    	MyString1.valueOf(12345).print();
  }
}
