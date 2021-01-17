package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.daos.Validator;
import com.training.model.User;


/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/valid")
public class ValidationServlet extends HttpServlet {
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy called ");
	}

	@Override
	public void init() throws ServletException {	
		super.init();
		System.out.println("init called ");
	}

	private Validator validator;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	HttpSession session;
    public ValidationServlet() {
        super();
        this.validator = new Validator();
        
        System.out.println("constructor called ");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session=request.getSession();
	       String user=(String)session.getAttribute("user");
	       if(user!=null)
	       {
	    	   RequestDispatcher disp=request.getRequestDispatcher("addDonor.jsp");
				disp.forward(request, response);
	       } 
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username=request.getParameter("userName");
			String password=request.getParameter("password");
			Validator val=new Validator();
			boolean check=val.validate(username,password);
			if(check==true)
			{   
				session=request.getSession();
				session.setAttribute("user", username);
				RequestDispatcher disp=request.getRequestDispatcher("admin.jsp");
				disp.forward(request, response);
				
			}
			else {
				
				RequestDispatcher disp=request.getRequestDispatcher("index.html");
				disp.forward(request, response);
			}

		
	}

}
