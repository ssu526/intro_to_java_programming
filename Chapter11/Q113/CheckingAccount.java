/*
11.3 (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. 
An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit and with- draw funds. 
Create two subclasses for checking and saving accounts. A checking account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of Account, SavingsAccount, 
and CheckingAccount and invokes their toString() methods.
*/

package Chapter11.Q113;
import Chapter9.Account;

public class CheckingAccount extends Account{
	private static final double OVERDRAFT_LIMIT=1000;

	@Override
	public void withdraw(double amount){
		if(getBalance()-amount<-1000){
			System.out.println("withdraw failed");
		}else{
			withdraw(amount);
		}
	}

	@Override
	public String toString(){
		return "Checking Account Balance: "+getBalance();
	}
}
