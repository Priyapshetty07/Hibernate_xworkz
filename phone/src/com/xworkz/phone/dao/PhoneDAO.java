package com.xworkz.phone.dao;

public interface PhoneDAO {

	// save //create
	void persistPhoneEntity();

	// read //get
	void loadPhoneEntity();

	// update
	void mergePhoneEntity();

	// delete
	void removePhoneEntity();

}
