/**
 * 
 */
package com.masterjavaonline.spring.pojos;

import com.masterjavaonline.spring.interfaces.HelloWorld;

/**
 * @author  Master Java Online
 *
 */
public class HelloBean implements HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.masterjavaonline.spring.interfaces.HelloWorld#sayHello()
	 */
	public void sayHello() {

		System.out.println("Hello:" + message);

	}

}
