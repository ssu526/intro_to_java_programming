//Chapter 10 - Question 3

class MyInteger{

	private int value;
	
	public MyInteger(int value){
		this.value=value;
	}

	public int getValue(){
		return value;
	}

	public boolean isEven(){

		if(value%2==0){
			return true;
		}else{
			return false;
		}

	}


	public boolean isOdd(){

		if(value%2==0){
			return false;
		}else{
			return true;
		}


	}

	public boolean isPrime(){
		for(int i=2;i<=value/2-1;i++){
			if(value%i==0){
				return false;
			}
		}

		return true;

	}


	public static boolean isEven(int value){

		if(value%2==0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isOdd(int value){
		if(value%2==0){
			return false;
		}else{
			return true;
		}

	}

	public static boolean isPrime(int value){
		for(int i=2;i<=value/2-1;i++){
			if(value%i==0){
				return false;
			}
		}

		return true;
	}


	public static boolean isEven(MyInteger myInteger){
		if(myInteger.getValue()%2==0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isOdd(MyInteger myInteger){
		if(myInteger.getValue()%2==0){
			return false;
		}else{
			return true;
		}
	}


	public static boolean isPrime(MyInteger myInteger){
		for(int i=2;i<=myInteger.getValue()/2-1;i++){
			if(myInteger.getValue()%i==0){
				return false;
			}
		}

		return true;

	}

	public boolean equals(int value){
		if(this.value==value){
			return true;
		}else{
			return false;
		}

	}


	public boolean equals(MyInteger myInteger){
		if(this.value==myInteger.value){
			return true;
		}else{
			return false;
		}

	}

	public static int[] parseInt(char[] numericChar){
		int length = numericChar.length;
		int[] numericArray = new int[length];

		for(int i=0;i<length;i++){
			numericArray[i]=Integer.parseInt(String.valueOf(numericChar[i]));
		}
      
      return numericArray;
	}


	public static int[] parseInt(String[] stringArray){
		int length = stringArray.length;
		int[] numericArray = new int[length];

		for(int i=0;i<length;i++){
			numericArray[i]=Integer.parseInt(stringArray[i]);
		}
	
      	return numericArray;
	}
}


public class TestMyInteger{

	public static void main(String[] args){
		
		MyInteger myInteger = new MyInteger(15);
		MyInteger myInteger2 = new MyInteger(16);
      	char[] numericChar = {'4','6','9'};
      	String[] stringArray = {"3","1","5"};

		System.out.println("is "+myInteger.getValue()+" even? "+myInteger.isEven());
		System.out.println("is "+myInteger.getValue()+" odd? "+myInteger.isOdd());
		System.out.println("is "+myInteger.getValue()+" prime? "+myInteger.isPrime());
		System.out.println("is 15 an even number? "+MyInteger.isEven(15));
		System.out.println("is 15 an odd number? "+MyInteger.isOdd(15));
		System.out.println("is 15 a prime number? "+MyInteger.isPrime(15));
		System.out.println("is "+myInteger.getValue()+" even? "+MyInteger.isEven(myInteger));
		System.out.println("is "+myInteger.getValue()+" odd? "+MyInteger.isOdd(myInteger));
		System.out.println("is "+myInteger.getValue()+" prime? "+MyInteger.isPrime(myInteger));
		System.out.println("does "+myInteger.getValue()+" equal to 16? "+myInteger.equals(16));
		System.out.println("does "+myInteger.getValue()+" equal to "+myInteger2.getValue()+"? "+myInteger.equals(myInteger2));
		
		int[] numericArray = MyInteger.parseInt(numericChar);
		int[] numericArray2 = MyInteger.parseInt(stringArray);

		for(int i=0;i<3;i++){
			System.out.print(numericArray[i]+" ");
		} 

		System.out.println("");

		for(int j=0;j<3;j++){
			System.out.print(numericArray2[j]+" ");
		} 
	}

}