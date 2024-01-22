/*20.10 (Perform set operations on priority queues) Create two priority queues,
{"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
{"George", "Katie", "Kevin", "Michelle", "Ryan"}, 
and find their union, difference, and intersection.
*/
import java.util.*;

public class PriorityQueueOperation{
	public static void main(String[] args){
		PriorityQueue<String> q1 = new PriorityQueue<>();
		q1.offer("George");
		q1.offer("Jim");
		q1.offer("John");
		q1.offer("Blake");
		q1.offer("Kevin");
		q1.offer("Michael");

		PriorityQueue<String> q2 = new PriorityQueue<>();
		q2.offer("George");
		q2.offer("Katie");
		q2.offer("Kevin");
		q2.offer("Michelle");
		q2.offer("Ryan");

		PriorityQueue<String> intersection = new PriorityQueue<>();
		PriorityQueue<String> difference = new PriorityQueue<>();

		while(q2.size() != 0){
			if(q1.contains(q2.peek())){
				intersection.offer(q2.remove());
			}else{
				difference.offer(q2.remove());
			}
		}

		System.out.print("Union: \n"+q1+" "+difference+"\n");
		System.out.println("intersection: ");
		System.out.println(intersection);
		System.out.println("Difference: ");
		while(q1.size() != 0){
			if(intersection.contains(q1.peek())){
				q1.remove();
			}else{
				System.out.print(q1.remove()+" ");
			}
		}
		System.out.println(difference);


	}
}