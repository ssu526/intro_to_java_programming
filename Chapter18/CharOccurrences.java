/*18.10 (Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following
method header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
*/

public class CharOccurrences{
	private static int count=0;
	public static void main(String[] args){
		String s = "Occurrences";
		System.out.println(count(s,'c'));
	}

	public static int count(String str, char a){
		if(str.length()==1){
			if(str.charAt(0)==a){
				count++;
			}
		}else{
			if(str.charAt(0)==a){
				count++;
			}
			count(str.substring(1),a);
		}

		return count;
	}
}