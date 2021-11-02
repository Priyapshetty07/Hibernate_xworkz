package com.xworkz.phones;

import com.xworkz.phone.dao.PhoneDAO;
import com.xworkz.phone.dao.PhoneDAOImpl;

public class PhoneTester {

	public static void main(String[] args) {

		PhoneDAO phoneDAOImpl = new PhoneDAOImpl();

		phoneDAOImpl.persistPhoneEntity();

		phoneDAOImpl.loadPhoneEntity();

		phoneDAOImpl.mergePhoneEntity();

		phoneDAOImpl.removePhoneEntity();

	}

}
