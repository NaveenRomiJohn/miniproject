package programs;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class eui {
	public static void addNewEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setEmp_id(Integer.parseInt(id));
			System.out.println("Enter First_Name :");
			String fname = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(fname);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setFirst_name(fname);
			System.out.println("Enter Last_Name :");
			String lname = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(lname);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setLast_name(lname);
			System.out.println("Enter Email :");
			String email = sc.nextLine();
			try {
				Validator.validateEmail(email);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setEmail(email);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newemp.setHire_date(newDate);
			System.out.println("Enter Job_id :");
			String jobId = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(jobId);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setJob_id(jobId);
			System.out.println("Enter Salary :");
			String salary = sc.nextLine();
			try {
				Validator.checkStringForParseInt(salary);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			int salaryInt = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(salaryInt);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setSalary(salaryInt);
			int result = EmployeeDao.insertEmployee(newemp);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
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
				System.out.println("Exception occured: " + err);
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setEmp_id(Integer.parseInt(id));
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId);
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter First_Name to Modify:");
			String fname = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(fname);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setFirst_name(fname);
			System.out.println("Enter Last_Name to Modify:");
			String lname = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(lname);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setLast_name(lname);
			System.out.println("Enter Email to Modify:");
			String email = sc.nextLine();
			try {
				Validator.validateEmail(email);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setEmail(email);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newemp.setHire_date(newDate);
			System.out.println("Enter Job_id to Modify:");
			String jobId = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(jobId);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setJob_id(jobId);
			System.out.println("Enter Salary to Modify:");
			String salary = sc.nextLine();
			try {
				Validator.checkStringForParseInt(salary);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			int salaryInt = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(salaryInt);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setSalary(salaryInt);
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
			int empId = Integer.parseInt(id);
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter Update Name :");
			String update_name = sc.nextLine();
			try {
				Validator.checkNameContainsOnlyString(update_name);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setFirst_name(update_name);
			int result = EmployeeDao.updateEmployeeFirstName(empId, update_name);
			System.out.println(result + " row updated");
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
			int empId = Integer.parseInt(id);
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter Update salary :");
			String salaryString = sc.nextLine();
			try {
				Validator.checkStringForParseInt(salaryString);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			int salaryInt = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(salaryInt);
			} catch (InvalidInputDataException err) {
				System.out.println("Exception occured: " + err);
				return;
			}
			newemp.setSalary(salaryInt);
			int result = EmployeeDao.updateEmployeeSalary(empId, salaryInt);
			System.out.println(result);
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
			int empId = Integer.parseInt(id);
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			int result = EmployeeDao.deleteEmployee(empId);
			System.out.println(result);
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
			int empId = Integer.parseInt(id);
			Employee emp = EmployeeDao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId);
				return;
			}
			newemp.setEmp_id(empId);
			Employee result = EmployeeDao.getEmployeeById(empId);
			System.out.println(result.getEmp_id() + " " + result.getFirst_name() + " " + result.getLast_name() + " "
					+ result.getEmail() + " " + result.getHire_date() + " " + result.getJob_id() + " "
					+ result.getSalary());
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
					+ emp.getEmail() + " " + emp.getHire_date() + " " + emp.getJob_id() + " " + emp.getSalary());
		}
	}
}
