package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegSe
 */
@WebServlet("/RegSe")
public class RegSe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegSe() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    UtilCls cls=new UtilCls();
    List<Register> lr=new ArrayList<Register>();

    boolean tt=true;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		lr=cls.retRR();
		out.println("<html><body>");
		out.println("<form name=rr>");
		out.println("Select The id to display the details:");
		out.println("<select name=s11 onchange=submit()>");
		for(Register r:lr) {
			out.println("<option value="+r.getId()+">"+r.getId()+"</option>");
		}
		out.println("</select>");
		out.println("</form>");
		if(request.getParameter("s11")!=null) {
			tt=false;
			int y=Integer.valueOf(request.getParameter("s11"));
			Register reg=new Register();
			for(Register r:lr) {
				if(r.getId()==y) {
					reg=r;
				}
			}
			out.println("<center><table>");
			out.println("<tr><td>ID</td><td>"+reg.getId()+"</td></tr>");
			out.println("<tr><td>Name</td><td>"+reg.getRname()+"</td></tr>");
			out.println("<tr><td>Email</td><td>"+reg.getRemail()+"</td></tr>");
			out.println("<tr><td>Mobile</td><td>"+reg.getRmobile()+"</td></tr>");
			out.println("</table></center></body></html>");//Paging
		}
		lr.clear();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
