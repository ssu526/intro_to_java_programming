// Chapter 10 - Question 23


class MyString2{

	String mystring;

	public MyString2(String s){
		mystring=s;

	}


	public int compare(String s){
		
		int length = (mystring.length()>=s.length())? mystring.length():s.length();

		for(int i=0;i<length;i++){
			if(mystring.charAt(i)>s.charAt(i)){
				return 1;
			}else if(mystring.charAt(i)<s.charAt(i)){
				return -1;
			}else{
			}

		}

		return 0;

	}


	public MyString2 substring(int begin){
		char[] charArray = mystring.toCharArray();
		int length = charArray.length;
		char[] substringArray = new char[length-begin];

		for(int i=0;i<substringArray.length;i++){
			substringArray[i]=charArray[i+begin];
		}


		String substring= new String(substringArray);

		return new MyString2(substring);

	}


	public MyString2 toUpperCase(){
		
		char[] mystringArray = mystring.toCharArray();
		int length = mystringArray.length;

		for(int i=0;i<length;i++){
			if(mystringArray[i]>='a' && mystringArray[i]<='z'){
				mystringArray[i]=(char)(mystringArray[i]-32);
			}

		}

		String mystringUpperCase = new String(mystringArray);

		return new MyString2(mystringUpperCase);

	}


	public char[] toChars(){

		return mystring.toCharArray();

	}


	public static MyString2 valueOf(boolean b){

		//value = 
		return (b? new MyString2("True"):new MyString2("False"));
	}


	public void print(){
		System.out.println(this.mystring);
	}


}



public class TestMyString2{

	public static void main(String[] args){
		MyString2 mystring = new MyString2("Programming");
		System.out.println(mystring.compare("programming"));

		MyString2 substr=mystring.substring(3);
		substr.print();

		MyString2 subUpper=mystring.toUpperCase();
		subUpper.print();

		System.out.println(mystring.valueOf(true));

		char[] mystringArray = mystring.toChars();
		for(int i=0;i<mystringArray.length;i++){
			System.out.print(mystringArray[i]);

		}

		System.out.println("");

	}
}


