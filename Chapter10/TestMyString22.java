
/*
10.23 (Implement the String class) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString2):

public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin); 
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);

*/

class MyString22{
	String s;

	public MyString22(String s){
		this.s=s;
	}

	public int compare(String s){

		for(int i=0;i<s.length();i++){
			if(this.s.charAt(i)<s.charAt(i)){
				return -1;
			}else if(this.s.charAt(i)>s.charAt(i)){
				return 1;
			}else{

			}
		}

		return 0;


	}

	public MyString22 substring(int begin){
		char[] newString = new char[s.length()-begin];

		for(int i=begin;i<newString.length;i++){
			newString[i]=s.charAt(i);
		}

		return new MyString22(s.valueOf(newString));
	}

	public MyString22 toUpperCase(){
		char[] upperCase = new char[s.length()];

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=91 && s.charAt(i)<=122){
				upperCase[i]=(char)(s.charAt(i)-32);
			}else{
				upperCase[i]=s.charAt(i);
			}
		}

		return new MyString22(s.valueOf(upperCase));
	}

	public char[] toChars(){
		char[] stringToChars = new char[s.length()];

		for(int i=0;i<s.length();i++){
			stringToChars[i]=s.charAt(i);
		}

		return stringToChars;
	}


	public static MyString22 valueOf(boolean b){
		if(b){
			return new MyString22("True");
		}else{
			return new MyString22("False");
		}
	}

}


public class TestMyString22{
	public static void main(String[] args){
		MyString22 s = new MyString22("Music");
		System.out.println(s.compare("Music"));
		System.out.println(s.compare("music"));
		System.out.println(s.substring(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.toChars());
		System.out.println(MyString22.valueOf(true));
	}

}
