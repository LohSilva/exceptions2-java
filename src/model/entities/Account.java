package model.entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
		
	public Account() {
	}
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit(Double amount) {
        balance += amount;
    }
	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new IllegalArgumentException("The amount exceeds the withdraw limit");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Not enough balance");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Number: "
				+ number 
				+ "Holder: " 
				+ holder +
				"Initial balance: "
				+ String.format("%.2f", balance) 
				+ "Withdraw limit: "
				+ withdrawLimit;
	}
	

}
