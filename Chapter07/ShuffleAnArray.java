//Shuffle an array
//page 250

public class ShuffleAnArray{
  
  public static void main(String[] args){
    
    double[] myList={1,2,3,4,5,6};
    
    for(int i=myList.length-1;i>0;i--){
     	
      	int j=(int)(Math.random()*(i+1));
      
      
      	double temp=myList[i];
      	myList[i]=myList[j];
      	myList[j]=temp;
      
      
    }
    
    
    for(int i=0;i<myList.length;i++){
      System.out.println(myList[i]);
    }
    
  }
}