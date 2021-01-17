package com.training.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.daos.DonorDaoImpl;
import com.training.model.BloodDonor;
import com.training.utils.DBConnectionUtils;

/**
 * Servlet implementation class BloodDonorServlet
 */
@WebServlet("/donor")
public class BloodDonorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private DonorDaoImpl dao;
    public BloodDonorServlet() {
        super();
         dao=new DonorDaoImpl();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  List<BloodDonor> list=dao.findAll();
		    request.setAttribute("donorlist", list);
			RequestDispatcher disp=request.getRequestDispatcher("viewDonors.jsp");
			disp.forward(request, response);
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String bloodGroup=request.getParameter("bgroup");
		String gender=request.getParameter("gender");
		long phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
		LocalDate date=Date.valueOf(request.getParameter("dob")).toLocalDate();
		
		BloodDonor donor=new BloodDonor(name,age,bloodGroup,gender,phone,email,date);
		int rowsAdded=dao.add(donor);
		request.setAttribute("donors", rowsAdded);
		RequestDispatcher disp=request.getRequestDispatcher("addDonor.jsp");
		disp.forward(request, response);
		


	}
	}



