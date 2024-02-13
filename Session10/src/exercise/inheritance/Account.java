package exercise.inheritance;

public class Account {
	
	protected String accountNumber;
	
	protected double balance;
	
	public Account(String account_no, double baln) {
		
		this.accountNumber= account_no;
		
		this.balance = baln;
	}
	
	public String deposit(double amount) {
		
		this.balance  += amount;
		
		return "deposit successful.";
		
	}
	
	public void withdraw(double amount) {
		
		this.balance -= amount;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
