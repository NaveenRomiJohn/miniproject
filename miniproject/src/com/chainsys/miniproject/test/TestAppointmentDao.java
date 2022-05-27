package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointments;

public class TestAppointmentDao 
{
	public static void testAppointmentInsert() {
		Appointments newap = new Appointments();
		newap.setAppoint_Id(302);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = new java.util.Date();
		newap.setAppoint_Date(newDate);
		newap.setDoc_Id(123);
		newap.setPatient_Name("Aravintha");
		newap.setFees_Collected(25000);
		int result = AppointmentDao.insertAppointment(newap);
		System.out.println(result);
	}

	public static void testUpdateAppointment() {
		Appointments newap = new Appointments();
		newap.setAppoint_Id(301);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = new java.util.Date();
		newap.setAppoint_Date(newDate);
		newap.setDoc_Id(123);
		newap.setPatient_Name("Naveen");
		newap.setFees_Collected(25000);
		int result = AppointmentDao.updateAppointment(newap);
		System.out.println(result);
	}

	public static void testUpdatePatientName() {
		Appointments newap = new Appointments();
		newap.setAppoint_Id(301);
		newap.setPatient_Name("Naveen Romi");
		int result = AppointmentDao.updatePatientName(301, "Naveen Romi");
		System.out.println(result);
	}

	public static void testUpdateFeesCollected() {
		Appointments newap = new Appointments();
		newap.setAppoint_Id(301);
		newap.setFees_Collected(30000);
		int result = AppointmentDao.updateFeesCollected(301, 35000);
		System.out.println(result);
	}

	public static void testDeleteAppointment() {
		Appointments newap = new Appointments();
		newap.setAppoint_Id(301);
		int result = AppointmentDao.deleteAppointment(301);
		System.out.println(result);
	}

	public static void testGetPatientById() {
		Appointments result = AppointmentDao.getPatientById(301);
		System.out.println(result.getAppoint_Id() + " " + result.getAppoint_Date() + " " + result.getDoc_Id() + " "
				+ result.getPatient_Name() + " " + result.getFees_Collected());
	}

	public static void testGetAllAppointmentDetails() {
		List<Appointments> allAppointments = AppointmentDao.getAllAppoinments();
		Iterator<Appointments> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointments ap = apIterator.next();
			System.out.println(ap.getAppoint_Id() + " " + ap.getAppoint_Date() + " " + ap.getDoc_Id() + " "
					+ ap.getPatient_Name() + " " + ap.getFees_Collected());
		}
	}
}