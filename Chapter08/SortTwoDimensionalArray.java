//Chapter 8 - Question 16

/*

(Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:

public static void sort(int m[][])

The method performs a primary sort on rows and a secondary sort on columns.

For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.

*/





public class SortTwoDimensionalArray{

	public static void main(String[] args){

      int[][] unsorted={{4, 2},{1, 7},{4, 5},{1, 2},{4,9},{1, 1},{4, 1}};
		sort(unsorted);

	}


	public static void sort(int m[][]){

		int numOfRows=m.length;
		int smallest, smallestIndex, temp0, temp1;
		

		for(int row=0;row<numOfRows-1;row++){
			smallest=m[row][0];
			smallestIndex=row;

			for(int i=row+1;i<numOfRows;i++){

				if(m[i][0]<smallest){
									
					smallest=m[i][0];
					smallestIndex=i;
				}	
			}

			temp0=m[row][0];
          	temp1=m[row][1];
			m[row][0]=m[smallestIndex][0];
          	m[row][1]=m[smallestIndex][1];
			m[smallestIndex][0]=temp0;
          	m[smallestIndex][1]=temp1;
		}

      
      int smallest2, smallestIndex2, temp02, temp12;
      
      for(int k=0;k<numOfRows-1;k++){
        smallest2=m[k][1];
        smallestIndex2=k;
        
        for(int j=k+1;j<numOfRows;j++){
          if(m[j][0] !=m[j-1][0]){
            break;
          }else{
            if(m[j][1]<smallest2){
              	smallest2=m[j][1];
              	smallestIndex2=j;
            }
          }
      	}
        
        
        temp02=m[k][0];
        temp12=m[k][1];
        m[k][0]=m[smallestIndex2][0];
        m[k][1]=m[smallestIndex2][1];
        m[smallestIndex2][0]=temp02;
        m[smallestIndex2][1]=temp12;
        
      }

         
      
      for(int w=0;w<numOfRows;w++){
        	System.out.print("{"+m[w][0]+", "+m[w][1]+"} "); 
      }


		

	}



}