import java.util.Scanner;

public class MajorAndStatus{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter major and status: ");
		String userInput = input.next();

		char major=userInput.charAt(0);
		char status=userInput.charAt(1);
		
		String majorName="";
		String studentStatus="";


		if(major=='M' || major=='m'){
			majorName="Mathematics";
		}
		else if(major=='C' || major=='c'){
			majorName="Computer Science";
		}
		else if(major=='I' || major=='i'){
			majorName="Information Technology";
		}
		else{
			System.out.println("Invalid major");
		}


		if(status=='1'){
			studentStatus="Freshman";
		}
		else if(status=='2'){
			studentStatus="Sophomore";
		}
		else if(status=='3'){
			studentStatus="Junior";
		}
		else if(status=='4'){
			studentStatus="senior";
		}
		else{
			System.out.println("Invalid status");
		}


		System.out.println(majorName+" "+studentStatus);
			
	}


}