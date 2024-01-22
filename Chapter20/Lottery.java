/**20.8 (Game: lottery) Revise Programming Exercise 3.15 to add an additional $2,000
award if two digits from the user input are in the lottery number. (Hint: Sort
the three digits in the lottery number and three digits in the user input into two
lists, and use the Collectionís containsAll method to check whether the
two digits in the user input are in the lottery number.)
*/

/*
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Lottery{
	public static void main(String[] args){
		ArrayList<Integer> lottery = new ArrayList<>();
		lottery.add((int)(Math.random()*10));
		lottery.add((int)(Math.random()*10));
		lottery.add((int)(Math.random()*10));
		System.out.println(lottery);

		System.out.println("Enter 3 digits");
		Scanner sc = new Scanner(System.in);
		String userInput= sc.next();

		ArrayList<Integer> user = new ArrayList<>();
		user.add(Integer.parseInt(String.valueOf(userInput.charAt(0))));
		user.add(Integer.parseInt(String.valueOf(userInput.charAt(1))));
		user.add(Integer.parseInt(String.valueOf(userInput.charAt(2))));
		System.out.println(user);

		ArrayList<Integer> lotterySet1 = new ArrayList<>();
		ArrayList<Integer> lotterySet2 = new ArrayList<>();
		ArrayList<Integer> lotterySet3 = new ArrayList<>();
		lotterySet1.add(lottery.get(0));
		lotterySet2.add(lottery.get(0));
		lotterySet3.add(lottery.get(1));
		lotterySet1.add(lottery.get(1));
		lotterySet2.add(lottery.get(2));
		lotterySet3.add(lottery.get(2));

		if(user.equals(lottery)){
			System.out.println("Prize: $10000");
		}else if(user.containsAll(lottery) && lottery.containsAll(user)){
			System.out.println("Prize: $3000");
		}else if(user.containsAll(lotterySet1) || user.containsAll(lotterySet2) || user.containsAll(lotterySet3)){
			System.out.println("Prize: $2000");
		}else if(lottery.contains(user.get(0)) || lottery.contains(user.get(1)) || lottery.contains(user.get(2))){
			System.out.println("Prize: 1000");
		}else{
			System.out.println("Try again");
		}
	}
}