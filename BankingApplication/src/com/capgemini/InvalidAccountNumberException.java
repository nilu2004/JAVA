package com.capgemini;

public class InvalidAccountNumberException extends Exception {
	private static final long serialVersionUID = -2249638720728755917L;
	@Override
	public String getMessage() {
		return "Invalid account number";
	}
}
