package com.sat.ser;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration2
 */
@WebServlet("/Registration2")
public class Registration2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String op="ID:<input type=text name=id><br>"
				+ "Name:<input type=text name=gname><br>Email:"
				+ "<input type=text name=email><br><input type=submit value=Send>";
		out.println("<html>"
				+ "<body>"
				+ "<form name=g>");
		out.println(op);
		out.println("</form>");
		if(request.getParameter("id")!=null) {
			int id=Integer.valueOf(request.getParameter("id"));
			String name=request.getParameter("gname");
			String email=request.getParameter("email");
			response.sendRedirect("./TargServe2?id="+id+"&name="+name+"&email="+email);
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}