package com.chainsys.miniproject.ui;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUI {
	public static void addNewEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Employee newemp = new Employee();
		try {
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmp_id(empId);

			System.out.println("Enter Employee First Name :");
			String fName = sc.nextLine();
			try {
				Validator.checkStringOnly(fName);
				Validator.checkCharLessThanTwenty(fName);	
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);

			System.out.println("Enter Employee Last Name :");
			String lName = sc.nextLine();
			try {
				Validator.checkStringOnly(lName);
				Validator.checkCharLessThanTwenty(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setLast_name(lName);

			System.out.println("Enter Employee Email :");
			String eMail = sc.nextLine();
			try {
				Validator.checkEmail(eMail);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmail(eMail);

			System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
		    SimpleDateFormat hire_dateFormate=new SimpleDateFormat("dd/MM/yyyy");
		    String emp_HireDate=sc.nextLine();
		    try {
				newemp.setHire_date(hire_dateFormate.parse(emp_HireDate));
			} catch (ParseException e) {
				e.printStackTrace();
				System.exit(-1);
			}

			System.out.println("Enter Job_id :");
			String jobId = sc.nextLine();
			try {
				Validator.checkJobId(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setJob_id(jobId);

			System.out.println("Enter Employee Salary :");
			String salary = sc.nextLine();
			try {
				Validator.checkStringForParseInt(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			float salaryFloat = Float.parseFloat(salary);
			try {
				Validator.checkNumberForGreaterThanZero(salaryFloat);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salaryFloat);

			int result = EmployeeDao.insertEmployee(newemp);
			System.out.println(result + " row inserted");
		} finally {
			sc.close();
		}
	}

	public static void updateEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId);
				return;
			}
			newemp.setEmp_id(empId);

			System.out.println("Enter First_Name to Modify:");
			String fName = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(fName);
				Validator.checkCharLessThanTwenty(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);

			System.out.println("Enter Last_Name to Modify:");
			String lName = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(lName);
				Validator.checkCharLessThanTwenty(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setLast_name(lName);

			System.out.println("Enter Email to Modify:");
			String eMail = sc.nextLine();
			try {
				Validator.checkEmail(eMail);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmail(eMail);

			java.util.Date newDate = new java.util.Date();
			newemp.setHire_date(newDate);

			System.out.println("Enter Job_id to Modify:");
			String jobId = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setJob_id(jobId);

			System.out.println("Enter Salary to Modify:");
			String salary = sc.nextLine();
			try {
				Validator.checkStringForParseInt(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			float salaryFloat = Float.parseFloat(salary);
			try {
				Validator.checkNumberForGreaterThanZero(salaryFloat);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salaryFloat);

			int result = EmployeeDao.updateEmployee(newemp);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateEmployeeFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);

			System.out.println("Enter Update Name :");
			String fName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);
			int result = EmployeeDao.updateEmployeeFirstName(empId, fName);
			System.out.println(result + " " + "row updated");
		} finally {
			sc.close();
		}
	}

	public static void updateEmployeeSalary() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter Update salary :");
			String salary = sc.nextLine();
			try {
				Validator.checkStringForParseInt(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			float salaryFloat = Float.parseFloat(salary);
			try {
				Validator.checkNumberForGreaterThanZero(salaryFloat);
				Validator.checkNumberLessThanTenDigit(salaryFloat);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salaryFloat);
			int result = EmployeeDao.updateEmployeeSalary(empId, salaryFloat);
			System.out.println(result + " " + "row updated");
		} finally {
			sc.close();
		}
	}

	public static void deleteEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmp_id(empId);
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			int result = EmployeeDao.deleteEmployee(empId);
			System.out.println(result + " " + "row deleted");
		} finally {
			sc.close();
		}
	}

	public static void getEmployeeById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			Employee result = EmployeeDao.getEmployeeById(empId);
			System.out.println(result.getEmp_id() + " " + result.getFirst_name() + " " + result.getLast_name() + " "
					+ result.getEmail() + " " + result.getJob_id() + " " + result.getSalary());
		} finally {
			sc.close();
		}
	}

	public static void getAllEmployeesDetails() {
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			System.out.println(emp.getEmp_id() + " " + emp.getFirst_name() + " " + emp.getLast_name() + " "
					+ emp.getEmail() + " " + emp.getJob_id() + " " + emp.getSalary());
		}
	}
}
