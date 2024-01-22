/*22.6 (Execution time for GCD) Write a program that obtains the execution time for
finding the GCD of every two consecutive Fibonacci numbers from the index
40 to index 45 using the algorithms in Listings 22.3 and 22.4. Your program
should print a table like this:

			40 41 42 43 44 45
Listing 22.3 GCD
Listing 22.4 GCDEuclid

(Hint: You can use the following code template to obtain the execution time.)
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
*/

public class GCDExecutionTime{
	public static void main(String[] args){
		int[] numbers = new int[6];
		int fibonacci40 = findFibonacci(40);
		int fibonacci41 = findFibonacci(41);

		numbers[0]=fibonacci40;
		numbers[1]=fibonacci41;
		numbers[2]=numbers[0]+numbers[1];
		numbers[3]=numbers[1]+numbers[2];
		numbers[4]=numbers[2]+numbers[3];
		numbers[5]=numbers[3]+numbers[4];

		System.out.println("	40     41     42     43     44     45");
		System.out.print("GCD	");
		for(int i=0;i<5;i++){
			System.out.print(gcd(numbers[i],numbers[i+1]));
			System.out.print("	");
		}

		System.out.println("");

		System.out.print("GCDEuclid ");
		for(int i=0;i<5;i++){
			System.out.print(gcdEuclidTime(numbers[i],numbers[i+1]));
			System.out.print("	");
		}

		System.out.println("");

	}

	public static long gcd(int n1, int n2){
		
		long startTime=System.currentTimeMillis();

		if(n2%n1==0){
			return n1;
		}

		for(int k=n1/2;k>=1;k--){
			if(n2%k==0 && n1%k==0){
				return k;
			}
		}

		long endTime=System.currentTimeMillis();

		return endTime-startTime;
	}
  

	public static long gcdEuclidTime(int n1, int n2){
		long startTime=System.currentTimeMillis();
		gcdEuclid(n1,n2);	
		long endTime=System.currentTimeMillis();

		return endTime-startTime;
	}

  
	public static int gcdEuclid(int n1, int n2){
		
		if(n2%n1==0){
			return n1;
		}else{
			return gcdEuclid(n2%n1,n1);
		}

	}


  
  	public static int findFibonacci(int n){
		int f0 = 0;
		int f1 = 1;
		int f2 = 1;

		if(n==0){
			return f0;
		}else if(n==1){
			return f1;
		}else{
			for(int i=2;i<=n;i++){
				f2=f0+f1;
				f0=f1;
				f1=f2;
			}
			return f2;
		}
	}
	
}
