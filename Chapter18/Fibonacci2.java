/*18.7 (Fibonacci series) Modify Listing 18.2, ComputeFibonacci.java, so that the program
finds the number of times the fib method is called. (Hint: Use a static
variable and increment it every time the method is called.)
*/

public class Fibonacci2{
	static int count;

	public static void main(String[] args){
		int i=4;
		System.out.println(findFibonacci(i));
		System.out.println(count);
	}

	public static int findFibonacci(int i){
		int sum=0;
		count++;

		if(i==0 || i==1){
			return 1;
		}else{
			count=count+2;
			return findFibonacci(i-2)+findFibonacci(i-1);
		}

	}
}