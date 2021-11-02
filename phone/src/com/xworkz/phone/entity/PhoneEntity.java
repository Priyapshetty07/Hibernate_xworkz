package com.xworkz.phone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "details_of_phones")
@Entity

public class PhoneEntity implements java.io.Serializable {

	@Id
	@Column(name = "PHONE_ID")
	private int phoneID;

	@Column(name = "PHONE_BRAND")
	private String phoneBrand;

	@Column(name = "PHONE_PRICE")
	private double phonePrice;

	@Column(name = "ROM")
	private String rom;
	@Column(name = "COLOR")
	private String color;

	@Column(name = "CAMERA_PIXEL ")
	private int cameraPixel;

	@Column(name = "IS_FINGER_PRINT_SUPPORTED")
	private boolean isFingerPrintSupported;

	@Column(name = "OS_TYPE")
	private String osType;

	public PhoneEntity() {
		System.out.println("invoked phoneEntity");
	}

	public PhoneEntity(int phoneID, String phoneBrand, double phonePrice, String rom, String color, int cameraPixel,
			boolean isFingerPrintSupported, String osType) {
		super();
		this.phoneID = phoneID;
		this.phoneBrand = phoneBrand;
		this.phonePrice = phonePrice;
		this.rom = rom;
		this.color = color;
		this.cameraPixel = cameraPixel;
		this.isFingerPrintSupported = isFingerPrintSupported;
		this.osType = osType;
	}

	public int getPhoneID() {
		return phoneID;
	}

	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public double getPhonePrice() {
		return phonePrice;
	}

	public void setPhonePrice(double phonePrice) {
		this.phonePrice = phonePrice;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCameraPixel() {
		return cameraPixel;
	}

	public void setCameraPixel(int cameraPixel) {
		this.cameraPixel = cameraPixel;
	}

	public boolean isFingerPrintSupported() {
		return isFingerPrintSupported;
	}

	public void setFingerPrintSupported(boolean isFingerPrintSupported) {
		this.isFingerPrintSupported = isFingerPrintSupported;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	@Override
	public String toString() {
		return "PhoneEntity [phoneID=" + phoneID + ", phoneBrand=" + phoneBrand + ", phonePrice=" + phonePrice
				+ ", rom=" + rom + ", color=" + color + ", cameraPixel=" + cameraPixel + ", isFingerPrintSupported="
				+ isFingerPrintSupported + ", osType=" + osType + "]";
	}

}
