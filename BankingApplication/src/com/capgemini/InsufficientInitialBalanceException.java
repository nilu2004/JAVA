package com.capgemini;

public class InsufficientInitialBalanceException extends Exception {
	private static final long serialVersionUID = -7604625769808533356L;

	public InsufficientInitialBalanceException(String message) {
		super(message);
	}
}
