package com.niit.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/* using BeanFactory*/
    	//Resource resource=new ClassPathResource("beans.xml");
       //BeanFactory factory=new XmlBeanFactory(resource);
    	//Car car=(Car)factory.getBean("carObj");
    	//car.disp();
    	
    	/*using ApplicationContext*/
    	//helps you to implement loose coupling
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Car car=(Car)context.getBean("carObj");
       Car car2=(Car)context.getBean("carObj");
       //Will give true because default scope is singleton
       if (car==car2) {
		System.out.println("True");
	}
       car2.disp();
    }
}
