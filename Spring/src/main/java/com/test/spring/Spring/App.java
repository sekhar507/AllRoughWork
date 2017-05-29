package com.test.spring.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Helloworld helloworld= (Helloworld) context.getBean("helloBean");
        helloworld.printName();
        
    }
}
