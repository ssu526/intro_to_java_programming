/*20.12 (Clone PriorityQueue) Define MyPriorityQueue class that extends
PriorityQueue to implement the Cloneable interface and implement the
clone() method to clone a priority queue.
*/

import java.util.*;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable{
	@Override
	public Object clone() throws CloneNotSupportedException{
		MyPriorityQueue<E> clone = new MyPriorityQueue<>();

		for(E item: this){
			clone.offer(item);
		}

		return clone;
	}
}