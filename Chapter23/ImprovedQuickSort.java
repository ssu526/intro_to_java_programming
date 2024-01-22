/*23.4 (Improve quick sort) The quick sort algorithm presented in the book selects the
first element in the list as the pivot. Revise it by selecting the median among the
first, middle, and last elements in the list.*/

public class ImprovedQuickSort{
  
  	public static void main(String[] args){
      int[] numbers =new int[9];
      for(int i=0;i<9;i++){
       	numbers[i]=(int)(Math.random()*100); 
      }
      
     	ImprovedQuickSort.print(numbers);
      
     	quickSort(numbers);
      
     	ImprovedQuickSort.print(numbers);
    }
  
	public static void quickSort(int[] list){
		quickSort(0, list.length-1,list);
	}

	public static void quickSort(int start, int end, int[] list){
		if(end>start){         
			int pivotIndex=partition(start, end, list);
			quickSort(start, pivotIndex-1, list);
			quickSort(pivotIndex+1,end,list);
		}
	}

	public static int partition(int start, int end, int[] list){
      
     	int pivotIndex=(end-start)/2+start;
      	int temp2 = list[start];
      	list[start]=list[pivotIndex];
      	list[pivotIndex]=temp2;
      
      	int pivot=list[start];
		int low=start+1;
      	int high=end;

		while(high>low){
			while(low<=high && list[low]<=pivot){
				low++;
			}

			while(low<=high && list[high]>pivot){
				high--;
			}

			if(high>low){
				int temp = list[low];
				list[low]=list[high];
				list[high]=temp;
			}	
		}


		while(high>start && list[high]>pivot){
				high--;
		}
		
		if(list[high]<pivot){
			list[start]=list[high];
			list[high]=pivot;
			return high;
		}else{
			return start;
		}
    }
  
      
  	public static void print(int[] numbers){
      for(int j=0;j<9;j++){
       	System.out.print(numbers[j]+" "); 
      }
      System.out.println(" "); 
  	}

}

