package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Mariia", 0.0, 500.00);
		
		Account acc1 = bacc;
		acc1.getBalance();
		
	}

}
