import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ServletA extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
			       throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		ServletContext sContext = getServletConfig().getServletContext();
		
		String driver = sContext.getInitParameter("driver");
		String userName = sContext.getInitParameter("userName");
		String password = sContext.getInitParameter("password");

		out.print("<p style='color:#ff4321'>");
		out.print("<b> Driver : </b> <i>" + driver + "</i><br/>");
		out.print("<b> UserName : </b> <i>" + userName + "</i><br/>");
		out.print("<b> Password : </b> <i>" + password + "</i><br/>");
		out.print("</p>");
	}
}