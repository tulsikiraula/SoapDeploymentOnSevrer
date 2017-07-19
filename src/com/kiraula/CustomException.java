package com.kiraula;

public class CustomException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

	CustomException(String s){
		super(s);
	}
	CustomException(Throwable t){
		super(t);
	}
	CustomException(String s,Throwable t){
		super(s,t);
	}
}
