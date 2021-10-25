package com.xworkz.mobile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String... values) {

		Configuration configuration = new Configuration();

		configuration.addAnnotatedClass(MobileEntity.class);

		configuration.configure("MobileHibernate.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		session.beginTransaction();

		MobileEntity mobileEntity = new MobileEntity(1, "iphone", 96000.00, "256GB", "Black", 12, true, "IOS");

		session.save(mobileEntity);
		
		session.getTransaction().commit();

		session.close();

		sessionFactory.close();

	}
}
