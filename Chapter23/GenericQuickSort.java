/*23.3 (Generic quick sort) Write the following two generic methods using quick sort.
The first method sorts the elements using the Comparable interface and the
second uses the Comparator interface.

public static <E extends Comparable<E>> void quickSort(E[] list)
public static <E> void quickSort(E[] list, Comparator<? super E> comparator)
*/

import java.util.Comparator;

public class GenericQuickSort{
	
	public static void main(String[] args){
			Integer[] numbers = {2,5,3,6,7,2,0,9};
			//String[] strings = {"write","the","following","two","generic","methods"};
			GenericQuickSort.quickSort(numbers);
			//GenericMergeSort.mergeSort(strings);

			for(Integer i:numbers){
				System.out.print(i+" ");
			}
			System.out.println("");

			/*
			for(String s:strings){
				System.out.print(s+" ");
			}
			System.out.println("");
			*/
	}

	public static <E extends Comparable<E>> void quickSort(E[] list){
		quickSort(0,list.length-1,list);
	}

	public static <E extends Comparable<E>> void quickSort(int start, int end, E[] list){
		if(end>start){
			int pivotIndex = partition(start, end, list);

			for(E i:list){
				System.out.print(i+" ");
			}

			System.out.println("");
			quickSort(start,pivotIndex-1,list);
			quickSort(pivotIndex+1,end,list);
		}
	}

	public static <E extends Comparable> int partition(int start, int end, E[] list){
		E pivot = list[start];
		int high=end;
		int low=start+1;

		while(high>low){
			while(list[low].compareTo(pivot)<0){
				low++;
			}

			while(list[high].compareTo(pivot)>0){
				high--;
			}

			if(high>low){
				E temp = list[low];
				list[low]=list[high];
				list[high]=temp;
			}
		}
		
		while(high>start && list[high].compareTo(pivot)>=0){
			high--;
		}

		if(list[high].compareTo(pivot)<0){
			list[start]=list[high];
			list[high]=pivot;
			return high;
		}else{
			return start;
		}
	}


	public static <E> void quickSort(E[] list, Comparator<? super E> c){
		quickSort(0,list.length,list,C);
	}

	public static <E> void quickSort(int start, int end, E[] list, Comparator<? super E> c){
		if(list.length>1){
			int piovtIndex = partition(start, end, E[] list, Comparator<? super E> c);
			quickSort(start, pivotIndex-1,E[] list,Comparator<? super E> c);
			quickSort(pivotIndex+1,end,E[] list, Comparator<? super E> c);
		}
	}

	public static <E> int partition(int start, int end, E[] list, Comparator<? super E> c){
		E pivot = list[start];
		int low=start+1;
		int high=end;

		while(high>low){
			while(c.compare(list[low],pivot)<0){
				low++;
			}

			while(c.compare(list[high],pivot)>0){
				high--;
			}

			if(high>low){
				E temp=list[low];
				list[low]=list[high];
				list[high]=temp;
			}
		}

		while(high>start && c.compare(list[high],pivot)>0){
			high--;
		}

		if(c.compare(list[high],pivot)<0){
			list[start]=list[high];	
			list[high]=pivot;
			return high;
		}else{
			return start;
		}
	}

}



