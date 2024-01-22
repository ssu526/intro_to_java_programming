//Chapter 7 - Question 20

/*

(Revise selection sort) In Section 7.11, you used selection sort to sort an array.
The selection-sort method repeatedly finds the smallest number in the current
array and swaps it with the first. Rewrite this program by finding the largest number
and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.



*/


public class ReviseSelectionSort{

	public static void main(String[] args){

      double[] numbers={3,4,5,8,9,3,1,2,5,7};

		int indexMax;
		double temp;
      	double max;

      for(int i=9;i>=0;i--){
      	
        indexMax=i;
        max=numbers[i];
        
        for(int j=0;j<i;j++){
          if(numbers[j]>max){
           		indexMax=j;
            	max=numbers[j];
            
          }
          
        }
        
        temp=numbers[i];
        numbers[i]=numbers[indexMax];
        numbers[indexMax]=temp;
        
      }
      
      
      
      
      for(int x=0;x<10;x++){
		System.out.println(numbers[x]);
      }
      
      
      

	}


}



