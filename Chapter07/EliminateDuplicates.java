//Chapter 7 - Question 15

/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays
the result.

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5


*/

import java.util.Scanner;

public class EliminateDuplicates{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers: ");

		int[] numbers=new int[10];

		for(int i=0;i<10;i++){
			numbers[i]=sc.nextInt();

		}

		int[] distinctList=eliminateDuplicates(numbers);

		for(int k=0;k<distinctList.length;k++){
			System.out.print(distinctList[k]+" ");
		}

		System.out.println("");
		
	}



	public static int[] eliminateDuplicates(int[] list){

		int[] tempList=new int[10];
		boolean distinct=true;
		tempList[0]=list[0];
		int index=1;

		for(int i=1;i<10;i++){
			
			distinct=true;

			for(int j=0;j<index;j++){
				if(list[i]==tempList[j]){
                  	distinct=false;
					break;

				}

			}
          
         	if(distinct==true){
				tempList[index]=list[i];
				index++;
			}
			

		}
      
      
      	int[] distinctList=new int[index];
      
      
      for(int m=0;m<index;m++){
       	distinctList[m]=tempList[m]; 
        
      }
      
      
      	return distinctList;
      
      
      

	}


}


