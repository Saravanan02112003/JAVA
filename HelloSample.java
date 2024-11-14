package com.ser;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HelloSample
 */
//@WebServlet("/hello")
public class HelloSample extends HttpServlet {
	private static final long serialVersionUID = 1L; 
//	public void doget(HttpServletRequest req,HttpServletResponse res)throws
//	ServletException,IOException
//	{
//		PrintWriter out=res.getWriter();
//		out.println("Hello World");
//	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloSample() {
        super();
        // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("welcome to the server ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	}
}
