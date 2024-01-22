//Chapter 8 - Question 7

/*

(Points nearest to each other) Listing 8.3 gives a program that finds two points in a
two-dimensional space nearest to each other. Revise the program so that it finds two
points in a three-dimensional space nearest to each other. Use a two-dimensional
array to represent the points. Test the program using the following points:

double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
{5.5, 4, -0.5}};

*/


public class NearestPoints{
	public static void main(String[] args){

		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},{5.5, 4, -0.5}};


		int numberOfPoints=points.length;
		double shortestDistance=computeDistance(points[0],points[1]);
		int[] nearestPoints={0,1};
      	double distance;

		for(int i=1;i<numberOfPoints-1;i++){
			for(int k=i+1;k<numberOfPoints;k++){

				distance=computeDistance(points[i],points[k]);

				if(distance<shortestDistance){
					shortestDistance=distance;
					nearestPoints[0]=i;
                  	nearestPoints[1]=k;
				}
			}			

		}

      
		System.out.println("The nearest points are "+printArray(points[nearestPoints[0]])+" and "+printArray(points[nearestPoints[1]])+". There distance is "+Math.round(shortestDistance*100.00)/100.00);
		

	}


	public static double computeDistance(double[] a,double[] b){

		double x=Math.pow((a[0]-b[0]),2);
		double y=Math.pow((a[1]-b[1]),2);
		double z=Math.pow((a[2]-b[2]),2);

		double distance=Math.sqrt(x+y+z);

		return distance;
	}
  
  
  
  public static String printArray(double[] x){
    
    String arrayDisplay="{";
    
    for(int i=0;i<x.length;i++){
      	arrayDisplay=arrayDisplay+x[i]+" ";
    }
    
    arrayDisplay=arrayDisplay+"}";
    
    return arrayDisplay;
  }

}


