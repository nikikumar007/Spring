package com.training.listener;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class MyLogFilter
 */
@WebFilter(urlPatterns= {"/book","/second"})
public class MyLogFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyLogFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse) response;
		String uri=req.getRequestURI();
		System.out.println("Received one Request From"+req.getRequestURI());
		if(uri.contains("second"))
		{
			res.sendRedirect("http://www.google.com");
		}
		chain.doFilter(request, response);
		System.out.println("Response Received from"+res.getContentType());
		System.out.println("Status code"+res.getStatus());
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
