//Chapter 7 - Question 35

/*

(Sort characters in a string) Write a method that returns a sorted string using the
following header:

public static String sort(String s)

For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted
string.

*/

public class SortString{

	public static void main(String[] args){
		String unsorted="axhepcb";
		String sorted=sort(unsorted);

		System.out.println(sorted);

	}

	public static String sort(String s){

		int length = s.length();
      	char[] stringArray=new char[length];
      
      for(int k=0;k<length;k++){
       	stringArray[k]=s.charAt(k); 
        
      }
      
		char smallest;
		int index;
		char temp;

		for(int i=0;i<length-1;i++){
			smallest=stringArray[i];
			index=i;

			for(int j=i+1;j<length;j++){
				if(stringArray[j]<smallest){
					smallest=stringArray[j];
					index=j;
				}
			}


			temp=stringArray[i];
			stringArray[i]=stringArray[index];
			stringArray[index]=temp;

		}
      
      	String st="";
      
      for(int x=0;x<length;x++){
       	st=st+stringArray[x]; 
      }

		return st;

	}
}