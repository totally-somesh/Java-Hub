package com.app.Acctype;

import java.time.LocalDate;
import java.time.Period;

import com.app.BankingException.BankingException;

public class BankAccount {

	private int accNo;
	private String customerName;
	private AccountType type;
	private double balance;
	private LocalDate createdOn;
	private LocalDate lastUpdated;
	private boolean isActive;

	// constructor
	public BankAccount(int accNo, String customerName, AccountType type, double balance, LocalDate createdOn) {
		super();
		this.accNo = accNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.createdOn = createdOn;
		this.lastUpdated = this.createdOn;
		this.isActive = true;
	}

	// getter ,setters
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	// toString
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + ", createdOn=" + createdOn + ", lastUpdated=" + lastUpdated + ", isActive=" + isActive
				+ "]";
	}

	// withdraw amount
	public void withdraw(double amount) throws BankingException {
		if (isActive) {
			balance += amount;
			lastUpdated = LocalDate.now();
		} else {
			throw new BankingException(" inactive account");
		}

	}

	// deposite amount
	public void deposite(double amount) throws BankingException {
		if (isActive) {
			balance += amount;
			this.lastUpdated = LocalDate.now();
		} else {
			throw new BankingException("inactive account!! , cannot deposite");
		}
	}

	public void transferFunds(BankAccount desc, double amount) throws BankingException {

		if (desc.isActive == true && this.isActive == true) {
			this.withdraw(amount);
			desc.deposite(amount);
		} else
			throw new BankingException("desc a/c is inactive");
	}
public static double simpleInterest(BankAccount account)
{ 
	  double simpleInterest=0;
	  int rate=4;
      System.out.println(account.getBalance());
      int years=Period.between(account.getCreatedOn(),LocalDate.now()).getYears();
      return simpleInterest=(account.getBalance()*rate*years);
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
