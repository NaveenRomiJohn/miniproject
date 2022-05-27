package com.chainsys.miniproject.pojo;

import java.util.Date;

/**
 * @author nave3121 created on 14 May 2022
 */
public class Doctor {
	private int doctor_id;
	private String name;
	private Date dob;
	private String speciality;
	private String city;
	private long phone_number;
	private float std_Fees;

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return dob;
	}

	public void setDate(Date date) {
		this.dob = date;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getNumber() {
		return phone_number;
	}

	public void setNumber(long phone) {
		this.phone_number = phone;
	}

	public float getStd_Fees() {
		return std_Fees;
	}

	public void setStd_Fees(float std_Fees) {
		this.std_Fees = std_Fees;
	}

}