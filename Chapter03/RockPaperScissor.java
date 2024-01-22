import java.util.Scanner;

public class RockPaperScissor{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Scissor (0), rock(1), paper(2) : ");
		int user = input.nextInt();

		int ran = (int)(Math.random()*3);
		String computer;

		if(ran==0){
			computer="Scissor";
		}
		else if(ran==1){
			computer="Rock";
		}
		else{
			computer="Paper";
		}


		if(user==ran){
			System.out.println("The computer is "+computer+". You are "+computer+" too. It is a draw.");

		}
		else if(user==0 && ran==1){
			System.out.println("The computer is rock. You are scissor. The computer won");
		}
		else if(user==0 && ran==2){
			System.out.println("The computer is paper. You are scissor. You won");
		}
		else if(user==1 && ran==0){
			System.out.println("The computer is Scissor. You are rock. YOu won");
		}
		else if(user==2 && ran==0){
			System.out.println("The computer is Scissor. You are paper. The computer won");
		}
		else if(user==1 && ran==2){
			System.out.println("The computer is paper. You are rock. The computer won");
		}
		else{
			System.out.println("The computer is rock. You are paper. You won");
		}


	}


}