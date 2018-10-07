/**
 * 
 */
package com.masterjavaonline.spring.impl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masterjavaonline.spring.interfaces.HelloWorld;

/**
 * @author Master Java Online
 *
 */
public class HelloFirstTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("spring-beans.xml");
		HelloWorld helloBean = (HelloWorld) factory.getBean("HelloBean");
		helloBean.sayHello();
	}

}
