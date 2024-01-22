/*11.17 (Algebra: perfect square) Write a program that prompts the user to enter an integer
m and find the smallest integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
in the array list. So, n is 10.) Here are sample runs:
Enter an integer m: 1500
The smallest number n for m * n to be a perfect square is 15
m * n is 22500

Enter an integer m: 63
The smalle
st number n for m * n to be a perfect square is 7
m * n is 441
*/

import java.util.ArrayList;

public class PerfectSquare{
	public static void main(String[] args){
		int m = 63;
		int n=1;
		ArrayList<Integer> factors = findFactors(m);
		ArrayList<Integer> oddAppearance = findOddAppearance(factors);
		
		for(int i=0;i<oddAppearance.size();i++){
			n=n*oddAppearance.get(i);	
		}
		
		System.out.println("m is "+m);
		System.out.println("n is "+n);
		System.out.println("m*n is "+m*n);

	}


	public static ArrayList<Integer> findFactors(int m){
		ArrayList<Integer> factors = new ArrayList<>();
		int number = m;
		int factor=2;

		while(number !=1){
			if(number%factor==0){
				factors.add(factor);
				number=number/factor;
				factor=2;
			}else{
				factor++;
			}
		}
		return factors;
	}

	public static ArrayList<Integer> findOddAppearance(ArrayList<Integer> factors){
		ArrayList<Integer> oddAppearance = new ArrayList<Integer>();
		
		for(int i=0;i<factors.size();i++){
			if(count(factors.get(i),factors)%2!=0 && !(oddAppearance.contains(factors.get(i)))){
				oddAppearance.add(factors.get(i));
			}
		}

		return  oddAppearance;
	}

	public static int count(int number, ArrayList<Integer> factors){
		int count=0;

		for(int i=0;i<factors.size();i++){
			if(factors.get(i)==number){
				count++;
			}
		}

		return count;
	}
	

}

