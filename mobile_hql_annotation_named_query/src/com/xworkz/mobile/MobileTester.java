package com.xworkz.mobile;

import java.util.Scanner;

import com.xworkz.mobiles.dao.MobileDAO;
import com.xworkz.mobiles.dao.MobileDAOImpl;
import com.xworkz.mobiles.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {

		MobileDAO mobileDAOImpl = new MobileDAOImpl();

//		MobileEntity mobileEntity = new MobileEntity("samsung", 33000.00, "8GB", "LightPink", 32, true, "Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("vivo", 20000.00, "4GB","blue", 24,false,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("iphone", 120000.00, "512GB","green",36,true,"ios");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("MI", 25000.00, "16GB","black",23,false,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("Lyf", 15000.00, "8GB","blue", 14,true,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("oneplus", 550000.00, "16GB","white",36,true,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("Redmi", 260000.00, "4GB","black",16,false,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("Oppo", 660000.00, "8GB","brown",22,true,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

//		MobileEntity mobileEntity = new MobileEntity("Realme", 10000.00, "4GB","lightblue",8,false,"Android");
//		mobileDAOImpl.saveMobileEntity(mobileEntity);

		// error/mobileDAOImpl.getMobileEntity();

//		 mobileDAOImpl.updateMobileEntity();

//		 mobileDAOImpl.deleteMobileEntity();

//		 mobileDAOImpl.getAllMobileEntity();

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Number:"); int mobileId =scanner.nextInt();
		 * mobileDAOImpl.getMobileBrandByID(mobileId);
		 */
		// OR
//		 mobileDAOImpl.getMobileBrandByID(4);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Number:"); int mobileId =scanner.nextInt();
		 * mobileDAOImpl.getMobileEntityByID(mobileId);
		 */
		// OR
//		 mobileDAOImpl.getMobileEntityByID(9);

//		mobileDAOImpl.updateMobilePriceByID(5,19800.00);

//		mobileDAOImpl.deleteMobileEntityByID(7);

//		mobileDAOImpl.minMobileEntityByMobilePrice();
//	    mobileDAOImpl.maxMobileEntityByMobilePrice();
//		 mobileDAOImpl.avgMobileEntityByMobilePrice();
//		 mobileDAOImpl.sumMobileEntityByMobilePrice();
//		 mobileDAOImpl.countMobileEntityBYCameraSize();

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Brand:"); String mobileBrand =scanner.next();
		 * mobileDAOImpl.updateMobilePriceByMobileBrand(mobileBrand);
		 */
		// OR
//		  mobileDAOImpl.updateMobilePriceByMobileBrand("Vivo",17500.00);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Brand:"); String mobileBrand = scanner.next();
		 * mobileDAOImpl.getMobileEntityByMobileBrand(mobileBrand);
		 */
		// OR
//		mobileDAOImpl.getMobileEntityByMobileBrand("Iphone");
//		

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Brand:"); String mobileBrand = scanner.next();
		 * mobileDAOImpl.deleteMobileEntityByMobileBrand(mobileBrand);
		 */
		// OR
		// mobileDAOImpl.deleteMobileEntityByMobileBrand("oneplus");

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Price:"); double mobilePrice =
		 * scanner.nextDouble();
		 * mobileDAOImpl.updateMobileBrandByMobilePrice(mobilePrice);
		 */
		// or
//		mobileDAOImpl.updateMobileBrandByMobilePrice(25000.00,"poco");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Ram:");
		String ram = scanner.next();
		mobileDAOImpl.getMobileEntityByRam(ram);

		// or
		// mobileDAOImpl.getMobileEntityByRam("6GB");

	}

}
