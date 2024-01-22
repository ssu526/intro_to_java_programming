/*
10.3 (The MyInteger2 class) Design a class named MyInteger2. The class contains:

  An int data field named value that stores the int value represented by this object.
  A constructor that creates a MyInteger2 object for the specified int value.
  A getter method that returns the int value.
  The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
  The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
  The static methods isEven(MyInteger2), isOdd(MyInteger2), and
isPrime(MyInteger2) that return true if the specified value is even, odd,
or prime, respectively.
  The methods equals(int) and equals(MyInteger2) that return true if
the value in this object is equal to the specified value.
  A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
  A static method parseInt(String) that converts a string into an int
value.

*/


class MyInteger2{

	private int value;

	public MyInteger2(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public static boolean isEven(int value){
		if(value%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int value){
		if(value%2 != 0){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean isPrime(int value){
		for(int i=2;i<=value/2;i++){
			if(value%i==0){
				return false;
			}
		}

		return true;
	}


	public static boolean isEven(MyInteger2 i){
		if(i.value%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger2 i){
		if(i.value%2!=0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger2 i){
		for(int j=2;j<=i.value/2;j++){
			if(i.value%j==0)
				return false;
		}

		return true;
	}

	public boolean equal(int value){
		if(this.value==value)
			return true;
		else
			return false;
	}

	public boolean equal(MyInteger2 i){
		if(this.value==i.value)
			return true;
		else
			return false;
	}

	public static int parseInt(char[] c){
		int value=0;
		for(int i=0;i<c.length;i++){
			value=value+(int)(c[i]-'0')*(int)(Math.pow(10,c.length-i-1));
		}

		return value;
	}

	
	public static int parseInt(String s){
		int value = 0;
		for(int i=0;i<s.length();i++){
			value=value+(int)(s.charAt(i)-'0')*(int)(Math.pow(10,s.length()-1-i));
		}

		return value;
	}


}




public class TestMyInteger2{

	public static void main(String[] args){
			System.out.println(MyInteger2.parseInt(new char[]{'1','2','5','9'}));
			System.out.println(MyInteger2.parseInt("1259"));
			System.out.println(MyInteger2.isPrime(4));
			System.out.println(MyInteger2.isPrime(7));
			System.out.println(MyInteger2.isOdd(4));
			System.out.println(MyInteger2.isEven(4));
			System.out.println(MyInteger2.isPrime(new MyInteger2(2)));
	}
}

