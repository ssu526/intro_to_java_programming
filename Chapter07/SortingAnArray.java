//Page 269
//Sorting an array


public class SortingAnArray{
  
  public static void main(String[] args){
    
    int[] numbers={2,9,5,4,1,6};
    
    for(int a:numbers){
      System.out.print(a);
    }
    
    System.out.println("");
    
    
    for(int i=0;i<=numbers.length-2;i++){
     	int min=numbers[i];
      	int index=i;
      
     	 for(int m=i+1;m<=numbers.length-1;m++){
           if(numbers[m]<min){
           		min=numbers[m];
             	index=m;
           }
          
      	}
      
      
      int temp = numbers[i];
      numbers[i]=min;
      numbers[index]=temp;
      

    }
    
    
    for(int j:numbers){
      System.out.print(j);
    }
    
    System.out.println("");
    
  }
  
  
}

