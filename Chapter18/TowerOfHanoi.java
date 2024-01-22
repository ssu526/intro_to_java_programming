/*
18.18 (Tower of Hanoi) Modify Listing 18.8, TowerOfHanoi.java, so that the program
finds the number of moves needed to move n disks from tower A to tower B.
(Hint: Use a static variable and increment it every time the method is called.)
*/

public class TowerOfHanoi{
	static int count;

	public static void main(String[] args){
		int numberOfDisks = 3;
		count=1;
		move(numberOfDisks,'A','B','C');
		System.out.println(count);
	}

	public static void move(int n, char from, char to, char helper){
		if(n==1){
			System.out.println("Move disk 1 from "+from+" to "+to);
		}else{
			move(n-1,from,helper,to);
			System.out.println("Move disk "+n+" from " + from+" to "+to);
			move(n-1,helper,to,from);
			count=count+2;
		}
	}
}