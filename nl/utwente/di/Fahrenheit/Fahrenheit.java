package nl.utwente.di.Fahrenheit;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Example of a Servlet that gets an ISBN number and returns the book price
 */

public class Fahrenheit extends HttpServlet {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Converter converter;
	
    public void init() throws ServletException {
    	converter = new Converter();
    }	
	
  public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String docType =
      "<!DOCTYPE HTML>\n";
    String title = "Fahrenheit";
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>Temperature in celsius: " +
                   request.getParameter("c") + "\n" +
                "  <P>Temperature in fahrenheit: " +
                   converter.convert(request.getParameter("c")) +
                "</BODY></HTML>");
  }
  

}
