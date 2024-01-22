//Chapter 8 - Question 4

/*

(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employeeís
seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours.

	Su M T W Th F Sa
Employee 0 2 4 3 4 5 8 8
Employee 1 7 3 4 3 3 4 4
Employee 2 3 3 4 3 3 2 2
Employee 3 9 3 4 7 3 4 1
Employee 4 3 5 4 3 6 3 8
Employee 5 3 4 4 6 3 4 4
Employee 6 3 7 4 8 3 8 4
Employee 7 6 3 5 9 2 7 9

*/


public class WeeklyHours{
  public static void main(String[] args){
  	
    	final int numberOfEmployees=8;
    	final int numberOfDays=7;
    
   		int[][] hours={{2,4,3,4,5,8,8},
    					{7,3,4,3,3,4,4},
    					{3,5,4,3,6,3,8},
    					{9,3,4,7,3,4,1},
    					{3,5,4,3,6,3,8},
    					{3,4,4,6,3,4,4},
    					{3,7,4,8,3,8,4},
    					{6,3,5,9,2,7,9}}; 
    
    	int[][] totalHour=new int[numberOfEmployees][2];
    	int total;
    
    for(int i=0;i<numberOfEmployees;i++){
      
      total=0;
     	
      for(int k=0;k<numberOfDays;k++){
        
       		total=total+hours[i][k]; 
        
      }
      
      totalHour[i][0]=i;
      totalHour[i][1]=total;
      
    }
    
    int smallest, smallestIndex, temp, tempIndex;
    
    for(int j=0;j<numberOfEmployees-1;j++){
     	smallestIndex=j;
      	smallest=totalHour[j][1];
      	
      
      for(int m=j+1;m<numberOfEmployees;m++){
        
        if(totalHour[m][1]<smallest){
          
         	smallestIndex=m;
          	smallest=totalHour[m][1];
          
          	temp=totalHour[j][1];
          	tempIndex=totalHour[j][0];
          
          
          	totalHour[j][1]=totalHour[m][1];
          	totalHour[j][0]=totalHour[m][0];
          
          	totalHour[m][1]=temp;
          	totalHour[m][0]=tempIndex;
       		
          
        }
        
      }
                	
      
    }
    
    
    for(int n=0;n<numberOfEmployees;n++){
     System.out.println("Employee "+totalHour[n][0]+" worked "+totalHour[n][1]+" hours."); 
      
    }

    
  } 
  
}
