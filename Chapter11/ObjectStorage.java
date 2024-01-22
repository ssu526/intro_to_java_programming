/*11.6 (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the objects toString()
method.
*/

package Chapter11;
import Chapter12.Loan;
import java.util.*;

public class ObjectStorage{
	public static void main(String[] args){
		ArrayList<Object> objects = new ArrayList<>();
		objects.add(new Loan());
		objects.add(new Date());
		objects.add ("Hello");

		for(int i=0;i<objects.size();i++){
			System.out.println(objects.get(i).toString());
		}
	}

}
