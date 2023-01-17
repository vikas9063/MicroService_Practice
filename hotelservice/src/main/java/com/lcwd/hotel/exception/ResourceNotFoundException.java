package com.lcwd.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("Resource not found !!");
	}

	public ResourceNotFoundException(String s) {
		super(s);
	}
}
