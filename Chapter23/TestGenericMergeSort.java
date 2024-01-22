/*23.2 (Generic merge sort) Write the following two generic methods using merge sort.
The first method sorts the elements using the Comparable interface and the
second uses the Comparator interface.

public static <E extends Comparable<E>> void mergeSort(E[] list)
public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
*/

import java.util.*;

public class TestGenericMergeSort{
	public static void main(String[] args){
			Integer[] numbers = {2,5,3,6,7,2,0,9};
			String[] strings = {"write","the","following","two","generic","methods"};
			GenericMergeSort.mergeSort(numbers);
			GenericMergeSort.mergeSort(strings);

			for(Integer i:numbers){
				System.out.print(i+" ");
			}
			System.out.println("");

			for(String s:strings){
				System.out.print(s+" ");
			}
			System.out.println("");
	}
}


class GenericMergeSort{
	public static <E extends Comparable<E>> void mergeSort(E[] list){

		if(list.length>1){
			E[] firstHalf = (E[])new Comparable[list.length/2];
			System.arraycopy(list,0,firstHalf,0,list.length/2);
			mergeSort(firstHalf);

			int secondHalfLength = list.length-firstHalf.length;
			E[] secondHalf = (E[])new Comparable[secondHalfLength];
			System.arraycopy(list,firstHalf.length,secondHalf,0,secondHalfLength);
			mergeSort(secondHalf);

			merge(firstHalf,secondHalf, list);
		}
	}

	public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp){
		int current1=0;
		int current2=0;
		int current3=0;

		while(current1<list1.length && current2<list2.length){
			if(list1[current1].compareTo(list2[current2])<0){
				temp[current3++]=list1[current1++];
			}else{
				temp[current3++]=list2[current2++];
			}
		}

		while(current1<list1.length){
			temp[current3++]=list1[current1++];
		}


		while(current2<list2.length){
			temp[current3++]=list2[current2++];
		}
	}

	
	public static <E> void mergeSort(E[] list, Comparator<? super E> comparator){
		if(list.length>1){
			E[] firstHalf = (E[])new Comparable[list.length];
			System.arraycopy(list,0,firstHalf,0,list.length);

			int secondHalfLength = list.length-firstHalf.length;
			E[] secondHalf = (E[])new Comparable[secondHalfLength];
			System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);

			mergeSort(firstHalf, comparator);
			mergeSort(secondHalf, comparator);
			merge(firstHalf,secondHalf,list, comparator);
		}
	}

	public static <E> void merge(E[] list1, E[] list2, E[] temp, Comparator<? super E> c){
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		
		while(current1<list1.length && current2<list2.length){
			if(c.compare(list1[current1],list2[current2])>0){
				temp[current3++]=list1[current1++];
			}else{
				temp[current3++]=list2[current2++];

			}
		}

		while(current1<list1.length){
			temp[current3++]=list1[current1++];
		}

		while(current1<list2.length){
			temp[current3++]=list2[current2++];
		}
	}

	
}