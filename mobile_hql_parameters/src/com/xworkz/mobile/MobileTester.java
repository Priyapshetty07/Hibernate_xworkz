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

//		 mobileDAOImpl.getMobileEntity();
//		 mobileDAOImpl.updateMobileEntity();
//		 mobileDAOImpl.deleteMobileEntity();
//
//		 mobileDAOImpl.getAllMobileEntity();
//
//		 mobileDAOImpl.getMobileBrandByID(5);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Number:");
		 * 
		 * int mobileId =scanner.nextInt();
		 * 
		 * mobileDAOImpl.getMobileEntityByID(mobileId);
		 */
		// OR
//		 mobileDAOImpl.getMobileEntityByID(9);

//		mobileDAOImpl.updateMobilePriceByID(5);

//		 mobileDAOImpl.deleteMobileEntityByID();

//		mobileDAOImpl.minMobileEntityByMobilePrice();
//	    mobileDAOImpl.maxMobileEntityByMobilePrice();
//		 mobileDAOImpl.avgMobileEntityByMobilePrice();
//		 mobileDAOImpl.sumMobileEntityByMobilePrice();
//		 mobileDAOImpl.countMobileEntityBYCameraSize();

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Brand:");
		 * 
		 * String mobileBrand =scanner.next();
		 * 
		 * mobileDAOImpl.updateMobilePriceByMobileBrand(mobileBrand);
		 */

		// OR
//		  mobileDAOImpl.updateMobilePriceByMobileBrand("Vivo");

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Brand:");
//
//		String mobileBrand = scanner.next();
//
//		mobileDAOImpl.getMobileEntityByMobileBrand(mobileBrand);

		// OR
//		mobileDAOImpl.getMobileEntityByMobileBrand("Iphone");
//		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Brand:");
		 * 
		 * String mobileBrand = scanner.next();
		 * 
		 * mobileDAOImpl.deleteMobileEntityByMobileBrand(mobileBrand);
		 */

		// OR
		// mobileDAOImpl.deleteMobileEntityByMobileBrand("Iphone");

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Price:");
		 * 
		 * double mobilePrice = scanner.nextDouble();
		 * 
		 * mobileDAOImpl.updateMobileBrandByMobilePrice(mobilePrice);
		 */
		// or
		// mobileDAOImpl.updateMobileBrandByMobilePrice(65650.00);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Ram:");

		String ram = scanner.next();

		mobileDAOImpl.getMobileEntityByRam(ram);
		// or
		// mobileDAOImpl.getMobileEntityByRam("6GB");

	}

}
