package com.sony.spring_hibernate;

import org.hibernate.Session;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sony.spring_hibernate.entity.Details;


public class Tester {
	public static void main(String[] args) {
		
	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
	  
	SessionFactory factory= (SessionFactory)container.getBean("factory");
	
	 Session session= factory.openSession();
	 Details details= session.get(Details.class, 2);
	 System.out.println(details);
	 
	// LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean ();
	// factoryBean.setAnnotatedClasses(null);
	
	
	
	}

}
