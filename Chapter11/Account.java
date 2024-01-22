/*
11.8 (New Account class) An Account class was specified in Programming Exercise 9.7. Design a new Account class as follows:
	- Add a new data field name of the String type to store the name of the customer.
	- Add a new constructor that constructs an account with the specified name, id, and balance.
	- Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts. 
	Each transaction is an instance of the Transaction class. The Transaction class is defined as shown in Figure 11.6.

	- Modify the withdraw and deposit methods to add a transaction to the
transactions array list.
	- All other properties and methods are the same as in Programming Exercise 9.7.

Write a test program that creates an Account with annual interest rate 1.5%,
balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account. Print an account summary
that shows account holder name, interest rate, balance, and all transactions.
*/

import java.util.*;

class AccountClass{
	private int id;
	private String customerName;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transaction= new ArrayList<>();
	
	public AccountClass(){
		this.dateCreated = new java.util.Date();
	}

	public AccountClass(int id, double balance){
		this();
		this.id=id;
		this.balance=balance;
	}

	public AccountClass(String customerName, int id, double balance){
		this(id,balance);
		this.customerName=customerName;
	}

	public ArrayList<Transaction> getTransaction(){
		return transaction;
	}

	public int getID(){
		return id;
	}

	public String getCustomerName(){
		return customerName;
	}

	public double getBalance(){
		return balance;
	}

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public Date getDateCreated(){
		return dateCreated;
	}

	public void setID(int id){
		this.id=id;
	}

	public void setBalance(double balance){
		this.balance=balance;
	}

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}

	public double getMonthlyInterest(){
		return annualInterestRate/12*balance;
	}

	public void withdraw(double amount){
		balance=balance-amount;
		transaction.add(new Transaction('W',amount,balance,"Withdrew "+amount+"; Balance "+balance));
	}

	public void deposit(double amount){
		balance=balance+amount;
		transaction.add(new Transaction('D',amount,balance,"Deposit "+amount+"; Balance "+balance));
	}

}


class Transaction{
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	public Transaction(char type, double amount, double balance, String description){
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
		this.date=new java.util.Date();
	}

	public String getDescription(){
		return description;
	}
}


public class Account{
	public static void main(String[] args){
		AccountClass Acct = new AccountClass("George",1122,1000);
		Acct.setAnnualInterestRate(0.015);
		Acct.deposit(30);
		Acct.deposit(40);
		Acct.deposit(50);
		Acct.withdraw(5);
		Acct.withdraw(4);
		Acct.withdraw(2);

		System.out.println("Account holder: "+Acct.getCustomerName());
		System.out.println("Annual Interest Rate: "+Acct.getAnnualInterestRate());
		System.out.println("Balance: "+Acct.getBalance());
		System.out.println("Transaction History: ");
		for(int i=0;i<Acct.getTransaction().size();i++){
			System.out.println(Acct.getTransaction().get(i).getDescription());
		}
	}

}
