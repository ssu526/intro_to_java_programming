/*18.15 (Occurrences of a specified character in a string) Rewrite Programming Exercise
18.10 using a helper method to pass the substring high index to the method.
The helper method header is:
public static int count(String str, char a, int high)
*/

public class CharOccurrences2{
	public static void main(String[] args){
		String s = "Occurrences";
		char key = 'r';
		System.out.println(Count(s,key));
	}

	public static int Count(String s, char key){
		return Count(s,key,0);
	}

	public static int Count(String s, char key, int high){
		int count=(s.charAt(high)==key)? 1:0;

		if(high==s.length()-1){
			return count;
		}else{
			return count+Count(s,key,high+1);
		}
	}
}
