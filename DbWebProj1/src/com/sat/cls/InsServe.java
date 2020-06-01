package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsServe
 */
@WebServlet("/InsServe")
public class InsServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<center><form method=post><table border=1>");
		out.println("<tr><td>Username</td><td><input type=text name=uname></td></tr>");
		out.println("<tr><td>Password</td><td><input type=text name=pass></td></tr>");
		out. println("<tr><td><input type=submit value=Send></td></tr>");
		out.println("</table></form></center>");
		out.println("</body></html>");
		
		if(request.getParameter("uname")!=null) {
			String uname=request.getParameter("uname");
			String pass=request.getParameter("pass");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jumpdba","root","admin");
				PreparedStatement ps=conn.prepareStatement("insert into logins values (?,?)");
				ps.setString(1, uname);
				ps.setString(2, pass);
				ps.execute();
				out.println("<mark>Record Inserted</mark>");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
