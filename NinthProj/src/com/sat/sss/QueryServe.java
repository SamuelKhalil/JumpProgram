package com.sat.sss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryServe
 */
@WebServlet("/QueryServe")
public class QueryServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String j="";
		for (int i = 0; i < 11; i++) {
			j+="Log("+i+")="+Math.log(i)+"<br>";
		}
		
		String k="";
		for (int i = 0; i <=360; i+=30) {
			k+="Sin("+i+")="+Math.sin(i)+"<br/>";
		}
		
		
		String heads="<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<head>\r\n" + 
				"  <meta charset=\"utf-8\">\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"  <title>jQuery UI Accordion - Default functionality</title>\r\n" + 
				"  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n" + 
				"  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n" + 
				"  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n" + 
				"  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n" + 
				"  <script>\r\n" + 
				"  $( function() {\r\n" + 
				"    $( \"#accordion\" ).accordion();\r\n" + 
				"  } );\r\n" + 
				"  </script>\r\n" + 
				"</head>";
		out.println(heads);
		String tails="<body>\r\n" + 
				" \r\n" + 
				"<div id=\"accordion\">\r\n" + 
				"  <h3>Sin(Theta) For first 12 degrees with a difference</h3>\r\n" + 
				"  <div>\r\n" + 
				"    <p>\r\n" + 
				"    <mark>Linux</mark> Is The <font color=red>Best</font> Operating system In The World\r\n" + 
				k+
				"    </p>\r\n" + 
				"  </div>\r\n" + 
				"  <h3>Section 2</h3>\r\n" + 
				"  <div>\r\n" + 
				"    <p>Doldrums\r\n" + 
				"    </p>\r\n" + 
				"  </div>\r\n" + 
				"  <h3>Section 3</h3>\r\n" + 
				"  <div>\r\n" + 
				"    <p>\r\n" + 
				"    Perceptron\r\n" + 
				"    </p>\r\n" + 
				"    <ul>\r\n" + 
				"      <li>List item one</li>\r\n" + 
				"      <li>List item two</li>\r\n" + 
				"      <li>List item three</li>\r\n" + 
				"    </ul>\r\n" + 
				"  </div>\r\n" + 
				"  <h3>Printing the logs of first 10 numbers</h3>\r\n" + 
				"  <div>\r\n" + 
				"    <p>\r\n" + 
				"    Perception\r\n" + 
				"    </p>\r\n" + 
				"    <p>\r\n" + 
				j+
				"    </p>\r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"</body>\r\n" + 
				"</html>";
		out.println(tails);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
