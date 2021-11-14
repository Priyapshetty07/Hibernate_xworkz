package com.xworkz.mobiles.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import com.xworkz.mobiles.entity.MobileEntity;
import com.xworkz.singlesessionfactory.SessionFactoryProvider;

import org.hibernate.Session;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void saveMobileEntity(MobileEntity mobileEntity) {
		System.out.println("INVOKED SAVE MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			session.save(mobileEntity);

			transaction.commit();

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

		}
	}

	@Override
	public void getMobileEntity() {
		System.out.println("INVOKED GET MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 1);

			org.hibernate.query.Query query = session.createQuery("hql");
			Object uniqueResult = query.uniqueResult();

			System.out.println("read is done" + mobileEntity);

		} catch (Exception e) {

			System.out.println("inside catch block!!!");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}
		}

	}

	@Override
	public void updateMobileEntity() {
		System.out.println("INVOKED UPDATE MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 5);

			System.out.println("MobileEntity" + mobileEntity);

			mobileEntity.setMobileBrand("Nokia");
			mobileEntity.setOsType("Android");
			mobileEntity.setColor("GREY");

			transaction = session.beginTransaction();

			session.update(mobileEntity);

			transaction.commit();

			System.out.println("Update");

		} catch (Exception e) {

			System.out.println("inside catch block!!!");
			transaction.rollback();

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void deleteMobileEntity() {
		System.out.println("INVOKED DELETE MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 9);

			System.out.println("MobileEntity" + mobileEntity);

			transaction = session.beginTransaction();

			session.delete(mobileEntity);

			transaction.commit();

			System.out.println("delete");

			SessionFactoryProvider.closeSessionFactory();

		} catch (Exception e) {

			System.out.println("inside catch block!!!");
			transaction.rollback();

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void getAllMobileEntity() {
		System.out.println("INVOKED GET ALL MOBILE ENTITY");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "from com.xworkz.mobiles.entity.MobileEntity";

			org.hibernate.query.Query query = session.createQuery(hqlquery);

			List listOfMobileEntity = query.list();

			System.out.println(listOfMobileEntity);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void getMobileBrandByID(int mobileID) {
		System.out.println("INVOKED GET MOBILE BRAND BY ID");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.getMobileBrandByID");

			// String hqlquery = "select mobileBrand from MobileEntity where
			// mobileID=:MobileID";
			// org.hibernate.query.Query query = session.createQuery(hqlquery);
			query.setParameter("MobileID", mobileID);
			Object object = query.uniqueResult();
			System.out.println("mobileBrand without type casting:" + object);
			String mobileBrand = (String) object;
			System.out.println("mobileBrand withtype casting:" + mobileBrand);
			System.out.println(mobileBrand);
		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void getMobileEntityByID(int mobileID) {
		System.out.println("INVOKED GET MOBILE ENTITY BY ID");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.getMobileEntityByID");
			// String hqlquery = "from MobileEntity where mobileID=:MobileID";
			// org.hibernate.query.Query query = session.createQuery(hqlquery);
			query.setParameter("MobileID", mobileID);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void updateMobilePriceByID(int mobileID, double mobilePrice) {
		System.out.println("INVOKED UPDATE MOBILE PRICE BY ID");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			session.beginTransaction();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.updateMobilePriceByID");

//			 String hqlquery = "update MobileEntity set mobilePrice=:MobilePrice where mobileID=:MobileID";
//            org.hibernate.query.Query query = session.createQuery(hqlquery);
			query.setParameter("MobileID", mobileID);
			query.setParameter("MobilePrice", mobilePrice);

			int noOfRowsAffected = query.executeUpdate();

			session.getTransaction().commit();

			System.out.println("noOfRowsAffected :" + noOfRowsAffected);

		} catch (HibernateException e) {
			System.out.println("inside catch block");
			session.getTransaction().rollback();
			System.out.println("Transaction has been rolled back");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void deleteMobileEntityByID(int mobileID) {
		System.out.println("INVOKED DELETE MOBILE ENTITY BY ID");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.deleteMobileEntityByID");

//			String hqlquery = "delete from MobileEntity where mobileID=:MobileID";
//            org.hibernate.query.Query query = session.createQuery(hqlquery);

			query.setParameter("MobileID", mobileID);

			int delete = query.executeUpdate();

			session.getTransaction().commit();

			System.out.println("delete:" + delete);

		} catch (HibernateException e) {
			System.out.println("inside catch block");
			session.getTransaction().rollback();
			System.out.println("Transaction has been rolled back");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void minMobileEntityByMobilePrice() {
		System.out.println("INVOKED MIN MobileEntity By MobilePrice");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "select min(mobilePrice) from MobileEntity";

			org.hibernate.query.Query query = session.createQuery(hqlquery);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void maxMobileEntityByMobilePrice() {
		System.out.println("INVOKED MAX MobileEntity By MobilePrice");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "select max(mobilePrice) from MobileEntity";

			org.hibernate.query.Query query = session.createQuery(hqlquery);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void avgMobileEntityByMobilePrice() {
		System.out.println("INVOKED AVG MobileEntity By MobilePrice");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "select avg(mobilePrice) from MobileEntity";

			org.hibernate.query.Query query = session.createQuery(hqlquery);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void sumMobileEntityByMobilePrice() {
		System.out.println("INVOKED SUM MobileEntity By MobilePrice");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "select sum(mobilePrice) from MobileEntity";

			org.hibernate.query.Query query = session.createQuery(hqlquery);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void countMobileEntityBYCameraSize() {
		System.out.println("INVOKED COUNT MobileEntity BY CameraSize");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "select count(*)from MobileEntity where cameraSize =10";

			org.hibernate.query.Query query = session.createQuery(hqlquery);

			List listOfMobileEntity = query.list();

			System.out.println(listOfMobileEntity);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void updateMobilePriceByMobileBrand(String mobileBrand, double mobilePrice) {
		System.out.println("INVOKED UPDATE MOBILE PRICE BY MobileBrand");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.updateMobilePriceByMobileBrand");

//			String hqlquery = "update MobileEntity set mobilePrice=:MobilePrice where mobileBrand=:MobileBrand";
//          org.hibernate.query.Query query = session.createQuery(hqlquery);

			int noOfRowsAffected = query.executeUpdate();
			query.setParameter("MobilePrice", mobilePrice);
			query.setParameter("MobileBrand", mobileBrand);

			session.getTransaction().commit();
			System.out.println("noOfRowsAffected :" + noOfRowsAffected);

			// SessionFactoryProvider.closeSessionFactory();
		} catch (HibernateException e) {
			System.out.println("inside catch block");
			session.getTransaction().rollback();
			System.out.println("Transaction has been rolled back");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void getMobileEntityByMobileBrand(String mobileBrand) {
		System.out.println("INVOKED GET MOBILE ENTITY BY Mobile Brand");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.getMobileEntityByMobileBrand");

//          String hqlquery = "from MobileEntity where mobileBrand=:MobileBrand";
//          org.hibernate.query.Query query = session.createQuery(hqlquery);

			query.setParameter("MobileBrand", mobileBrand);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

			// SessionFactoryProvider.closeSessionFactory();

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}
	}

	@Override
	public void deleteMobileEntityByMobileBrand(String mobileBrand) {
		System.out.println("INVOKED DELETE MOBILE ENTITY BY MobileBrand");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			org.hibernate.query.Query query = session.getNamedQuery("MobileEntity.deleteMobileEntityByMobileBrand");
//			String hqlquery = "delete from MobileEntity where mobileBrand=:MobileBrand";
//            org.hibernate.query.Query query = session.createQuery(hqlquery);

			query.setParameter("MobileBrand", mobileBrand);
			int delete = query.executeUpdate();
			session.getTransaction().commit();

			System.out.println("delete:" + delete);
			// SessionFactoryProvider.closeSessionFactory();
		} catch (HibernateException e) {
			System.out.println("inside catch block");
			session.getTransaction().rollback();
			System.out.println("Transaction has been rolled back");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void updateMobileBrandByMobilePrice(double mobilePrice, String mobileBrand) {
		System.out.println("INVOKED UPDATE MOBILE BRAND BY MOBILE PRICE");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			session.beginTransaction();

			String hqlquery = "update MobileEntity set mobileBrand=:MobileBrand where mobilePrice=:MobilePrice";

			org.hibernate.query.Query query = session.createQuery(hqlquery);
			query.setParameter("MobilePrice", mobilePrice);
			query.setParameter("MobileBrand", mobileBrand);

			int noOfRowsAffected = query.executeUpdate();

			session.getTransaction().commit();

			System.out.println("noOfRowsAffected :" + noOfRowsAffected);

			// SessionFactoryProvider.closeSessionFactory();
		} catch (HibernateException e) {
			System.out.println("inside catch block");
			session.getTransaction().rollback();
			System.out.println("Transaction has been rolled back");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void getMobileEntityByRam(String Ram) {
		System.out.println("INVOKED GET MOBILE ENTITY BY Ram");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();

			session = sessionFactory.openSession();

			String hqlquery = "from MobileEntity where ram=:Ram";

			org.hibernate.query.Query query = session.createQuery(hqlquery);
			query.setParameter("Ram", Ram);

			Object object = query.uniqueResult();

			System.out.println("MobileEntity :" + object);

			SessionFactoryProvider.closeSessionFactory();

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}
	}

}
