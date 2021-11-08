package com.xworkz.mobiles.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobiles.entity.MobileEntity;
import com.xworkz.singlesessionfactory.SessionFactoryProvider;

import org.hibernate.Session;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void saveMobileEntity() {
		System.out.println("INVOKED SAVE MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
//			sessionFactory = new Configuration().configure("MobileHibernate.cfg.xml")
//					.addAnnotatedClass(MobileEntity.class).buildSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			MobileEntity mobileEntity1 = new MobileEntity(1, "Vivo", 20000.00, "16GB", "Blue", 10, false, "Android");
			MobileEntity mobileEntity2 = new MobileEntity(2, "Iphone", 98000.00, "512GB", "Silver", 15, true, "IOS");
			MobileEntity mobileEntity3 = new MobileEntity(3, "Oneplus", 45000.00, "16GB", "Black", 10, false,"Android");
			MobileEntity mobileEntity4 = new MobileEntity(4, "Samsung", 35000.00, "8GB", "White", 10, true, "Android");
			MobileEntity mobileEntity5 = new MobileEntity(5, "OPPO", 55000.00, "6GB", "Red", 10, false, "Android");
			session.save(mobileEntity1);
			session.save(mobileEntity2);
			session.save(mobileEntity3);
			session.save(mobileEntity4);
			session.save(mobileEntity5);

			transaction.commit();

			SessionFactoryProvider.closeSessionFactory();

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			transaction.rollback();
		} finally {
			if (session != null) {

				session.close();
				System.out.println(" session is closed");

			} else {

				System.out.println("session is not closed");

			}
//			if (sessionFactory != null) {
//
//				sessionFactory.close();
//				System.out.println(" sessionFactory is closed");
//			} else {
//
//				System.out.println("sessionFactory is not closed");
//
//			}

		}
	}

	@Override
	public void getMobileEntity() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMobileEntity() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMobileEntity() {
		// TODO Auto-generated method stub

	}

}
