package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao
{
   public static void testInsertDoctor() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(123);
   	newdoc.setName("Vijay");
	Calendar c1 =Calendar.getInstance();
   	java.util.Date newDate =new java.util.Date();
   	newdoc.setDate(newDate);
   	newdoc.setSpeciality("Heart specialist");
   	newdoc.setCity("Chennai");
   	newdoc.setNumber(9192939);
   	newdoc.setStd_Fees(10000);   
   	int result =DoctorDao.insertDoctor(newdoc);
   	System.out.println(result);
   }
   
   public static void testUpdateDoctor() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(123);
   	newdoc.setName("Vijay Kumar");
	Calendar c1 =Calendar.getInstance();
   	java.util.Date newDate =new java.util.Date();
   	newdoc.setDate(newDate);
   	newdoc.setSpeciality("Tooth specialist");
   	newdoc.setCity("Chennai");
   	newdoc.setNumber(54);
   	newdoc.setStd_Fees(10000);   
   	int result =DoctorDao.updateDoctor(newdoc);
   	System.out.println(result);
   }
   
   public static void testUpdateDoctorName() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(555);
   	newdoc.setName("Vijayakanth");
   	int result =DoctorDao.updateDoctorName("Vijayakanth",555);
   	System.out.println(result);
   }
   public static void testUpdateDoctorFees() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(123);
   	newdoc.setStd_Fees(7000);
   	int result =DoctorDao.updateDoctorFees(123, 78000);
   	System.out.println(result);
   }
   
   public static void testDeleteDoctor() {
   	int result =DoctorDao.deleteDoctor(123);
   	System.out.println(result);
   }
   
   public static void testGetDoctorById() {
	 	Doctor result =DoctorDao.getDoctorById(124);
	 	System.out.println(result.getDoctor_id()+" "+result.getName()+" "+result.getSpeciality()+" "+result.getCity()+" "+result.getNumber()+" "+result.getStd_Fees());
   }
   
   public static void testGetAllDoctors() {
  	 List<Doctor> allDoctors =DoctorDao.getAllDoctor();
  	 Iterator <Doctor> drIterator = allDoctors.iterator();
  	 while(drIterator.hasNext()) {
  		 Doctor dr =drIterator.next();
  		System.out.println(dr.getDoctor_id()+" "+dr.getName()+" "+dr.getSpeciality()+" "+dr.getCity()+" "+dr.getNumber()+" "+dr.getStd_Fees());
  	 }
   }
}  