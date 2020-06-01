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
 * Servlet implementation class GServe
 */
@WebServlet("/GServe")
public class GServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String[] arr= {"id","rname","remail","rmobile"};
		String op="<html><body><form><table border=1>";
		for(String j:arr) {
			op+="<tr><td>"+j+"</td><td><input type=text name="+j+"></td></tr>";
		}
		op+="<tr><td><input type=submit value=Send></td></tr></table></form></body></html>";
		out.println(op);
		
		if(request.getParameter("id")!=null) {
			int ii=Integer.valueOf(request.getParameter("id"));
			String rname=request.getParameter("rname");
			String remail=request.getParameter("remail");
			String rmobile=request.getParameter("rmobile");
			Register reg=new Register();
			reg.setId(ii);
			reg.setRname(rname);
			reg.setRemail(remail);
			reg.setRmobile(rmobile);
			HttpSession sess=request.getSession();
			sess.setAttribute("reg", reg);
			out.println("<a href=./RServe>GO</a>");
			
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
