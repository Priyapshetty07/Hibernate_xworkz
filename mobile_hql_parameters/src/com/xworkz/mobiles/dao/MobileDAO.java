package com.xworkz.mobiles.dao;

import com.xworkz.mobiles.entity.MobileEntity;

public interface MobileDAO {

	void saveMobileEntity(MobileEntity mobileEntity);

	void getMobileEntity();

	void updateMobileEntity();

	void deleteMobileEntity();

	void getAllMobileEntity();

	void getMobileBrandByID(int mobileID);

	void getMobileEntityByID(int mobileID);

	void updateMobilePriceByID(int mobileID);

	void deleteMobileEntityByID();

	void minMobileEntityByMobilePrice();

	void maxMobileEntityByMobilePrice();

	void avgMobileEntityByMobilePrice();

	void sumMobileEntityByMobilePrice();

	void countMobileEntityBYCameraSize();

	void updateMobilePriceByMobileBrand(String mobileBrand);

	void getMobileEntityByMobileBrand(String mobileBrand);

	void deleteMobileEntityByMobileBrand(String mobileBrand);

	void updateMobileBrandByMobilePrice(double mobilePrice);

	void getMobileEntityByRam(String ram);
}
