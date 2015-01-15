package com.stpass.dragon.hospital.exception;

public class DatabaseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DatabaseException(String message) {
		super(message);
	}
	
	public DatabaseException(String message,Throwable t) {
		super(message,t);
		t.setStackTrace(t.getStackTrace());
	}
	
	public DatabaseException(Throwable t) {
		super(t);
		t.setStackTrace(t.getStackTrace());
	}

}
