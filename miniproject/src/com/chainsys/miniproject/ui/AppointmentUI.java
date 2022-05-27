package com.chainsys.miniproject.ui;

import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointments;

public class AppointmentUI {
	public static void addNewAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Appointments newap = new Appointments();

		System.out.println("Enter Appointment_id :");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(appId);

		java.util.Date newDate = new java.util.Date();
		newap.setAppoint_Date(newDate);

		System.out.println("Enter Doctor_Id :");
		String docid = sc.nextLine();
		try {
			Validator.checkStringForParseInt(docid);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(docid);
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(docId);

		System.out.println("Enter Patient Name :");
		String patName = sc.nextLine();
		try {
			Validator.checkCharLessThanTwenty(patName);
			Validator.checkNameContainsOnlyString(patName);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setPatient_Name(patName);

		System.out.println("Enter Fees Collected :");
		String fees = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int feesInt = Integer.parseInt(fees);
		try {
			Validator.checkNumberForGreaterThanZero(feesInt);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setFees_Collected(feesInt);

		int result = AppointmentDao.insertAppointment(newap);
		System.out.println(result+" row inserted");
	}

	public static void updateAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Appointments newap = new Appointments();
		System.out.println("Enter Appointment_id :");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(appId);

		java.util.Date newDate = new java.util.Date();
		newap.setAppoint_Date(newDate);

		System.out.println("Enter Doctor_Id :");
		String docid = sc.nextLine();
		try {
			Validator.checkStringForParseInt(docid);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(docid);
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(docId);

		System.out.println("Enter Patient Name :");
		String patName = sc.nextLine();
		try {
			Validator.checkCharLessThanTwenty(patName);
			Validator.checkNameContainsOnlyString(patName);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setPatient_Name(patName);

		System.out.println("Enter Fees Collected :");
		String fees = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int feesInt = Integer.parseInt(fees);
		try {
			Validator.checkNumberForGreaterThanZero(feesInt);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setFees_Collected(feesInt);

		int result = AppointmentDao.updateAppointment(newap);
		System.out.println(result+" row updated");
	}

	public static void updatePatientName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointments newap = new Appointments();
			System.out.println("Enter Appointment Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int appId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setAppoint_Id(appId);
			System.out.println("Enter updated Patient Name :");
			String patName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(patName);
				Validator.checkNameContainsOnlyString(patName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setPatient_Name(patName);
			int result = AppointmentDao.updatePatientName(Integer.parseInt(id), patName);
			System.out.println(result+" row updated");
		} finally {
			sc.close();
		}
	}

	public static void updateFeesCollected() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Appointments newap = new Appointments();
		System.out.println("Enter Appointment_id :");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(appId);

		System.out.println("Enter Update Fees :");
		String fees = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int feesInt = Integer.parseInt(fees);
		try {
			Validator.checkNumberForGreaterThanZero(feesInt);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setFees_Collected(feesInt);
		int result = AppointmentDao.updateFeesCollected(Integer.parseInt(id), feesInt);
		System.out.println(result);
	}

	public static void deleteAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Appointments newap = new Appointments();
		System.out.println("Enter Appointment_id :");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(appId);
		int result = AppointmentDao.deleteAppointment(appId);
		System.out.println(result);
	}

	public static void getPatientById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Appointments newap = new Appointments();
		System.out.println("Enter Appointment_id :");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int appId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(appId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setAppoint_Id(appId);
		Appointments result = AppointmentDao.getPatientById(appId);
		System.out.println(result.getAppoint_Id() + " " + result.getAppoint_Date() + " " + result.getDoc_Id() + " "
				+ result.getPatient_Name() + " " + result.getFees_Collected());
	}

	public static void getAllAppointmentDetails() {
		List<Appointments> allAppointments = AppointmentDao.getAllAppoinments();
		Iterator<Appointments> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointments ap = apIterator.next();
			System.out.println(ap.getAppoint_Id() + " " + ap.getAppoint_Date() + " " + ap.getDoc_Id() + " "
					+ ap.getPatient_Name() + " " + ap.getFees_Collected());
		}
	}

	public static void getInnerJoinDoctorAndAppointment() {
		List<Appointments> allAppointments = AppointmentDao.getInnerJoinDoctorAndAppointment();
		Iterator<Appointments> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointments ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}

	public static void getLeftOuterJoinDoctorAndAppointment() {
		List<Appointments> allAppointments = AppointmentDao.getLeftOuterJoinDoctorAndAppointment();
		Iterator<Appointments> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointments ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}

	public static void getRightOuterJoinDoctorAndAppointment() {
		List<Appointments> allAppointments = AppointmentDao.getRightOuterJoinDoctorAndAppointment();
		Iterator<Appointments> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointments ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}

	public static void getFullOuterJoinDoctorAndAppointment() {
		List<Appointments> allAppointments = AppointmentDao.getFullOuterJoinDoctorAndAppointment();
		Iterator<Appointments> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointments ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}
}
