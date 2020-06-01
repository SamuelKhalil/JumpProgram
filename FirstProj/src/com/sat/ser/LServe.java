package com.sat.ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LServe
 */
@WebServlet("/LServe")
public class LServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		List<Cars> lc=new ArrayList<>();
		String[] arr1= {"Cadillac","Aramada","Continental","Saturn","Fiago"};
		String[] arr2= {"Aux","BMW","Lincoln","Toyota","Fiat"};
		for (int i = 0; i < arr2.length; i++) {
			Cars cc=new Cars();
			cc.setCname(arr1[i]);
			cc.setCbrand(arr2[i]);
			lc.add(cc);
		}
		out.println("<html><body>");
		Iterator itr=lc.iterator();
		out.println("<center><table style=\"background-color:silver\">");
//		while(itr.hasNext()) {
//			Cars cc=(Cars)itr.next();
//			out.println("<tr bgcolor=gold><td>"+cc.getCname()+"</td><td>"+cc.getCbrand()+"</td></tr>");
//		}//Sentinel Controlled Loop
		//Lazy Evaluation
		lc.stream().forEach(n->out.println("<tr><td>"+n.getCname()+"</td><td>"+n.getCbrand()+"</td></tr>"));
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
