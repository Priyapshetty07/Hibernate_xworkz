package com.xworkz.car.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.car.entity.CarEntity;

public class CarDAOImpl implements CarDAO {

	@Override
	public void createCarEntity() {
		System.out.println("INVOKED CREATE CAR ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(CarEntity.class);

			configuration.configure("CarHibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			session.beginTransaction();

			CarEntity carEntity = new CarEntity(1001, "Creta", 500000.00, "White", 5, true, "Diesel");
			CarEntity carEntity1 = new CarEntity(1002, "BMW", 9500000.00, "Black", 5, true, "Petrol");
			CarEntity carEntity2 = new CarEntity(1003, "Audi", 1500000.00, "Red", 7, true, "Diesel");
			CarEntity carEntity3 = new CarEntity(1004, "Ford", 250000.00, "White", 8, true, "Petrol");
			CarEntity carEntity4 = new CarEntity(1005, "Kia", 350000.00, "Blue", 5, false, "Diesel");
			CarEntity carEntity5 = new CarEntity(1006, "Jeep", 550000.00, "Silver", 4, true, "Petrol");
			CarEntity carEntity6 = new CarEntity(1007, "Jaguar", 350000.00, "Black", 6, false, "Diesel");
			CarEntity carEntity7 = new CarEntity(1008, "Ferrari", 350000.00, "Blue", 9, true, "Petrol");
			CarEntity carEntity8 = new CarEntity(1009, "Fortuner", 450000.00, "Red", 5, false, "Diesel");

			session.save(carEntity);
			session.save(carEntity1);
			session.save(carEntity2);
			session.save(carEntity3);
			session.save(carEntity4);
			session.save(carEntity5);
			session.save(carEntity6);
			session.save(carEntity7);
			session.save(carEntity8);

			session.getTransaction().commit();
			System.out.println("row inserted");

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			// transaction.rollback();
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
	public void readCarEntity() {
		System.out.println("INVOKED READ CAR ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(CarEntity.class);

			configuration.configure("CarHibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			session.beginTransaction();

			CarEntity carEntity = session.get(CarEntity.class, 1001);

			session.getTransaction().commit();

			System.out.println("read is done:" + carEntity);

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			// transaction.rollback();
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
	public void updateCarEntity() {
		System.out.println("INVOKED UPDATE CAR ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(CarEntity.class);

			configuration.configure("CarHibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			CarEntity carEntity = session.get(CarEntity.class, 1001);

			System.out.println("CarEntity" + carEntity);

			carEntity.setColor("Red");
			carEntity.setNoOfSeat(7);
			carEntity.setCarBrand("Maserati");

			transaction = session.beginTransaction();

			session.update(carEntity);

			transaction.commit();

			System.out.println("Updated");

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			// transaction.rollback();
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
	public void deleteCarEntity() {

		System.out.println("INVOKED DELETE CAR ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(CarEntity.class);

			configuration.configure("CarHibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			CarEntity carEntity = session.get(CarEntity.class, 1008);

			System.out.println("CarEntity" + carEntity);

			transaction = session.beginTransaction();

			session.delete(carEntity);

			transaction.commit();

			System.out.println("DELETED");

		} catch (Exception e) {
			System.out.println("inside catch block !!!");
			// transaction.rollback();
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
