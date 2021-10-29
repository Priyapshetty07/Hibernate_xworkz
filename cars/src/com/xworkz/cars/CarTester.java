package com.xworkz.cars;

import com.xworkz.car.dao.CarDAO;
import com.xworkz.car.dao.CarDAOImpl;

public class CarTester {

	public static void main(String[] args) {

		CarDAO carDAOImpl = new CarDAOImpl();

		// carDAOImpl.createCarEntity();

		// carDAOImpl.readCarEntity();

		// carDAOImpl.updateCarEntity();

		carDAOImpl.deleteCarEntity();
	}

}
