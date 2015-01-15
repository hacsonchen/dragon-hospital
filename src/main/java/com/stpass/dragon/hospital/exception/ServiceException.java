package com.stpass.dragon.hospital.exception;

/**
 * Service Exception
 * @author chenqs@stpass.com
 * @version v0.1 2015/01/05
 */
public class ServiceException extends RuntimeException {

private static final long serialVersionUID = 1L;
	
	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(String message,Throwable t) {
		super(message,t);
		this.setStackTrace(t.getStackTrace());
	}
	
	public ServiceException(Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}
}
