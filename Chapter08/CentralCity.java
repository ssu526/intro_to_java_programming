//Chapter 8 - Question 21

/*
(Central city) Given a set of cities, the central city is the city that has the shortest total distance to all other cities. Write a program that prompts the user to enter the number of the cities and the locations of the cities (coordinates), and finds the central city and its total distance to all other cities.

Enter the number of cities: 5
Enter the coordinates of the cities:
  2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
The central city is at (2.5, 5.0)
The total distance to all other cities is 60.81

*/

import java.util.Scanner;

public class CentralCity{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cities: ");
		int numberOfCities=sc.nextInt();
		System.out.println("Enter the coordinates of the cities: ");
		double[][] cityCoordinates = new double[numberOfCities][2];

		for(int i=0;i<numberOfCities;i++){
			cityCoordinates[i][0]=sc.nextDouble();
			cityCoordinates[i][1]=sc.nextDouble();
		}


		double[] totalDistance=findTotalDistance(cityCoordinates);

		for(int a=0;a<numberOfCities;a++){
			System.out.print(totalDistance[a]+" ");
		}
		System.out.println("");

		double shortest=totalDistance[0];
		int centralCity=0;

		for(int k=1;k<numberOfCities;k++){
			if(totalDistance[k]<shortest){
				shortest=totalDistance[k];
				centralCity=k;
			}
		}

		System.out.println("The central city is at ("+cityCoordinates[centralCity][0]+", "+cityCoordinates[centralCity][1]+")");
		System.out.println("The totalDistance to all other cityies is "+totalDistance[centralCity]);

	}


	public static double[] findTotalDistance(double[][] cityCoordinates){
		double[][] distance = findIndividualDistance(cityCoordinates);
		double[] totalDistance=new double[cityCoordinates.length];
		double sum;

		for(int i=0;i<cityCoordinates.length;i++){
			sum=0;
			for(int j=0;j<cityCoordinates.length;j++){
					sum=sum+distance[i][j];
			}

			totalDistance[i]=sum;
		}

		return totalDistance;
	}


	public static double[][] findIndividualDistance(double[][] cityCoordinates){
		double[][] distance = new double[cityCoordinates.length][cityCoordinates.length];

		for(int i=0;i<cityCoordinates.length;i++){
			for(int j=0;j<cityCoordinates.length;j++){
				distance[i][j]=Math.sqrt(Math.pow(cityCoordinates[i][0]-cityCoordinates[j][0],2)+Math.pow(cityCoordinates[i][1]-cityCoordinates[j][1],2));
			}
		}

		return distance;
	}



}