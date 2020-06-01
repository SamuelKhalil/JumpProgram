package com.sat.ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sat.util.UtilClsTse;

/**
 * Servlet implementation class TTServe
 */
@WebServlet("/TTServe")
public class TTServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TTServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Home For TClass</title></head><body bgcolor=silver>");
		out.println("<ul>");
		UtilClsTse cls=new UtilClsTse();
		Map<Integer, TServe> mymap=cls.retMap();
//		Set set=mymap.entrySet();
//		for(Object a:set) {
//			Entry ent=(Entry)a;
//			out.println("<li>"+ent.getKey()+"-"+ent.getValue()+"</li>");
//		}
		
		
		Set s= mymap.keySet();
		for(Object o:s) {
			out.println("<li>"+o+"-"+mymap.get(o)+"</li>");
		}
		
		out.println("</ul>");
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
