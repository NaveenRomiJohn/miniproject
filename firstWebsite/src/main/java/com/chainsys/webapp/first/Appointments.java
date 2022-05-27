package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

/**
 * @author nave3121
 * created on 21 May 2022
 */
/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "GettingAllAppointmentDetails";
		String message = "<h1>Error while " + source + "</h1>";
		try {
			List<Appointment> allAppointments = AppointmentDao.getAllAppoinments();
			Iterator<Appointment> apIterator = allAppointments.iterator();
			if (request.getParameter("input").equals("yes")) {
				response.setContentType("text/html");
				out.print("<html><head><title>Appointments</title></head><body>");
				out.print("<table border=1px bgcolor=\"DodgerBlue\" width=50%>");
				out.print("<tr bgcolor=\"DodgerBlue\" align=center>");
				out.print("<th height=\"10\" width=\"90\">Appointment_ID:</th>");
				out.print("<th height=\"10\" width=\"90\">Patient_Name:</th>");
				out.print("<th height=\"10\" width=\"90\">Doctor_ID:</th>");
				out.print("<th height=\"10\" width=\"90\">Hire_Date:</th>");
				out.print("<th height=\"10\" width=\"90\">Fees_Collected:</th>");
				while (apIterator.hasNext()) {
					out.print("<tr align=center>");
					Appointment app = apIterator.next();
					out.print("<td bgcolor=\"LightGray\">" + app.getAppoint_Id() + "</td>");
					out.print("<td bgcolor=\"LightGray\">" + app.getPatient_Name() + "</td>");
					out.print("<td bgcolor=\"LightGray\">" + app.getDoc_Id() + "</td>");
					out.print("<td bgcolor=\"LightGray\">" + app.getAppoint_Date() + "</td>");
					out.print("<td bgcolor=\"LightGray\">" + app.getFees_Collected() + "</td>");
					out.print("</tr>");
				}
			} else if (request.getParameter("input").equals("no")) {
				out.println(" <br><h3>thank you for processing with us</h3>");
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
		if (request.getParameter("submit").equals("Add")) {
			String source = "AddNewAppointment";
			String message = "<h1>Error while " + source + "</h1>";
			PrintWriter out = response.getWriter();
			Appointment newap = new Appointment();
			int result = 0;
			try {
				String id = request.getParameter("appid");
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					message += " Error in Appointment id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				int appId = Integer.parseInt(id);
				try {
					Validator.checkNumberForGreaterThanZero(appId);
				} catch (InvalidInputDataException err) {
					message += " Error in Appointment id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newap.setAppoint_Id(appId);

				SimpleDateFormat app_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String AppDate = request.getParameter("appDate");
				try {
					Validator.checkDate(AppDate);
					Validator.checkAppointmentDate(AppDate);
				} catch (InvalidInputDataException e) {
					message += " Error in date input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				try {
					newap.setAppoint_Date(app_dateFormate.parse(AppDate));
				} catch (ParseException e) {
					message += " Error in date input </p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}

				String docid = request.getParameter("docid");
				try {
					Validator.checkStringForParseInt(docid);
				} catch (InvalidInputDataException err) {
					message += " Error in Doctor id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				int docId = Integer.parseInt(docid);
				try {
					Validator.checkNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					message += " Error in Doctor id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newap.setAppoint_Id(docId);

				String patName = request.getParameter("patName");
				try {
					Validator.checkCharLessThanTwenty(patName);
					Validator.checkNameContainsOnlyString(patName);
				} catch (InvalidInputDataException err) {
					message += " Error in Patient name input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newap.setPatient_Name(patName);

				String fees = request.getParameter("fees");
				try {
					Validator.checkStringForParseInt(fees);
				} catch (InvalidInputDataException err) {
					message += " Error in fees input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				int feesInt = Integer.parseInt(fees);
				try {
					Validator.checkNumberForGreaterThanZero(feesInt);
				} catch (InvalidInputDataException err) {
					message += " Error in fees input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newap.setFees_Collected(feesInt);

				result = AppointmentDao.insertAppointment(newap);
				out.println("<div> Add New Appointment: " + result + " row inserted </div>");
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
		} else if (request.getParameter("submit").equals("update")) {
			doPut(request, response);
		} else if (request.getParameter("submit").equals("Delete")) {
			doDelete(request, response);
		} else if (request.getParameter("submit").equals("DetailsById")) {
			doHead(request, response);
		}
	}

//-----------------------------------------------------------------------------------------------------
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "UpdateAppointment";
		String message = "<h1>Error while " + source + "</h1>";
		Appointment newap = new Appointment();
		int result = 0;
		try {
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				message += " Error in Appointment ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int appId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException err) {
				message += " Error in Appointment ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newap.setAppoint_Id(appId);

			java.util.Date newDate = new java.util.Date();
			newap.setAppoint_Date(newDate);

			String docid = request.getParameter("docId");
			try {
				Validator.checkStringForParseInt(docid);
			} catch (InvalidInputDataException err) {
				message += " Error in Doctor ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int docId = Integer.parseInt(docid);
			try {
				Validator.checkNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				message += " Error in Doctor ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newap.setAppoint_Id(docId);

			String patName = request.getParameter("patName");
			try {
				Validator.checkCharLessThanTwenty(patName);
				Validator.checkNameContainsOnlyString(patName);
			} catch (InvalidInputDataException err) {
				message += " Error in Patient name input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newap.setPatient_Name(patName);

			String fees = request.getParameter("fees");
			try {
				Validator.checkStringForParseInt(fees);
			} catch (InvalidInputDataException err) {
				message += " Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int feesInt = Integer.parseInt(fees);
			try {
				Validator.checkNumberForGreaterThanZero(feesInt);
			} catch (InvalidInputDataException err) {
				message += " Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newap.setFees_Collected(feesInt);
			result = AppointmentDao.insertAppointment(newap);
			out.println("<div> Doctor Details: " + result + " row updated </div>");
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

//-----------------------------------------------------------------------------------------------------
	protected void doHead(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "GetAppointmentByID";
		String message = "<h1>Error while " + source + "</h1>";
		Appointment newap = new Appointment();
		try {
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				message += " Error in Appointment ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int appId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException err) {
				message += " Error in Appointment ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newap.setAppoint_Id(appId);
			Appointment result = AppointmentDao.getPatientById(appId);
			out.println("Appointment ID: \t" + result.getAppoint_Id() + "<br>");
			out.println("Appointment Date: \t" + result.getAppoint_Date() + "<br>");
			out.println("Doctor ID: \t" + result.getDoc_Id() + "<br>");
			out.println("Patient Name: \t" + result.getPatient_Name() + "<br>");
			out.println("Fees Collected: \t" + result.getFees_Collected() + "<br>");
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

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "DeleteAppointmentByID";
		String message = "<h1>Error while " + source + "</h1>";
		try {
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				message += " Error in Appointment ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
			}
			int appId = Integer.parseInt(id);
			try {
				Validator.checkNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException err) {
				message += " Error in Appointment ID input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			int result = AppointmentDao.deleteAppointment(appId);
			out.println(result + " row deleted");
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
}