import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RequestNesnesi3")

public class RequestNesnesi3 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
						 throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		request.setAttribute("driver", "oracle.jdbc.driver.OracleDriver");
		request.setAttribute("userName", "Developera");
				
		String driver = (String )request.getAttribute("driver");
		String userName = (String )request.getAttribute("userName");
				
		out.println("<b>driver : </b>" + driver + "<br>");
		out.println("<b>userName : </b>" + userName + "<br>");
	}
}