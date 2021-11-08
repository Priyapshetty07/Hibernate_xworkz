package com.xworkz.singlesessionfactory;

import java.sql.Connection;
import java.util.Objects;

import java.util.Collections;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	
	private static SessionFactory sessionFactory = null;
	
	static {
		sessionFactory = new Configuration().configure("MobileHibernate.cfg.xml").buildSessionFactory();
	}

	public static SessionFactory getSessionFactory()
	{
		System.out.println("invoked get SessionFactory()");
		if(Objects.nonNull(sessionFactory))
		{
			return sessionFactory;
		}else
		{
			System.out.println("SessionFactory is not created");
			return sessionFactory;
		}
		
	}
	
	public static void closeSessionFactory()
	{
		System.out.println("invoked close  SessionFactory");
		try {
			if(sessionFactory !=null) {
				sessionFactory.close();
				System.out.println("SessionFactory is closed");
			}else {
				System.out.println("SessionFactory is not closed");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/*public static void main(String[] args) {
		SessionFactory sessionFactory = getSessionFactory();
		System.out.println(sessionFactory.hashCode());
		SessionFactory sessionFactory1 = getSessionFactory();
		System.out.println(sessionFactory1.hashCode());
		SessionFactory sessionFactory2 = getSessionFactory();
		System.out.println(sessionFactory2.hashCode());
	}*/
}
