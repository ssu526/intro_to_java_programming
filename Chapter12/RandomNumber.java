




/*12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the followingrequirements: - Creates an array with 100 randomly chosen integers. - Prompts the user to enter the index of the array, then displays the correspondingelement value. If the specified index is out of bounds, display themessage Out of Bounds.*/import java.util.*;public class RandomNumber{ public static void main(String[] args){ int[] randomNumbers = new int[100]; for(int i=0;i<100;i++){ randomNumbers[i]=(int)(Math.random()*100); } Scanner sc = new Scanner(System.in); System.out.println("Enter a number between 1 to 100"); try{ System.out.println(randomNumbers[sc.nextInt()-1]); } catch(ArrayIndexOutOfBoundsException ex){ System.out.println("Please enter a number between 1 to 100"); } }} 
