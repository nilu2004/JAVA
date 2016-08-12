package com.capgemini;

public class InsufficientBalanceException extends Exception {
	private static final long serialVersionUID = 7230491325251880756L;

	@Override
	public String getMessage() {
		return "Insuffucient balance";
	}

}
