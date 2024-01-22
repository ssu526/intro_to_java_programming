/*
18.14 (Find the number of uppercase letters in a string) Write a recursive method
to return the number of uppercase letters in a string. Write a test program that
prompts the user to enter a string and displays the number of uppercase letters in
the string.
*/

public class CountUppercase{
	public static void main(String[] args){
		String s = "ABcdEFGhi";
		System.out.println(Count(s));
	}

	public static int Count(String s){
		return Count(s,0);
	}

	public static int Count(String s, int index){
		int count=Character.isUpperCase(s.charAt(index))? 1:0;

		if(index==s.length()-1){
			return count;
		}else{
			return count+Count(s,index+1);
		}
	}
}