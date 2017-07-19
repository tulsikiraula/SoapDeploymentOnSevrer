package com.kiraula;

import javax.jws.WebService;


@WebService
public class HelloWorldImpl{

	public String printMessage(String name) throws CustomException {
		if (name == null)
			throw new CustomException("Name cannot be blank");
		else
			return "Hello " + name;

	}

}
