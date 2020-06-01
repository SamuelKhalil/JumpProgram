package com.sat.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NServe
 */
@WebServlet("/NServe")
public class NServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();//Created a stylus to write on browser
		out.println("<html><body>");//HTML is the defacto on browser
		out.println("<marquee><h1>Welcome To Servlets!</h1></marquee>");		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		PrintWriter out=response.getWriter();//Created a stylus to write on browser
		out.println("<html><body>");//HTML is the defacto on browser
		out.println("<marquee><h1 style=\"color:red\">Welcome To New York!</h1></marquee>");		
		out.println("</body></html>");
	}
}
