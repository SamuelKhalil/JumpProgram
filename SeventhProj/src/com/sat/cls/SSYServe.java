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
 * Servlet implementation class SSYServe
 */
@WebServlet("/SSYServe")
public class SSYServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SSYServe() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<form>");
		out.println("<input type=text name=t1><input type=submit value=Capture>");
		out.println("</form>");
		if(request.getParameter("t1")!=null) {
			HttpSession sess=request.getSession();
			String u,u1=" ";
			u=request.getParameter("t1").toString();
			sess.setAttribute("a", sess.getAttribute("a")+" "+u);
			u1+=sess.getAttribute("a").toString()+" ";
			out.println("<h1>The current value is"+u1+" </h1>");
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
