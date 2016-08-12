package com.capgemini;

public class Client {

	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank();
		try {
			System.out.println(bank.createAccount(101, 3000));
			
		} catch (insufficientInitialBalanceException e) {
			e.getMessage();
		}
		try {
			System.out.println(bank.createAccount(102, 3000));
			
		} catch (insufficientInitialBalanceException e) {
			e.getMessage();
		}
		
		try
		{
			System.out.println("Balance = "+bank.withdrawAmount(101, 2000));
			System.out.println("Balance = "+bank.depositAmount(101, 4000));
			System.out.println(bank.fundTransfer(101, 102, 200));
		}catch(InvalidAccountNumberException i)
		{
			System.out.println("Invalid account number ");
		}
		catch(InsufficientBalanceException ibe){
			System.out.println("insufficient balance");
		}

	}

}
