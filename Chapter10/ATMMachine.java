//Chapter 10 - Question 7

/*

(Game: ATM machine) Use the Account class created in Programming Exercise
9.7 to simulate an ATM machine. Create ten accounts in an array with id
0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
is accepted, the main menu is displayed as shown in the sample run. You can
enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
depositing money, and 4 for exiting the main menu. Once you exit, the system
will prompt for an id again. Thus, once the system starts, it will not stop.


*/

import java.util.Scanner;

class Account{

	private int id;
	private double balance;
	private final static double annualInterestRate=0.045;
	private java.util.Date dateCreated;
  	

	public Account(){
		this(0,0);
	}

	public Account(int id,double balance){
      	dateCreated= new java.util.Date();
		this.id=id;
		this.balance=balance;

	}

	public int getID(){
		return id;
	}

	public double getBalance(){
		return balance;
	}

	public static double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	public static double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}

	public double getMonthlyInterest(){
		return balance*annualInterestRate/12/100;
	}

	public void withdraw(double amount){
		balance=balance-amount;
	}

	public void deposit(double amount){
		balance=balance+amount;
	}

}


public class ATMMachine{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Account[] accounts = new Account[10];
		int inputID, choice;
		choice=1;
		double amount;
		boolean var = true;

		for(int i=0;i<10;i++){
			accounts[i]=new Account(i,100);
		}

		while(var==true){

			System.out.println("Enter an id: ");
			inputID = sc.nextInt();

			while(inputID<0 || inputID>9){
				System.out.println("ID does not exist. Please enter again");
				inputID=sc.nextInt();
			}


			while(choice != 4){
			
				System.out.println("\nMain Menu");
				System.out.println("1: Check balance");
				System.out.println("2: Withdraw");
				System.out.println("3: deposit");
				System.out.println("4: Exit");
				System.out.println("Enter a choice: ");

				choice = sc.nextInt();

				if(choice==1){
					System.out.println("The balance is "+accounts[inputID].getBalance());
				}else if(choice==2){
					System.out.println("Enter an amount to withdraw: ");
					amount=sc.nextDouble();
					accounts[inputID].withdraw(amount);
				}else if(choice==3){
					System.out.println("Enter an amount to deposit: ");
					amount=sc.nextDouble();
					accounts[inputID].deposit(amount);
				}else if(choice==4){
					break;
				}else{
					System.out.println("Please enter an integer between 1 to 4.");
				}

			}

		}

	}
}

