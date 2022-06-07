import java.util.Random;

public class BankAccount {
	
	private double checkingBalance;
	private double savingsBalance;
	private String accountNumber;
	private static int numOfAccounts = 0;
	private static double totalMoneyInAccounts = 0;
	
	public BankAccount() {
		this.accountNumber = BankAccount.generateAccountNumber();
		incrementAccountCount();
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public void deposit(double amount, boolean isSavings) {
		if (isSavings) {
			this.savingsBalance += amount;
		} 
		else {
			this.checkingBalance += amount;
		}
		
		BankAccount.addMoneyToTotal(amount);
	}
	
	public boolean withdraw(double amount, boolean isSavings) {
		if ((isSavings && this.savingsBalance < amount) || (!isSavings && this.checkingBalance < amount)) {
			System.out.printf("\nInsufficient Funds: You tried to withdraw $%.2f from your %s, but you only have $%.2f in your %s.\n", amount, isSavings ? "Savings Account" : "Checking Account", isSavings ? this.savingsBalance : this.checkingBalance, isSavings ? "Savings Account" : "Checking Account");
			return false;
		}
		
		this.deposit(amount * -1.0, isSavings);
		return true;
	}
	
	public static void displayTotalAmount() {
		System.out.printf("There is currently $%.2f being held at this location.\n", totalMoneyInAccounts);
	}
	
	private static String generateAccountNumber() {
		Random rand = new Random();
		String newAccountNumber = Integer.toString(rand.nextInt(10));
		
		for (int i = 1; i < 10; i++) {
			newAccountNumber += Integer.toString(rand.nextInt(10));
		}
		
		return newAccountNumber;
	}
	
	private static void addMoneyToTotal(double amount) {
		totalMoneyInAccounts += amount;
	}
	
	private static void incrementAccountCount() {
		numOfAccounts += 1;
	}
	
	public static int getNumberOfAccounts() {
		return numOfAccounts;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
}
