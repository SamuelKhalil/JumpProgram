package com.sat.ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServe
 */
@WebServlet("/MyServe")
public class MyServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServe() {
        super();
        // TODO Auto-generated constructor stub
    }

    UtilCls cls=new UtilCls();
    Vector<Person> lp=null;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		lp=cls.retVec();
		out.println("<html><head><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script></head><body>");
		Iterator itr= lp.iterator();
		out.println("<div style=\"padding-left: 400px\"><table>");
		while(itr.hasNext()) {
			Person pp=(Person)itr.next();
			out.println("<tr><td><button type=\"button\" class=\"btn btn-info\">"+pp.getName()+"&nbsp;&nbsp;<span class=\"badge badge-light\">"+pp.getId()+"</span>&nbsp;&nbsp;<span class=\"badge badge-light\">"+pp.getEmail()+"</span>\r\n" + 
					"</button></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>");
		}
		out.println("</table></div>");
		out.println("</body></html>");
		//Contextual Variation
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
