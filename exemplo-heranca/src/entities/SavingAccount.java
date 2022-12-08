package entities;

public class SavingAccount  extends Account {
	private double interestRate;
	
	public SavingAccount() {
		
	}

	public SavingAccount(Integer numer, String holder, double balance, double interestRate) {
		super(numer, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
}

