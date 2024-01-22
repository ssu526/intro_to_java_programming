//Chapter 9 - Question 7


/*

Account
----------
-id:int
-balance:double
-annualInterestRate:double
-dateCreated: Date
-----------
+Account()
+Account(id,balance)
+getID():int
+getBalance():double
+getAnnualInterestRate:double
+getDateCreated():Date
+getMonthlyInterestRate():double
+getMonthlyInterest():double
+withdraw():void
+deposit():void

*/




class Account{

	private int id=0;
	private double balance=0;
	private final static double annualInterestRate=0.045;
	private java.util.Date dateCreated;
  	

	public Account(int id,double balance){
      	this();
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

}


public class TestAccount{

	public static void main(String[] args){

		Account acct1 = new Account(1122,20000);
		acct1.withdraw(2500);
		acct1.deposit(3000);
		System.out.println("balance: "+acct1.getBalance());
		System.out.println("Monthly interest: "+acct1.getMonthlyInterest());
		System.out.println("Date created: "+acct1.getDateCreated());
      
	}
}