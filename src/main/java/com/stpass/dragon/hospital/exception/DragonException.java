package com.stpass.dragon.hospital.exception;

/**
 * Custom Application Exception
 * @author chenqs@stpass.com
 * @version DragonException.java, v0.1 2015/01/01
 */
public class DragonException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DragonException(String message) {
		super(message);
	}
	
	public DragonException(String message,Throwable t) {
		super(message,t);
		this.setStackTrace(t.getStackTrace());
	}
	
	public DragonException(Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}

}
