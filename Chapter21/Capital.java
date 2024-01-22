/**21.9 (Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store pairs of each state and its capital in a map. 
Your program should prompt the user to enter a state and should display the capital for the state.
*/
import java.util.*;
import java.io.*;

 public class Capital{
 	public static void main(String[] args) throws Exception{
 		File file = new File("Capitals.txt");
 		Map<String, String> map = new java.util.HashMap<>();

 		Scanner sc = new Scanner(file);
 		while(sc.hasNext()){
 			String line = sc.nextLine();
 			String[] arr = line.split(",");
 			map.put(arr[0],arr[1]);
 		}

 		System.out.println("Enter a state name: ");
 		Scanner input = new Scanner(System.in);
 		System.out.println(map.get(input.nextLine()));

 	}
 }