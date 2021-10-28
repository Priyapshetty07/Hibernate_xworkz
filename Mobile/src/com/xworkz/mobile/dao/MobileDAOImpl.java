package com.xworkz.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile.entity.MobileEntity;

public class MobileDAOImpl implements MobileDAO{

	@Override
	public void saveMobileEntity() {
		
		System.out.println("INVOKED SAVE MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		
		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(MobileEntity.class);

			configuration.configure("MobileHibernate.xml");

			 sessionFactory = configuration.buildSessionFactory();

			 session = sessionFactory.openSession();
			 
			 session.beginTransaction();

			MobileEntity mobileEntity = new MobileEntity(2, "Vivo", 35000.00, "16GB", "Blue", 10, false, "Android");

			session.save(mobileEntity);
				
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("inside catch block !!!");
		}finally {
			if (session != null) {

				session.close();
				System.out.println(" session is closed");

			} else {

				System.out.println("session is not closed");

			}
			if (sessionFactory != null) {

				sessionFactory.close();
				System.out.println(" sessionFactory is closed");
			} else {

				System.out.println("sessionFactory is not closed");

			}
			
		}
	}

	@Override
	public void getMobileEntity() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(MobileEntity.class);

			configuration.configure("MobileHibernate.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 1);

			System.out.println("read is done" + mobileEntity);
		
		}catch (Exception e) 
		  {

				System.out.println("inside catch block!!!");

			} finally {

				if (session != null) {
					System.out.println("session closed");
				} else {
					System.out.println("session is not closed");
				}
				if (sessionFactory != null) {
					System.out.println("sessionFactory is closed");
				} else {
					System.out.println("sessionFactory is not closed");
				}
			}
		}
}
		

