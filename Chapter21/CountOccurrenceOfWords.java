/**21.7 (Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to display the words in ascending order of occurrence counts.
(Hint: Create a class named WordOccurrence that implements the Comparable interface. The class contains two fields, word and count. 
The compareTo method compares the counts. For each pair in the hash set in Listing 21.9, create an instance of WordOccurrence and store it in an 
array list. Sort the array  list using the Collections.sort method. What would be wrong if you stored the instances of WordOccurrence in a tree set?) 
*/

import java.util.*;

public class CountOccurrenceOfWords implements Comparable<CountOccurrenceOfWords>{

	private String word;
	private int count;

	public CountOccurrenceOfWords(String word, int count){
		this.word=word;
		this.count=count;
	}

	public String getWord(){
		return word;
	}

	public int getCount(){
		return count;
	}

	public int compareTo(CountOccurrenceOfWords m){
		if(count>m.getCount()){
			return 1;
		}else if(count<m.getCount()){
			return -1;
		}else{
			return 0;
		}
	}


	public static void main(String[] args){
		String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";
		Map<String, Integer> map = new TreeMap<>();

		String[] words = text.split("[ \n\t\r.,;:!?()]");

		for(String w: words){
			String word = w.toLowerCase();

			if(word.length()>0){
				if(!map.containsKey(word)){
					map.put(word,1);
				}else{
					int value = map.get(word);
					value++;
					map.put(word,value);
				}
			}
		}

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		ArrayList<CountOccurrenceOfWords> arr= new ArrayList<>();

		for(Map.Entry<String, Integer> m: entrySet){
			arr.add(new CountOccurrenceOfWords(m.getKey(),m.getValue()));
		}

		Collections.sort(arr);

		for(CountOccurrenceOfWords n: arr){
			System.out.println(n.getCount()+" "+n.getWord());
		}


	}
}


