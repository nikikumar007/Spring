package com.greeting.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GreetingServlet() {
		super();
		System.out.println("Constructor called=====");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getClass().getName());
		System.out.println(response.getClass().getName());
		request.setAttribute("heading", "Our Specialists");
		RequestDispatcher dispatcher = request.getRequestDispatcher("showDoctor.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		int doctorId = Integer.parseInt(request.getParameter("doctorId"));
		String doctorName = request.getParameter("doctorName");
		long mobileNumber = Long.parseLong(request.getParameter("mobileNumber"));
		String specialization = request.getParameter("specialization");
		LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"), formatter);
		
		Doctor doctor = new Doctor(doctorId, doctorName, mobileNumber, specialization, dateOfBirth);
		
		request.setAttribute("doctorDetails", doctor);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		
		//System.out.println(doctorName);

	}

}
