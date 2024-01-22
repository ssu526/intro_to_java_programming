package Chapter11.Q113;

public class Main{
	public static void main(String[] args){
		CheckingAccount checkingAcct = new CheckingAccount();
		checkingAcct.deposit(1000);
		System.out.println(checkingAcct.toString());
		checkingAcct.withdraw(3000);
	}
}