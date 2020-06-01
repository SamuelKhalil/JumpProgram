package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RServe
 */
@WebServlet("/RServe")
public class RServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		HttpSession sess=request.getSession();
		Register reg=(Register)sess.getAttribute("reg");
		out.println("<center><table border=1>");
		out.println("<tr><td>RID</td><td>"+reg.getId()+"</td></tr>");
		out.println("<tr><td>RNAME</td><td>"+reg.getRname()+"</td></tr>");
		out.println("<tr><td>REMAIL</td><td>"+reg.getRemail()+"</td></tr>");
		out.println("<tr><td>RMOBILE</td><td>"+reg.getRmobile()+"</td></tr>");
		out.println("</table></center>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
