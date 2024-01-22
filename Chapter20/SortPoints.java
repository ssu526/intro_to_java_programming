/*20.4 (Sort points in a plane) Write a program that meets the following requirements:
- Define a class named Point with two data fields x and y to represent a
pointís x- and y-coordinates. Implement the Comparable interface for comparing
the points on x-coordinates. If two points have the same x-coordinates,
compare their y-coordinates.
- Define a class named CompareY that implements Comparator<Point>.
Implement the compare method to compare two points on their y-coordinates.
If two points have the same y-coordinates, compare their x-coordinates.
- Randomly create 100 points and apply the Arrays.sort method to display
the points in increasing order of their x-coordinates and in increasing order
of their y-coordinates, respectively.
*/

import java.util.Comparator;

public class SortPoints{
	public static void main(String[] args){
		Point[] points = new Point[100];
		for(int i=0;i<100;i++){
			double x = Math.random()*100+1;
			double y = Math.random()*100+1;
			points[i]=new Point(x,y);
		}

		java.util.Arrays.sort(points);

		for(Point p: points){
			System.out.printf("%5.2f %5.2f \n",p.getX(), p.getY());
		}

		for(int j=0;j<99;j++){
			for(int k=j;k<99;k++){
				int indicator = comparePoint(points[k],points[k+1],new CompareYComparator());
				if(indicator<0){
					Point temp=points[k];
					points[k]=points[k+1];
					points[k+1]=temp;
				}
			}
		}


        System.out.println("\n\n\n");
        
		for(Point p: points){
			System.out.printf("%5.2f %5.2f \n",p.getX(), p.getY());
		}

	
	}
	
	public static int comparePoint(Point p1, Point p2, Comparator<Point> c){
		return c.compare(p1,p2);
	}
}

class CompareYComparator implements Comparator<Point>, java.io.Serializable{
	@Override
	public int compare(Point p1, Point p2){
		if(p1.getY()>p2.getY()){
			return 1;
		}else if(p1.getY()<p2.getY()){
			return -1;
		}else{
			if(p1.getX()>p2.getX()){
				return 1;
			}else if(p1.getX()<p2.getX()){
				return -1;
			}else{
				return 0;
			}
		}
	}
}

class Point implements Comparable<Point>{
	private double x;
	private double y;

	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}

	public Point(){
		this(0,0);
	}

	public double getX(){
		return x; 
	}

	public double getY(){
		return y;
	}

	@Override
	public int compareTo(Point p2){
		if(this.x>p2.x){
			return 1;
		}else if(this.x<p2.x){
			return -1;
		}else{
			if(this.y>p2.y){
				return 1;
			}else if(this.y<p2.y){
				return -1;
			}else{
				return 0;
			}
		}
	}
}

