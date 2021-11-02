package com.xworkz.phone.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.phone.entity.PhoneEntity;

public class PhoneDAOImpl implements PhoneDAO {

	@Override
	public void persistPhoneEntity() {
		System.out.println("INVOKED CREATE(persist) PHONE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = new Configuration().configure("PhoneHibernate.cfg.xml")
					.addAnnotatedClass(PhoneEntity.class).buildSessionFactory();

			// configuration.addAnnotatedClass(PhoneEntity.class);

			// configuration.configure("PhoneHibernate.cfg.xml");

			// sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			// PhoneEntity phoneEntity = new PhoneEntity();

			// session.persist(phoneEntity);

			transaction.commit();

			System.out.println("row inserted");

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			transaction.rollback();
			System.out.println("transaction rolled back");
		} finally {
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
	public void loadPhoneEntity() {
		System.out.println("INVOKED READ(load) PHONE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = new Configuration().configure("PhoneHibernate.cfg.xml")
					.addAnnotatedClass(PhoneEntity.class).buildSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			// PhoneEntity phoneEntity = session.load(PhoneEntity.class, 5);

			transaction.commit();

			// System.out.println("read is done:" + phoneEntity);

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			transaction.rollback();
			System.out.println("transaction rolled back");
		} finally {
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
	public void mergePhoneEntity() {
		System.out.println("INVOKED UPDATE(merge) PHONE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = new Configuration().configure("PhoneHibernate.cfg.xml")
					.addAnnotatedClass(PhoneEntity.class).buildSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			// PhoneEntity phoneEntity = session.merge(PhoneEntity.class, 6);

			// System.out.println("PhoneEntity" + phoneEntity);

			// phoneEntity.setColor("Red");
			// phoneEntity.setNoOfSeat(7);
			// phoneEntity.setCarBrand("Maserati");

			transaction = session.beginTransaction();

			// session.update(phoneEntity);

			transaction.commit();

			System.out.println("Updated");

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			transaction.rollback();
			System.out.println("transaction rolled back");
		} finally {
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
	public void removePhoneEntity() {
		System.out.println("INVOKED DELETE(remove) PHONE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = new Configuration().configure("PhoneHibernate.cfg.xml")
					.addAnnotatedClass(PhoneEntity.class).buildSessionFactory();

			session = sessionFactory.openSession();

			// PhoneEntity phoneEntity = session.get(PhoneEntity.class, 1008);
			//
			// System.out.println("PhoneEntity" + phoneEntity);

			transaction = session.beginTransaction();

			// session.remove(phoneEntity);

			transaction.commit();

			System.out.println("DELETED");

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			transaction.rollback();
			System.out.println("transaction rolled back");
		} finally {
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
}
