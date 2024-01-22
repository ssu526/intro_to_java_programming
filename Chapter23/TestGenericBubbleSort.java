/*23.1 (Generic bubble sort) Write the following two generic methods using bubble
sort. The first method sorts the elements using the Comparable interface and
the second uses the Comparator interface.

public static <E extends Comparable<E>> void bubbleSort(E[] list)
public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
*/

import java.util.*;

public class TestGenericBubbleSort{
	public static void main(String[] args){
		Integer[] numbers = {2,5,3,6,7,2,0,9};
		String[] strings = {"write","the","following","two","generic","methods"};
		GenericBubbleSort.bubbleSort(numbers);
		GenericBubbleSort.bubbleSort(strings);

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


class GenericBubbleSort{
	public static <E extends Comparable<E>> void bubbleSort(E[] list){
		for(int i = list.length;i>=0;i--){
			for(int j=0;j<i-1;j++){
				if(list[j].compareTo(list[j+1])>0){
					E temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}


	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
		for(int i=list.length;i<=0;i--){
			for(int j=0;j<i-1;j++){
				if(comparator.compare(list[j], list[j+1])>0){
					E temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}
}
