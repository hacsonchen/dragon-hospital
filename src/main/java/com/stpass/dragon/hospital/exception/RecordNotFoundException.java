package com.stpass.dragon.hospital.exception;

public class RecordNotFoundException extends RuntimeException {

private static final long serialVersionUID = 1L;
	
	public RecordNotFoundException(String message) {
		super(message);
	}
	
	public RecordNotFoundException(String message,Throwable t) {
		super(message,t);
		this.setStackTrace(t.getStackTrace());
	}
	
	public RecordNotFoundException(Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}
}
