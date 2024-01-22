
//Chapter 9 - Question 13

class Location{

	public static int row;
	public static int column;
	public static double maxValue;

  	public Location(){
  		
  	}
  
	public static Location locateLargest(double[][] a){
		row=0;
		column=0;
		maxValue=a[0][0];

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]>maxValue){
					row=i;
					column=j;
					maxValue=a[i][j];
				}	
			}
		}

		return new Location();
	}


}


public class FindLocation{

	public static void main(String[] args){

		double[][] matrix ={{23.5,35,2,10},{4.5,3,45,3.5},{35,44,5.5,9.6}};
		Location.locateLargest(matrix);
		System.out.println("The location of the largest element is "+Location.maxValue+" at ("+Location.row+", "+Location.column+")");		

	}

}
