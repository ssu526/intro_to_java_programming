/*22.5 (Same-number subsequence) Write an O(n) program that prompts the user to
enter a sequence of integers ending with 0 and finds the longest subsequence
with the same number. Here is a sample run of the program:

Enter a series of numbers ending with 0:
2 2 4 4 4 8 8 8 8 2 4 4 0
The longest same number sequence starts at index 3 with 4 values of 8
*/

import java.util.Scanner;

public class SameNumberSubsequence{
	public static void main(String[] args){
		System.out.println("Enter a series of numbers ending with 0: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int start=0;
		int inputCount = 1;
		int number=number1;
		int maxStart=start;
		int maxLen = 1;
		int len=1;

		while(number1!=0){
			int number2=sc.nextInt();

			if(number2!=0){
				inputCount++;
				if(number2==number1){
					len=len+1;
				}else{
					if(len>maxLen){
						maxStart=start;
						maxLen=len;
						number=number1;
					}


					start=inputCount-1;
					number1=number2;
					len=1;
				}

			}else{

				if(len>maxLen){
					maxStart=start;
					maxLen=len;
					number=number1;
				}
				break;
			}
		}


		System.out.println("Starts at index "+maxStart+" with "+maxLen+" values of "+number);
	}
}





