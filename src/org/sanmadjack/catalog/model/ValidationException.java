package org.sanmadjack.catalog.model;

public class ValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8240351395908908543L;

	public ValidationException() {
		// TODO Auto-generated constructor stub
	}

	public ValidationException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	public ValidationException(Throwable throwable) {
		super(throwable);
		// TODO Auto-generated constructor stub
	}

	public ValidationException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
		// TODO Auto-generated constructor stub
	}

}
