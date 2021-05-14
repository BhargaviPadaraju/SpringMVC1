package com.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CustMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("customer.xml");
		Customer e = (Customer)ac.getBean("customer");
		System.out.println(e.toString());
		e.destroy();

	}

}
