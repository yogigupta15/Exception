package com.example4;

public class InsufficientBalanceException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public InsufficientBalanceException(String msg) {
		
		this.message = msg;
	}
	
	public String getMessage() {
		
		return this.message;
	}
}
