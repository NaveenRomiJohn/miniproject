package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * @author nave3121
 * created on 21 May 2022
 */
/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "GettingAllEmployeeDetails";
		String message = "<h1>Error while " + source + "</h1>";
		try {
			List<Doctor> listOfDoctors = DoctorDao.getAllDoctor();
			Iterator<Doctor> drIterator = listOfDoctors.iterator();
			if (request.getParameter("input").equals("yes")) {
				response.setContentType("text/html");
				out.print("<html><head><title><Doctors</title></head><body>");
				out.print("<table border=1px bgcolor=\"DodgerBlue\" width=50%>");
				out.print("<tr bgcolor=\"DarkSlateBlue\" align=center>");
				out.print("<th height=\"10\" width=\"90\">Doc_id:</th>");
				out.print("<th height=\"10\" width=\"90\">Name:</th>");
				out.print("<th height=\"10\" width=\"90\">Speciality:</th>");
				out.print("<th height=\"10\" width=\"90\">City:</th>");
				out.print("<th height=\"10\" width=\"90\">Phone_Number:</th>");
				out.print("<th height=\"10\" width=\"90\">Standard_Fees:</th>");
				while (drIterator.hasNext()) {
					out.print("<tr align=center>");
					Doctor doc = drIterator.next();
					out.print("<td bgcolor=\"DeepSkyBlue\">" + doc.getDoctor_id() + "</td>");
					out.print("<td bgcolor=\"DeepSkyBlue\">" + doc.getName() + "</td>");
					out.print("<td bgcolor=\"DeepSkyBlue\">" + doc.getSpeciality() + "</td>");
					out.print("<td bgcolor=\"DeepSkyBlue\">" + doc.getCity() + "</td>");
					out.print("<td bgcolor=\"DeepSkyBlue\">" + doc.getNumber() + "</td>");
					out.print("<td bgcolor=\"DeepSkyBlue\">" + doc.getStd_Fees() + "</td>");
					out.print("</tr>");
				}
			} else if (request.getParameter("input").equals("no")) {
				out.println(" <br><h3>Thank you for processing with us</h3>");
			}
			out.print("</body></html>");
		} catch (Exception e) {
			message += " Error while getting all records </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			out.close();
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("change").equals("Add")) {
			PrintWriter out = response.getWriter();
			String source = "AddNewEmployee";
			String message = "<h1>Error while " + source + "</h1>";
			Doctor newdoc = new Doctor();
			int result = 0;
			try {
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					message += " Error in Doctor ID input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				int docId = Integer.parseInt(id);
				try {
					Validator.checkNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					message += " Error in Doctor ID input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setDoctor_id(docId);

				String name = request.getParameter("name");
				try {
					Validator.checkCharLessThanTwenty(name);
					Validator.checkNameContainsOnlyString(name);
				} catch (InvalidInputDataException err) {
					message += " Error in Name input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setName(name);

				String speciality = request.getParameter("speciality");
				try {
					Validator.checkCharLessThanTwenty(speciality);
					Validator.checkNameContainsOnlyString(speciality);
				} catch (InvalidInputDataException err) {
					message += " Error in speciality input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setSpeciality(speciality);

				String city = request.getParameter("city");
				try {
					Validator.checkCharLessThanTwenty(city);
					Validator.checkNameContainsOnlyString(city);
				} catch (InvalidInputDataException err) {
					message += " Error in city input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setCity(city);

				String phone = request.getParameter("phone");
				try {
					Validator.checkPhone(phone);
				} catch (InvalidInputDataException e) {
					message += " Error in phone number input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
				}
				newdoc.setNumber(Long.parseLong(phone));

				String std_fees = request.getParameter("std_fees");
				try {
					Validator.checkStringForParseInt(std_fees);
				} catch (InvalidInputDataException err) {
					message += " Error in fees input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				float salaryFloat = Float.parseFloat(std_fees);
				try {
					Validator.checkNumberForGreaterThanZero(salaryFloat);
				} catch (InvalidInputDataException err) {
					message += " Error in fees input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setStd_Fees(salaryFloat);

				result = DoctorDao.insertDoctor(newdoc);
				out.println("<div> Add Doctor Status: " + result + " row inserted </div>");
			} catch (Exception e) {
				message += " Error while inserting record </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			try {
				out.close();
			} catch (Exception e) {
				message += "Message: " + e.getMessage();
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
		} else if (request.getParameter("change").equals("update")) {
			doPut(request, response);
		} else if (request.getParameter("change").equals("Delete")) {
			doDelete(request, response);
		} else if (request.getParameter("change").equals("GetByID")) {
			doHead(request, response);
		}
	}

//---------------------------------------------------------------------------------------------
	protected void doHead(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "GetDoctorByID";
		String message = "<h1>Error while " + source + "</h1>";
		Doctor doc = new Doctor();
		try {
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				System.exit(-1);
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				System.exit(-1);
			}
			doc.setDoctor_id(docId);
			Doctor result = DoctorDao.getDoctorById(docId);
			out.println("Doctor ID : " + result.getDoctor_id() + "<br>");
			out.println("Doctor Name : " + result.getName() + "<br>");
			out.println("Speciality : " + result.getSpeciality() + "<br>");
			out.println("City : " + result.getCity() + "<br>");
			out.println("Phone Number: " + result.getNumber() + "<br>");
			out.println("Standard Fees : " + result.getStd_Fees() + "<br>");
		} catch (Exception e) {
			message += " Error while getting the record by ID </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			out.close();
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

//---------------------------------------------------------------------------------------------
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String source = "DeleteEmployeeByID";
		String message = "<h1>Error while " + source + "</h1>";
		try {
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				message += " Error in Doctor ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				message += " Error in Doctor ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int result = DoctorDao.deleteDoctor(docId);
			out.println("Delete Status: " + result + " row deleted");
		} catch (Exception e) {
			message += " Error while deleting the record by ID </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			out.close();
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

//---------------------------------------------------------------------------------------------
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "UpdateDoctorDetails";
		String message = "<h1>Error while " + source + "</h1>";
		int result = 0;
		try {
			Doctor newdoc = new Doctor();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				message += " Error in Doctor ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				message += " Error in Doctor ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);

			String name = request.getParameter("name");
			try {
				Validator.checkCharLessThanTwenty(name);
				Validator.checkNameContainsOnlyString(name);
			} catch (InvalidInputDataException err) {
				message += " Error in name input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setName(name);

			String speciality = request.getParameter("speciality");
			try {
				Validator.checkCharLessThanTwenty(speciality);
				Validator.checkNameContainsOnlyString(speciality);
			} catch (InvalidInputDataException err) {
				message += " Error in speciality input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setSpeciality(speciality);

			String city = request.getParameter("city");
			try {
				Validator.checkCharLessThanTwenty(city);
				Validator.checkNameContainsOnlyString(city);
			} catch (InvalidInputDataException err) {
				message += " Error in city input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setCity(city);

			String phone = request.getParameter("phone");
			try {
				Validator.checkPhone(phone);
			} catch (InvalidInputDataException e) {
				message += " Error in phone number input </p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
			}
			newdoc.setNumber(Long.parseLong(phone));

			String std_fees = request.getParameter("std_fees");
			try {
				Validator.checkStringForParseInt(std_fees);
			} catch (InvalidInputDataException err) {
				message += " Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			float salaryFloat = Float.parseFloat(std_fees);
			try {
				Validator.checkNumberForGreaterThanZero(salaryFloat);
			} catch (InvalidInputDataException err) {
				message += " Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setStd_Fees(salaryFloat);
			result = DoctorDao.updateDoctor(newdoc);
			out.println("<div> Doctor update status: " + result + " row updated </div>");
		} catch (Exception e) {
			message += " Error while updating record </p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		try {
			out.close();
		} catch (Exception e) {
			message += "Message: " + e.getMessage();
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}
}
