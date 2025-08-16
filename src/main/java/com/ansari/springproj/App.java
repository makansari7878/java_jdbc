package com.ansari.springproj;

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
    	
    	ApplicationContext appcontext = new ClassPathXmlApplicationContext();
    	
    	
    	IVechile vech = (IVechile) appcontext.getBean("carVechile");
    	
    	


    }
}
