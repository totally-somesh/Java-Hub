package com.app.rules;

import java.time.LocalDate;
import java.util.Map;

import com.app.Acctype.AccountType;
import com.app.Acctype.BankAccount;
import com.app.BankingException.BankingException;

public class ValidationRules {

	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	public static BankAccount validateAllInputs(int accNo, String customerName, String type, double balance,
			String createdOn, Map<Integer, BankAccount> acctMap) throws BankingException {
		AccountType actype = validateAccountType(type);
		validateBalance(balance);
		LocalDate creationDate = parseAndValidateDate(createdOn);
		return new BankAccount(accNo, customerName, actype, balance,creationDate);
	}

	public static AccountType validateAccountType(String Type) {
		return AccountType.valueOf(Type.toUpperCase());
	}

	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Min balance reached");
	}

	public static LocalDate parseAndValidateDate(String Date) {
		return LocalDate.parse(Date);// yyyy-mm-dd
	}

}
