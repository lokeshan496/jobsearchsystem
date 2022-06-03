package com.jobsearchsystem.exception;

public class JobSeekerAlreadyExistsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2449744258953834954L;

	public JobSeekerAlreadyExistsException(String message) {
		super(message);
	}
}
