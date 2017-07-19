package com.kiraula;

import javax.jws.WebService;

@WebService(name="helloWorldWS" , serviceName="HelloWorld")
public interface HelloWorld {

	public String printMessage(String name);

}
