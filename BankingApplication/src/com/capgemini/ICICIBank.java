package com.capgemini;
import java.util.LinkedList;

public class ICICIBank {
	
	public static final int INITIAL_BALANCE_AMOUNT=500;
	LinkedList<Account> accounts=new LinkedList<>();
	
	
	public String createAccount(int accountNumber, int amount) throws insufficientInitialBalanceException{
		Account account = new Account(accountNumber, amount);
		if (amount < 500) {
			throw new insufficientInitialBalanceException();
		}
		accounts.add(account);
		return "account created successfully";
	}
	
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
		
	}
	
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);
		
		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		
		throw new InsufficientBalanceException();
	}
	
	public int depositAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
		Account account = searchAccount(accountNumber);
		account.setAmount(account.getAmount() + amount);
		return account.getAmount();
	}

	public String fundTransfer(int payeeAccNumber, int beneficiaryAccNumber, int amount)
	throws InvalidAccountNumberException, InsufficientBalanceException
	{
		
		Account payeeAccount = searchAccount(payeeAccNumber);
		Account beneficiaryAccount = searchAccount(beneficiaryAccNumber);
		
		if((payeeAccount.getAmount()-amount)>=0)
		{
			payeeAccount.setAmount(payeeAccount.getAmount()-amount);
			beneficiaryAccount.setAmount(beneficiaryAccount.getAmount()+amount);
			return "Payee account balnace :: "+payeeAccount.getAmount()+"\n Beneficiary account balance :: "+beneficiaryAccount.getAmount();
		}
		throw new InsufficientBalanceException();
		
	}
}
