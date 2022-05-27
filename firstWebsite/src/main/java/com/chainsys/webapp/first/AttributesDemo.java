package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributesDemo
 */
public class AttributesDemo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AttributesDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public String salary = null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("html><head><title>Attributes</title></head><body>");
		String submitValue = request.getParameter("submit");
		if (submitValue.equals("Set")) {
			String salaryInput = request.getParameter("salary");
			salary = salaryInput;
			out.println("<h1>Value Set</h1>"+ salary);
		} else if (submitValue.equals("Fetch")) {
			out.println("<h1>Value Fetched</h1>" + salary);//returning value from global variable to html
		}
		out.println("</body></html");
	}
}

//The global variable declared in servlet is stateless(multiuser) in nature.
//The data is shared with all users accessing the servlet.
//The data will be available in the servlet until the servlet is destroyed.
//If a user modifies the value of the global variable ,then all other users currently using the servlet, or users who may user the servlet in the future will get the last modified value.
//Global variable are not suitable for single user state(stateful).
