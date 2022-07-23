package com.chainsys.miniproject.pojo;

import java.util.Date;

/**
 * @author nave3121 created on 14 May 2022
 */
public class Doctor {
	private int doctor_id;
	private String doctor_name;
	private Date date_of_birth;
	private String speciality;
	private String city;
	private long phone_number;
	private float fees;

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return doctor_name;
	}

	public void setName(String name) {
		this.doctor_name = name;
	}

	public Date getDate() {
		return date_of_birth;
	}

	public void setDate(Date date) {
		this.date_of_birth = date;
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
		return fees;
	}

	public void setStd_Fees(float std_Fees) {
		this.fees = std_Fees;
	}

}