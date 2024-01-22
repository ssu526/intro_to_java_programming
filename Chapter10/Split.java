/*
10.25 (New string split method) The split method in the String class returns an array of strings consisting of the substrings split by the delimiters. However, the delimiters are not returned. Implement the following new method that returns an array of strings consisting of the substrings split by the matching delimiters, including the matching delimiters.

public static String[] split(String s, String regex)
For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an array of String, and split("a?b?gf#e", "[?#]") returns a, ?, b, ?, b, gf, #, and e in an array of String.

*/

public class Split{

	public static void main(String[] args){
		String s = "?";
		String regex = "[?#]";

		String[] splitString =split(s, regex);

		for(int j=0;j<splitString.length;j++){
			System.out.println(splitString[j]);
		}

	}

	public static String[] split(String s, String regex){

		int beginIndex=0;
		int endIndex=1;
		String[] stringArray = new String[s.length()];
		int count=0;


		while(endIndex<s.length()){
			if(containsRegex(s.substring(beginIndex,endIndex),regex)==true){

				if(endIndex-beginIndex==1){
					stringArray[count]=s.substring(beginIndex,endIndex);
					count++;
					beginIndex=endIndex;
					endIndex++;
				}else{
					stringArray[count]=s.substring(beginIndex,endIndex-1);
					stringArray[count+1]=s.substring(endIndex-1, endIndex);
					count=count+2;
					beginIndex=endIndex;
					endIndex=endIndex+1;
				}
			}else{
				endIndex++;
			}
		}


		if(s.length()==1){
				stringArray[0]=s.substring(0,1);
				count++;
		}

		if(s.length()>1){
			if(containsRegex(String.valueOf(s.charAt(s.length()-1)),regex)==false){

				stringArray[count]=s.substring(beginIndex,s.length());
				count++;
			}else{
				if(endIndex-beginIndex==1){
					stringArray[count]=s.substring(beginIndex,endIndex);
					count++;
				}else{
					stringArray[count]=s.substring(beginIndex,s.length()-1);
					stringArray[count+1]=s.substring(s.length()-1,s.length());
					count=count+2;
				}
			}
		}


		String[] stringArray2 = new String[count];
		for(int i=0;i<count;i++){
			stringArray2[i]=stringArray[i];
		}

		return stringArray2;

	}


	private static boolean containsRegex(String s, String regex){
		if(regex.length()==1){
			if(s.contains(regex)){
				return true;
			}else{
				return false;
			}
		}else{
			for(int i=1;i<regex.length()-1;i++){
				if(s.contains(String.valueOf(regex.charAt(i)))){
					return true;
				}
			}
		}

		return false;
	}

}