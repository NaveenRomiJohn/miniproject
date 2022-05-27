package com.chainsys.miniproject.ui;

import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUI {
	public static void addNewDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDoctor_id(docId);
			
			System.out.println("Enter Name :");
			String name = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(name);
				Validator.checkNameContainsOnlyString(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setName(name);
			
			java.util.Date newDate = new java.util.Date();
			newdoc.setDate(newDate);
			
			System.out.println("Enter Speciality :");
			String speciality = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(speciality);
				Validator.checkNameContainsOnlyString(speciality);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setSpeciality(speciality);
			
			System.out.println("Enter City :");
			String city = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(city);
				Validator.checkNameContainsOnlyString(city);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCity(city);
			
			System.out.println("Enter Phone_Number");
	        String phone = sc.nextLine();
	        try {
	            Validator.checkPhone(phone);
	        }catch(InvalidInputDataException e) {
	            e.printStackTrace();    
	        }
	       newdoc.setNumber(Long.parseLong(phone));
	        
	        System.out.println("Enter Standard fees:");
	        Float std_fees = sc.nextFloat();
	        try {
	            Validator.checkNumberForGreaterThanZero(std_fees);
	        }catch(InvalidInputDataException e) {
	            e.printStackTrace();  
	        }
	        newdoc.setStd_Fees(std_fees);
	        
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result+" row inserted");
		} finally {
			sc.close();
		}
	}

	public static void updateDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(name);
				Validator.checkNameContainsOnlyString(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setName(name);
	
			java.util.Date newDate = new java.util.Date();
			newdoc.setDate(newDate);
			
			System.out.println("Enter Update Speciality :");
			String speciality = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(speciality);
				Validator.checkNameContainsOnlyString(speciality);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setSpeciality(speciality);

			System.out.println("Enter Update City :");
			String city = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(city);
				Validator.checkNameContainsOnlyString(city);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCity(city);
			
			System.out.println("Enter Update Phone_Number");
			newdoc.setNumber(sc.nextLong());
	        String phone = sc.nextLine();
	        try {
	            Validator.checkPhone(phone);
	        }catch(InvalidInputDataException e) {
	            e.printStackTrace();    
	        }
	       newdoc.setNumber(Long.parseLong(phone));
			
			System.out.println("Enter Update Standard_Fees :");
			Float std_fees = sc.nextFloat();
	        try {
	            Validator.checkNumberForGreaterThanZero(std_fees);
	        }catch(InvalidInputDataException e) {
	            e.printStackTrace();  
	        }
	        newdoc.setStd_Fees(std_fees);
	        
			int result = DoctorDao.updateDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setName(name);
			
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			
			
			int result = DoctorDao.updateDoctorName(name,docId);
			System.out.println(result+" row updated");
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFees() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Update Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkNumberLessThanTenDigit(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setStd_Fees(fees);
			
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docid=Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docid);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docid);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docid);
				return;
			}
			newdoc.setDoctor_id(docid);
			
			int result = DoctorDao.updateDoctorFees(fees,docid);
			System.out.println(result+" row updated");
		} finally {
			sc.close();
		}
	}

	public static void deleteDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoctor_id(Integer.parseInt(id));
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);

			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
			System.out.println(result+" row deleted");
		} finally {
			sc.close();
		}
	}

	public static void getDoctorById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				System.exit(-1);;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				System.exit(-1);;
			}
			Doctor result = DoctorDao.getDoctorById(docId);
			System.out.println(result.getDoctor_id() + " " + result.getName() + " "
					+ result.getSpeciality() + " " + result.getCity() + " " + result.getNumber() + " "
					+ result.getStd_Fees());
		} finally {
			sc.close();
		}
	}

	public static void getAllDoctorDetails() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDoctor_id() + " " + dr.getName() + " " + dr.getSpeciality()
					+ " " + dr.getCity() + " " + dr.getNumber() + " " + dr.getStd_Fees());
		}
	}
}