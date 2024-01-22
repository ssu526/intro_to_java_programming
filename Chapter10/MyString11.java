/*
10.22 (Implement the String class) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString1):

public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end); 
public MyString1 toLowerCase();
public boolean equals(MyString1 s); public static MyString1 valueOf(int i);

*/
import java.lang.Math.*;

class MyString11Class{

	private char[] chars;

	public MyString11Class(char[] chars){
		this.chars=chars;
	}

	public char charAt(int index){
		return chars[index];
	}

	public int length(){
		return chars.length;
	}

	public MyString11Class substring(int begin, int end){
		int length = end-begin+1;
		char[] newChars = new char[length];

		for(int i=0;i<length;i++){
			newChars[i]=this.chars[begin+i];	
		}

		return new MyString11Class(newChars);
	}

	public MyString11Class toLowerCase(){

		for(int i=0;i<chars.length;i++){
			if(this.chars[i]>=65 && this.chars[i]<=90){
				this.chars[i]=(char)(chars[i]+32);
			}
		}

		return new MyString11Class(chars);
	}

	public boolean equals(MyString11Class s){
		if(s.length()!=chars.length){
			return false;
		}else{
			for(int i=0;i<chars.length;i++){
				if(s.charAt(i)!=chars[i]){
					return false;
				}
			}
		}

		return true;

	}

	public static MyString11Class valueOf(int i){
		int length=(int)Math.log10(i)+1;
		int number =i;

		char[] intChars = new char[length];

		for(int k=length-1;k>=0;k--){
			intChars[k]=(char)(number%10+'0');
			number=(int)(number/10);
		}

		return new MyString11Class(intChars);
	}

	public void print(){
		for(int i=0;i<chars.length;i++){
			System.out.print(chars[i]);
		}
		System.out.println("");
	}
}

public class MyString11{
        
  public static void main(String[] args){
    
    	char[] char1 = {'J','a','v','a'};
    	char[] char2= {'J','a','v','a'};
    	MyString11Class string1 = new MyString11Class(char1);
    	MyString11Class string2 = new MyString11Class(char2);
    
    	string1.print();
    	System.out.println(string1.charAt(0));
    
    	MyString11Class substring = string1.substring(0,2);
    	substring.print();
    
    	string1.toLowerCase();
    	string1.print();
    	System.out.println(string1.equals(string2));
    	
    	MyString11Class.valueOf(12345).print();
  }
}
