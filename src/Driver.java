import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Accountholder Name");
		String AccountHolderName = sc.nextLine();

		System.out.println("Enter Account Number");
		int AccountNumber = sc.nextInt();

		System.out.println("Enter Balance");
		double balance = sc.nextDouble();

		Bank_Account ba = new Bank_Account(AccountHolderName, AccountNumber, balance);
		ba.displayDetails();

		int choice;
		do {
			System.out.println("----select the Menu");
			System.out.println("1. Deposit");
			System.out.println("2.Withdraw the money");
			System.out.println("3.Check Balance");
			System.out.println("4.Show Account Detail");
			System.out.println("5.Exit");
			System.out.println("Choose An Option");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to deposit");
				double deposit = sc.nextDouble();
				ba.deposit(deposit);
				break;
				case 2: 
				System.out.println("Enter amount to withdraw");
				double amount = sc.nextDouble();
				ba.withdrawBalance(amount);
				break;

				case 3: 
				System.out.println("check balance");
				ba.checkBalance();
				break;

			case 4:
				System.out.println("To know Account Detail");
				ba.displayDetails();
				break;

			case 5:
				System.out.println("Thankyou for using our bank");
				break;

			default:
				System.out.println("Invalid option");

			}
		} while (choice != 5);
		{
			sc.close();
		}
	}

}
