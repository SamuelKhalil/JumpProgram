package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TTAServe
 */
@WebServlet("/TTAServe")
public class TTAServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TTAServe() {
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
		out.println("<html><body>");
		// Chrome/81.0.4044.138-Chrome
		// FireFox-Firefox/76.0
		// Edge:Edge

		Enumeration emr = request.getHeaderNames();
		while (emr.hasMoreElements()) {
			Object o = emr.nextElement();
			if (o.toString().equals("user-agent")) {
				String j = request.getHeader(o.toString());
				if (j.indexOf("Chrome/81.0.4044.138") > 0) {
					out.println("<h1>Your Browser Is Chrome</h1>");
				} else if (j.indexOf("Firefox/76.0") > 0) {
					out.println("<h1>Your browser is Firefox</h1>");
				} else if (j.indexOf("Edge") > 0) {
					out.println("<h1>Your browser is Edge</h1>");
				} else {
					out.println("Dont know your browser");
				}
			}
		}
		out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
