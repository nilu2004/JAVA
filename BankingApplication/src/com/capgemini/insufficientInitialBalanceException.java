package com.capgemini;

public class insufficientInitialBalanceException extends Exception {
	private static final long serialVersionUID = -7604625769808533356L;

	@Override
	public String getMessage() {
		return "Insufficient initial deposit amount";
	}
}
