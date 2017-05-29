package com.test.spring.SpringCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		Employee employee = (Employee) context.getBean("emp");
		employee.show();

	}
}
