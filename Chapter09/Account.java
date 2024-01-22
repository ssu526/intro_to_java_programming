
package Chapter9;

public class Account{

	private int id=0;
	private double balance=0;
	private final static double annualInterestRate=0.045;
	private java.util.Date dateCreated;
  	

	public Account(int id,double balance){
		this.id=id;
		this.balance=balance;

	}

	public Account(){
		this(0,0);
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

	public String toString(){
		return "Balance: "+getBalance();
	}

}