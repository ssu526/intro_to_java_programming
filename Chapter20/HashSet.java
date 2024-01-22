/*
21.1 (Perform set operations on hash sets) Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} 
and {"George", "Katie", "Kevin", "Michelle", "Ryan"} and find their union, difference, and intersec- tion. 
(You can clone the sets to preserve the original sets from being changed by these set methods.)
*/

import java.util.*;

public class HashSet{
	public static void main(String[] args){
		Set<String> set1 = new LinkedHashSet<>();
		Set<String> set2 = new LinkedHashSet<>();

		Collections.addAll(set1, "George", "Jim", "John", "Blake", "Kevin", "Michael");
		Collections.addAll(set2, "George", "Katie", "Kevin", "Michelle", "Ryan");


	}
}