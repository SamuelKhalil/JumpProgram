package com.sat.cls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecServe
 */
@WebServlet("/SecServe")
public class SecServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecServe() {
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
		List<Cars> lc=(List<Cars>)sess.getAttribute("clist");
		ListIterator<Cars> li= lc.listIterator();
//		while(li.hasNext()) {
//			Cars cc=(Cars)li.next();
//			out.println("<li>"+cc.getCname()+" "+cc.getCbrand()+"</li>");
//		}
		//We have traversed in back direction
//		out.println("<ul>");
//		while(li.hasPrevious()) {
//			Cars cc=(Cars)li.previous();
//			out.println("<li>"+cc.getCname()+" "+cc.getCbrand()+"</li>");
//		}	
//		lc.listIterator().forEachRemaining(n->out.println("<li>"+n.getCname()+" "+n.getCbrand()+"</li>"));
//		out.println("</ul>");
		Spliterator<Cars> sic=lc.spliterator();
		sic.forEachRemaining(n
				->{
		out.println(n.getCname()+"&nbsp;"+n.getCbrand()+"<br>");
				}
		);
		//sic.forEachRemaining(new MyConsumer());
		
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
