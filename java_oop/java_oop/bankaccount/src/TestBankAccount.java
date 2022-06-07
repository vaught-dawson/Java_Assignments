
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount.displayTotalAmount();
		
		BankAccount account1 = new BankAccount();
		
		account1.deposit(1000, false);
		
		System.out.println(account1.getCheckingBalance());
		System.out.println(account1.getSavingsBalance());
		
		account1.withdraw(.01, false);
		
		System.out.println(account1.getCheckingBalance());
		System.out.println(account1.getSavingsBalance());
		
		account1.withdraw(.01, true);
		account1.withdraw(1000, false);
		
		BankAccount account2 = new BankAccount();
		BankAccount account3 = new BankAccount();
		
		account2.deposit(999999, true);
		
		System.out.println(account2.getCheckingBalance());
		System.out.println(account2.getSavingsBalance());
		
		BankAccount.displayTotalAmount();
		
		System.out.println(BankAccount.getNumberOfAccounts());
		
		System.out.println(account1.getAccountNumber());
		System.out.println(account2.getAccountNumber());
		System.out.println(account3.getAccountNumber());
	}

}
