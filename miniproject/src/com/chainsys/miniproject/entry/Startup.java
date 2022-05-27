package com.chainsys.miniproject.entry;

import java.util.Scanner;
import com.chainsys.miniproject.ui.AppointmentUI;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeeUI;

/**
 * @author nave3121 created on 13 May 2022
 */
public class Startup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Menu 1:LoadEmployee, 2:LoadDoctor, 3:LoadAppointments");
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				LoadEmployee();
				break;
			case 2:
				LoadDoctor();
				break;
			case 3:
				LoadAppointments();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void LoadEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select Employee Method \n 1:AddNewEmployee \n 2:UpdateEmployeeFirstName \n 3:updateEmployeeSalary \n 4:GetEmployeeById \n 5:GetAllEmployeesDetails \n 6:DeleteEmployee \n 7.UpdateEmployee");
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				EmployeeUI.addNewEmployee();
				break;
			case 2:
				EmployeeUI.updateEmployeeFirstName();
				break;
			case 3:
				EmployeeUI.updateEmployeeSalary();
				break;
			case 4:
				EmployeeUI.getEmployeeById();
				break;
			case 5:
				EmployeeUI.getAllEmployeesDetails();
				break;
			case 6:
				EmployeeUI.deleteEmployee();
				break;
			case 7:
				EmployeeUI.updateEmployee();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void LoadDoctor() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select Doctor Method \n 1:addNewDoctor \n 2:updateDoctor \n 3:updateDoctorName \n 4:updateDoctorFees \n 5:getDoctorById \n 6:getAllDoctorDetails \n 7:deleteDoctor");
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUI.addNewDoctor();
				break;
			case 2:
				DoctorUI.updateDoctor();
				break;
			case 3:
				DoctorUI.updateDoctorName();
				break;
			case 4:
				DoctorUI.updateDoctorFees();
				break;
			case 5:
				DoctorUI.getDoctorById();
				break;
			case 6:
				DoctorUI.getAllDoctorDetails();
				break;
			case 7:
				DoctorUI.deleteDoctor();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void LoadAppointments() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select Doctor Method \n 1:addNewAppointment \n 2:updateAppointment \n 3:updatePatientName \n 4:getPatientById \n 5:getAllAppointmentDetails \n 6:deleteAppointment");
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentUI.addNewAppointment();
				break;
			case 2:
				AppointmentUI.updateAppointment();
				break;
			case 3:
				AppointmentUI.updatePatientName();
				break;
			case 4:
				AppointmentUI.getPatientById();
				break;
			case 5:
				AppointmentUI.getAllAppointmentDetails();
				break;
			case 6:
				AppointmentUI.deleteAppointment();
				break;
			}
		} finally {
			sc.close();
		}
	}
}
