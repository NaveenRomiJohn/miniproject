package programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class doui {
	public static void addNewDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_Id :");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		int docId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		newdoc.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		try {
			Validator.checkNameContainsOnlyString(name);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		newdoc.setName(name);
		System.out.println("Enter Doctor Date of birth like dd/mm/yyyy:");
        SimpleDateFormat appFormat = new SimpleDateFormat("dd/mm/yyyy");
        String doc_dob = sc.nextLine();
        try {
            newdoc.setDate(appFormat.parse(doc_dob));
        } catch (ParseException e) {
            e.printStackTrace();
        }
		System.out.println("Enter Speciality :");
		String Speciality = sc.nextLine();
		try {
			Validator.checkNameContainsOnlyString(Speciality);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		newdoc.setSpeciality(Speciality);
		System.out.println("Enter City :");
		String city = sc.nextLine();
		try {
			Validator.checkNameContainsOnlyString(city);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		newdoc.setCity(city);
		System.out.println("Enter Phone_Number");
		String number = sc.nextLine();
		try {
			Validator.checkStringForParseInt(number);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		int phoneNumber = sc.nextInt();
		try {
			Validator.checkNumberForGreaterThanZero(phoneNumber);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		newdoc.setNumber(phoneNumber);
		System.out.println("Enter Standard_Fees :");
		String fee = sc.nextLine();
		try {
			Validator.checkStringForParseInt(number);
		} catch (InvalidInputDataException err) {
			System.out.println("Exception occured: " + err);
			return;
		}
		float fees=sc.nextFloat();
		newdoc.setStd_Fees(fees);
		int result = DoctorDao.insertDoctor(newdoc);
		System.out.println(result + " " + "row inserted");
	}

	public static void updateDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_Id :");
		String id = sc.nextLine();
		newdoc.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Name :");
		newdoc.setName(sc.nextLine());
		System.out.println("Enter Doctor Date of birth like dd/mm/yyyy:");
        SimpleDateFormat appFormat = new SimpleDateFormat("dd/MM/yyyy");
        String doc_dob = sc.nextLine();
        try {
            newdoc.setDate(appFormat.parse(doc_dob));
        } catch (ParseException e) {
            e.printStackTrace();
        }
		System.out.println("Enter Speciality :");
		newdoc.setSpeciality(sc.nextLine());
		System.out.println("Enter City :");
		newdoc.setCity(sc.nextLine());
		System.out.println("Enter Phone_Number");
		newdoc.setNumber(sc.nextInt());
		System.out.println("Enter Standard_Fees :");
		newdoc.setStd_Fees(sc.nextFloat());
		int result = DoctorDao.updateDoctor(newdoc);
		System.out.println(result+" "+"row updated");
	}

	public static void updateDoctorFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_Id :");
		String id = sc.nextLine();
		newdoc.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Update Name :");
		String update_name = sc.nextLine();
		int result = DoctorDao.updateDoctorFirstName(Integer.parseInt(id), update_name);
		System.out.println(result+" "+"row updated");
	}

	public static void updateDoctorFees() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_Id :");
		String id = sc.nextLine();
		newdoc.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Update Name :");
		float update_fees = sc.nextFloat();
		int result = DoctorDao.updateDoctorFees(Integer.parseInt(id), update_fees);
		System.out.println(result+" "+"row updated");
	}

	public static void deleteDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_Id :");
		String id = sc.nextLine();
		newdoc.setDoctor_id(Integer.parseInt(id));
		// System.out.println("Enter Update Name :");
		// String update_name= sc.nextLine();
		int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
		System.out.println(result);
	}

	public static void getDoctorById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor_Id :");
		int id = sc.nextInt();
		//newdoc.setDoctor_id(Integer.parseInt(id));
		Doctor result = DoctorDao.getDoctorById(id);
		System.out.println(result.getDoctor_id() + " " + result.getName() + " " + result.getDate() + " " + result.getSpeciality()
						+ " " + result.getCity() + " " + result.getNumber() + " " + result.getStd_Fees());
	}

	public static void getAllDoctorDetails() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDoctor_id() + " " + dr.getName() + " " + dr.getDate() + " " + dr.getSpeciality()
					+ " " + dr.getCity() + " " + dr.getNumber() + " " + dr.getStd_Fees());
		}
	}
}
