/*23.7 (Min-heap) The heap presented in the text is also known as a max-heap, in which
each node is greater than or equal to any of its children. A min-heap is a heap
in which each node is less than or equal to any of its children. Min-heaps are
often used to implement priority queues. Revise the Heap class in Listing 23.9 to
implement a min-heap.
*/

import java.util.ArrayList;

public class MinHeap<E extends Comparable>{

	public static void main(String[] args){
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};


		heapSort(list);

		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}

		System.out.println("");
	}


	public static<E extends Comparable<E>> void heapSort(E[] list){

		MinHeap<E> h = new MinHeap<>();
		for(E e: list){
			h.add(e);
		}

		for(int i=0;i<list.length;i++){
			list[i]=h.remove();
		}

	}



	private ArrayList<E> list = new ArrayList<>();

	public MinHeap(){

	}

	public MinHeap(E[] list){
		for(E e: list){
			this.list.add(e);
		}
	}

	public void add(E e){
		list.add(e);
		int current = list.size()-1;

		while(current>0){
			int parent=(current-1)/2;

			if(list.get(current).compareTo(list.get(parent))<0){
				E temp = list.get(current);
				list.set(current,list.get(parent));
				list.set(parent,temp);
			}else{
				break;
			}

			current=parent;
		}

	}

	public E remove(){
		E removed = list.get(0);
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);

		int current = 0;

		while(current>list.size()){
			int leftChild=2*current+1;
			int rightChild=2*current+2;

			if(leftChild>=list.size()) break;

			int minChild = leftChild;

			if(rightChild<list.size() && list.get(rightChild).compareTo(list.get(minChild))<0){
				minChild=rightChild;
			}

			if(list.get(current).compareTo(list.get(minChild))>0){
				E temp=list.get(current);
				list.set(current, list.get(minChild));
				list.set(minChild,temp);
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