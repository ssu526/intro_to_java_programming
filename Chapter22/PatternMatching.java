/*22.3 (Pattern matching) Write a program that prompts the user to enter two strings
and tests whether the second string is a substring of the first string. Suppose
the neighboring characters in the string are distinct. (DonÆt use the indexOf
method in the String class.) Analyze the time complexity of your algorithm.
Your algorithm needs to be at least O(n) time. Here is a sample run of the
program:

Enter a string s1: Welcome to Java
Enter a string s2: come
matched at index 3
*/


public class PatternMatching{
	public static void main(String[] args){
		 String s1 = "Welcome to Java come";
		 String s2 = "come";
		 int length1 = s1.length();
		 int length2 = s2.length();
		 int index = 0;
      
		while(index<=length1-length2){
			if(s1.charAt(index)==s2.charAt(0)){
				String substring = s1.substring(index,index+length2);
				if(substring.equals(s2)){
					System.out.println(index);
                  			index=index+length2;
                		}else{
					index=index+2;
				}
              
            		}else{
             			index++; 
            		}
          
          
		}
	}
}

