package com.example.sevlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Student;
import com.example.services.StudentService;

/**
 * Servlet implementation class StudentDetailsServlet
 */
@WebServlet("/students")
public class StudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetailsServlet() {
        super();
        service=new StudentService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getRequestDispatcher(path);
		String dept=request.getParameter("dept");
		List<Student> list=this.service.getDetails(dept);
		request.setAttribute("studentList", list);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showStudent.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
