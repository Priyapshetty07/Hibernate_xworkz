package com.xworkz.mobiles.dao;

public interface MobileDAO {

	void saveMobileEntity();

	void getMobileEntity();

	void updateMobileEntity();

	void deleteMobileEntity();

	void getAllMobileEntity();

	void getMobileBrandByID();

	void getMobileEntityByID();

	void updateMobilePriceByID();

	void deleteMobileEntityByID();

	void minMobileEntityByMobilePrice();

	void maxMobileEntityByMobilePrice();

	void avgMobileEntityByMobilePrice();

	void sumMobileEntityByMobilePrice();

	void countMobileEntityBYCameraSize();

}
