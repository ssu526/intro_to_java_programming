//Chapter 7 - Question 16

/*

(Execution time) Write a program that randomly generates an array of 100,000
integers and a key. Estimate the execution time of invoking the linearSearch
method in Listing 7.6. Sort the array and estimate the execution time of invoking
the binarySearch method in Listing 7.7. You can use the following code
template to obtain the execution time:

long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;

*/


public class ExecutionTime{

	public static void main(String[] args){

		int[] randomNumbers=new int[100000];

		for(int i=0;i<randomNumbers.length;i++){
			randomNumbers[i]=(int)(Math.random()*100000);

		}



		int key=(int)(Math.random()*10);
		System.out.println("key: "+key);

		long startTime=System.currentTimeMillis();
		System.out.println(linearSearch(randomNumbers,key));
		long endTime=System.currentTimeMillis();
		long linearExecutionTime=endTime-startTime;
		System.out.println("Linear search time: "+linearExecutionTime);

		System.out.println("-------------------------------------");

		long startTimeBinary=System.currentTimeMillis();
		System.out.println(binarySearch(randomNumbers,key));
		long endTimeBinary=System.currentTimeMillis();
		long binaryExecutionTime=endTimeBinary-startTimeBinary;
		System.out.println("Binary search time: "+binaryExecutionTime);



	}



	public static int linearSearch(int[] numbers,int key){

		int index=-1;

		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==key){
				index=i;
			}

		}

		return index;

	}





	public static int binarySearch(int[] numbers, int key){


		int[] sortedList=sort(numbers);
		
		int low=0;
		int high=sortedList.length-1;

		while(high>=low){
			int mid=(low+high)/2;

			if(key<sortedList[mid]){
				high=mid-1;
			}else if(key==sortedList[mid]){
				return mid;
			}else{
				low=mid+1;
			}
		}


		return -1;


	}




		public static int[] sort(int[] numbers){

		int[] sorted=numbers;
		int length=sorted.length;
		int smallest;
		int index;
       	int temp;

	   	for(int j=0;j<length-1;j++){

			smallest=sorted[j];
        		index=j;

			for(int i=j+1;i<length;i++){

				if(sorted[i]<smallest){

					smallest=sorted[i];
					index=i;
				}

			}
         

         		temp=sorted[j];
        		 sorted[j]=smallest;
         		sorted[index]=temp;

	  	  }
      
      			return sorted;
      
 		}


}


