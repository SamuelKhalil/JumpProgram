package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PagingServe
 */
@WebServlet("/PagingServe")
public class PagingServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PagingServe() {
		super();
		// TODO Auto-generated constructor stub
	}

	UtilCls cls=new UtilCls();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String u = request.getQueryString();
		if (u != null) {
			u = u.replace("a=", " ").trim();
			List<Register> lr = cls.retRR();
			int y = Integer.valueOf(u);
			Register rr = new Register();
			for (Register r : lr) {
				if (r.getId() == y) {
					rr = r;
				}
			}
			out.println("<ul><li>" + rr.getId() + "</li><li>" + rr.getRname() + "</li><li>" + rr.getRemail()
					+ "</li><li>" + rr.getRmobile() + "</li></ul>");

		}
//		out.println("<form>");
//		for (int i = 1; i < 6; i++) {
//			out.println("<input type=submit name=a value=" + i + ">&nbsp;&nbsp");
//		}
//		out.println("</form>");
		out.println("<form>");
		for (int i = 1; i < cls.getSizel(); i++) {
			out.println("<a href=./PagingServe?a="+i+">"+i+"</a>");
		}
		out.println("</form>");
		out.println("</body></html>");
		
		//Support the sites which are still running on older ones()
		//Migrate from older to a better newer front ends	
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
