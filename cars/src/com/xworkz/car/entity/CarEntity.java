package com.xworkz.car.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = " details_of_cars")
@Entity

public class CarEntity {

	@Id
	@Column(name = "CAR_NUMBER")
	private int CarNumber;

	@Column(name = "CAR_BRAND")
	private String carBrand;

	@Column(name = "CAR_PRICE")
	private double carPrice;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "NO_OF_SEAT")
	private int noOfSeat;

	@Column(name = "IS_AIRROOF_SUPPORT")
	private boolean isAirroofSupport;

	@Column(name = "TYPE_OF_ENGINE")
	private String typeOfEngine;

	public CarEntity() {
		super();

	}

	public CarEntity(int carNumber, String carBrand, double carPrice, String color, int noOfSeat,
			boolean isAirroofSupport, String typeOfEngine) {
		super();
		CarNumber = carNumber;
		this.carBrand = carBrand;
		this.carPrice = carPrice;
		this.color = color;
		this.noOfSeat = noOfSeat;
		this.isAirroofSupport = isAirroofSupport;
		this.typeOfEngine = typeOfEngine;
	}

	public int getCarNumber() {
		return CarNumber;
	}

	public void setCarNumber(int carNumber) {
		CarNumber = carNumber;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public boolean isAirroofSupport() {
		return isAirroofSupport;
	}

	public void setAirroofSupport(boolean isAirroofSupport) {
		this.isAirroofSupport = isAirroofSupport;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}

	@Override
	public String toString() {
		return "CarEntity [CarNumber=" + CarNumber + ", carBrand=" + carBrand + ", carPrice=" + carPrice + ", color="
				+ color + ", noOfSeat=" + noOfSeat + ", isAirroofSupport=" + isAirroofSupport + ", typeOfEngine="
				+ typeOfEngine + "]";
	}

}
