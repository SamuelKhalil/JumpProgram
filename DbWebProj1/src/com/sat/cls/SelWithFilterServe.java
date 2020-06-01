package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelWithFilterServe
 */
@WebServlet("/SelWithFilterServe")
public class SelWithFilterServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelWithFilterServe() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=null;
		ResultSet rs=null;
		int[] arr1=new int[5];
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jumpdba", "root", "admin");
			Statement st=conn.createStatement();
			String query1="select id from regist";
			rs=st.executeQuery(query1);
			int i=0;
			while(rs.next()) {
				arr1[i]=rs.getInt(1);
				i++;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<form name=f1 method=post><select name=ids>");
		for(int i:arr1) {
			out.println("<option value="+i+">"+i+"</option>");
		}
		out.println("</select><input type=submit value=Fetch></form>");		
		if(request.getParameter("ids")!=null) {
			String query2="select * from regist where id="+request.getParameter("ids");
			try {
				Statement st2=conn.createStatement();
				ResultSet rs2=st2.executeQuery(query2);
				while(rs2.next()) {
					out.println("<center><table border=1><tr><td>"+rs2.getInt(1)+"</td><td>"+rs2.getString(2)+"</td><td>"+rs2.getString(3)+"</td></tr></table></center>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
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
