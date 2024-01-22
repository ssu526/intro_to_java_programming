
/*12.1 (NumberFormatException) Listing 7.9, Calculator.java, is a simple commandlinecalculator. Note that the program terminates if any operand is 
nonnumeric.Write a program with an exception handler that deals with nonnumeric operands;then write another program without using an exception handler 
to achieve thesame objective. Your program should display a message that informs the user ofthe wrong operand type before exiting (see Figure 12.12).*/

public class Calculator{ 
	public static void main(String[] args){ 
		if(args.length!=3){ 
			System.out.println("Please enter the equation in the following format: "); 
			System.out.println("java Calculator operand1 operator operand2"); 
			System.exit(0); 
		} 

			int result=0; 

			try{ 
				switch (args[1].charAt(0)){ 
					case '+': result=Integer.parseInt(args[0])+Integer.parseInt(args[2]); break; 
				  	case '-': result=Integer.parseInt(args[0])+-Integer.parseInt(args[2]); break; 
				  	case '.': result=Integer.parseInt(args[0])*Integer.parseInt(args[2]); break; 
				  	case '/': result=Integer.parseInt(args[0])/Integer.parseInt(args[2]); break; 
				 } 
				  	System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result); 
			}catch(NumberFormatException ex){ 
					System.out.println(ex.getMessage()); 
			} 
	}
}

/*
public class Calculator{ 
	public static void main(String[] args){ 
		if(args.length!=3){ 
			System.out.println("Please enter the equation in the following format: "); 
			System.out.println("java Calculator operand1 operator operand2"); 
			System.exit(0); } int result=0; 

			if(args[0].matches("\\d+") && args[2].matches("\\d+")){ 
				switch (args[1].charAt(0)){ 
					case '+': result=Integer.parseInt(args[0])+Integer.parseInt(args[2]); break; 
					case '-': result=Integer.parseInt(args[0])+-Integer.parseInt(args[2]); break; 
					case '.': result=Integer.parseInt(args[0])*Integer.parseInt(args[2]); break; 
					case '/': result=Integer.parseInt(args[0])/Integer.parseInt(args[2]); break; 
				} 
				System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result); }

			else{ System.out.println("Please enter the equation in the following format: "); 
			System.out.println("java Calculator operand1 operator operand2"); 
		} 
	}
} 
*/