import java.io.*;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RequestNesnesi2")
public class RequestNesnesi2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
						 throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String method = request.getMethod();
		String protokol = request.getProtocol();
		String localName = request.getLocalName();
		int localPort = request.getLocalPort();
		String contextPath = request.getContextPath();
		String requestUri = request.getRequestURI();
		String servletPath = request.getServletPath();
		
		Locale local = request.getLocale();
		String country = local.getDisplayCountry();
		String language = local.getDisplayLanguage();
		String language_country = local.getDisplayName();
		
		out.println("<b>method : </b>"+method+"<br>");
		out.println("<b>protokol : </b>"+protokol+"<br>");
		out.println("<b>localName : </b>"+localName+"<br>"); 
		out.println("<b>localPort : </b>"+localPort+"<br>"); 
		out.println("<b>contextPath :</b>"+contextPath+"<br>");
		out.println("<b>requestUri: </b>"+requestUri+"<br>");
		out.println("<b>servletPath: </b>"+servletPath+"<br>");
		out.println("<b>country :</b>"+country+"<br>");
		out.println("<b>language :</b>"+language+"<br>");
		out.println("<b>dilUlke :</b>" + language_country + "<br>");
		   
	}

}