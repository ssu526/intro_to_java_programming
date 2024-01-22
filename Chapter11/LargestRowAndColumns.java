/*
11.9 (Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.) Here is a sample run of the program:

Enter the array size n: 4
The random array is
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2, 3
*/

import java.util.*;

public class LargestRowAndColumns{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size n: ");
		int arraySize = sc.nextInt();

		int[][] randomArray = createRandomArray(arraySize);
		ArrayList<Integer> largestRow = findLargestRow(randomArray);
		ArrayList<Integer> largestColumn = findLargestColumn(randomArray);

		for(int r=0;r<arraySize;r++){
			for(int c=0;c<arraySize;c++){
				System.out.print(randomArray[r][c]+" ");
			}
			System.out.println("");
		}

		
		System.out.print("The largest row index ");
		for(int i=0;i<largestRow.size();i++){
			if(i==largestRow.size()-1){
				System.out.print(largestRow.get(i));
			}else{
				System.out.print(largestRow.get(i)+", ");
			}
		}	
		System.out.println("");

		System.out.print("The largest column index ");
		for(int j=0;j<largestColumn.size();j++){
			if(j==largestColumn.size()-1){
				System.out.print(largestColumn.get(j));
			}else{
				System.out.print(largestColumn.get(j)+", ");
			}
		}
		System.out.println("");
	}

	public static ArrayList<Integer> findLargestRow(int[][] randomArray){
		int arraySize=randomArray.length;
		int sum;
		ArrayList<Integer> maxRow= new ArrayList<>();
		int max=0;

		for(int r=0;r<arraySize;r++){
			sum=0;
			for(int c=0;c<arraySize;c++){
				sum=sum+randomArray[r][c];
			}
			
			if(sum>max){
				max=sum;
				maxRow.clear();
				maxRow.add(r+1);
			}else if(sum==max){
				maxRow.add(r+1);
			}else{
			}
		}

		return maxRow;

	}

	public static ArrayList<Integer> findLargestColumn(int[][] randomArray){
		int arraySize=randomArray.length;
		int sum;
		ArrayList<Integer> maxColumn= new ArrayList<>();
		int max=0;

		for(int c=0;c<arraySize;c++){
			sum=0;
			for(int r=0;r<arraySize;r++){
				sum=sum+randomArray[r][c];
			}
			
			if(sum>max){
				max=sum;
				maxColumn.clear();
				maxColumn.add(c+1);
			}else if(sum==max){
				maxColumn.add(c+1);
			}else{
			}
		}
		
		return maxColumn;
	}

	public static int[][] createRandomArray(int arraySize){
		int[][] randomArray = new int[arraySize][arraySize];

		for(int row=0;row<arraySize;row++){
			for(int column=0;column<arraySize;column++){
				randomArray[row][column]=(int)(Math.random()*2);
			}
		}
		
		return randomArray;
	}

}

