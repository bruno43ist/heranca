package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);
		
		acc1.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		
		SavingAccount sacc1 = new SavingAccount(1002, "Bruno", 1000.0, 0.01);
		
		sacc1.withdraw(200.0);
		
		System.out.println(sacc1.getBalance());
		
		sacc1.updateBalance();
		
		System.out.println(sacc1.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
