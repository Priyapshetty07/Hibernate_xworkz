package com.xworkz.mobile;

import com.xworkz.mobiles.dao.MobileDAO;
import com.xworkz.mobiles.dao.MobileDAOImpl;

public class MobileTester {

	public static void main(String[] args) {

		MobileDAO mobileDAOImpl = new MobileDAOImpl();

		// mobileDAOImpl.saveMobileEntity();
		// mobileDAOImpl.getMobileEntity();
		// mobileDAOImpl.updateMobileEntity();
		// mobileDAOImpl.deleteMobileEntity();

		// mobileDAOImpl.getAllMobileEntity();
		// mobileDAOImpl.getMobileBrandByID();
		// mobileDAOImpl.getMobileEntityByID();
		// mobileDAOImpl.updateMobilePriceByID();
		// mobileDAOImpl.deleteMobileEntityByID();

		// mobileDAOImpl.minMobileEntityByMobilePrice();

		// mobileDAOImpl.maxMobileEntityByMobilePrice();

		// mobileDAOImpl.avgMobileEntityByMobilePrice();

		// mobileDAOImpl.sumMobileEntityByMobilePrice();

		mobileDAOImpl.countMobileEntityBYCameraSize();
	}

}
