
public class Bank_Account {
	private String AccountHolderName;
	private int AccountNumber;
	private double balance;

	public Bank_Account(String AccountHolderName, int AccountNumber, double balance) {
		this.AccountHolderName = AccountHolderName;
		this.AccountNumber = AccountNumber;
		this.balance = balance;

	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("amount deposited is:" + amount);
		} else {
			System.out.println("invalid deposit amount");
		}
	}

	public void withdrawBalance(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount; 
			System.out.println("amount withdraw is:" + amount + "And your current balance is:" + balance);
		}
	}

	public void checkBalance() {
		System.out.println("your current balance is:" + balance);
	}

	public void displayDetails() {
		System.out.println("AccountHolderName:" + AccountHolderName);
		System.out.println("AccountNumber:" + AccountNumber);
		System.out.println("Account balance is:" + balance);

	}
}
