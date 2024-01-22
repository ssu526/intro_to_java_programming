
/*23.5 (Generic heap sort) Write the following two generic methods using heap sort.
The first method sorts the elements using the Comparable interface and the
second uses the Comparator interface.

public static <E extends Comparable<E>> void heapSort(E[] list)
public static <E> void heapSort(E[] list, Comparator<? super E> comparator)

*/
import java.util.*;

public class GenericHeapSort{
	public static void main(String[] args){
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};


		heapSort(list);

		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}

		System.out.println("");
	}


	public static <E extends Comparable<E>> void heapSort(E[] list){
		Heap<E> h = new Heap<>();

		for(E e: list){
			h.add(e);
		}

		for(int i=list.length-1;i>=0;i--){
			list[i]=h.remove();
		}
	}
}


class Heap<E extends Comparable<E>>{
	private ArrayList<E> list = new ArrayList<>();

	public Heap(){

	}

	public Heap(E[] object){
		for(E e: object){
			add(e);
		}
	}

	public void add(E e){
		list.add(e);
		int currentIndex = list.size()-1;

		while(currentIndex>0){
			int parentIndex=(currentIndex-1)/2;

			if(list.get(currentIndex).compareTo(list.get(parentIndex))>0){
				E temp=list.get(currentIndex);
				list.set(currentIndex,list.get(parentIndex));
				list.set(parentIndex,temp);
			}else{
				break;
			}

			currentIndex=parentIndex;
		}

	}

	public E remove(){
		if (list.size()==0) return null;

		E removed = list.get(0);
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);

		int current=0;

		while(current<list.size()){
			int leftChild = 2*current+1;
			int rightChild = 2*current+2;

			if(leftChild>=list.size()) break;

			int maxChild = leftChild;
			if(rightChild<list.size() && list.get(rightChild).compareTo(list.get(maxChild))>0){
					maxChild=rightChild;
			}

			if(list.get(current).compareTo(list.get(maxChild))<0){
				E temp=list.get(current);
				list.set(current,list.get(maxChild));
				list.set(maxChild, temp);
				current=maxChild;
			}else{
				break;
			}


		}

		return removed;


	}

	public int getSize(){
		return list.size();
	}
}
