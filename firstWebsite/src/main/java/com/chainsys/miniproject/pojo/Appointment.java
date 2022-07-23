package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment extends Doctor 
{
	private int appointment_Id;
	private Date appointment_Date;
	private int doctor_Id;
	private String patient_Name;
	private long fees_Collected;

	public int getAppoint_Id() {
		return appointment_Id;
	}

	public void setAppoint_Id(int appoint_Id) {
		this.appointment_Id = appoint_Id;
	}

	public Date getAppoint_Date() {
		return appointment_Date;
	}

	public void setAppoint_Date(Date emp_HireDate) {
		this.appointment_Date = emp_HireDate;
	}

	public int getDoc_Id() {
		return doctor_Id;
	}

	public void setDoc_Id(int doc_Id) {
		this.doctor_Id = doc_Id;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public long getFees_Collected() {
		return fees_Collected;
	}

	public void setFees_Collected(long fees_Collected) {
		this.fees_Collected = fees_Collected;
	}
}