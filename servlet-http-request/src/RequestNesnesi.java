import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RequestNesnesi")
public class RequestNesnesi extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
						 throws ServletException, IOException 
	{

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
        String host = request.getHeader("host");
		String userAgent = request.getHeader("user-agent");

		out.println(host + "<br>");
		out.println(userAgent + "<br><hr>");

		Enumeration<String> headerNames = request.getHeaderNames();

		while ( headerNames.hasMoreElements() )
		{
			String hName = headerNames.nextElement();
			String header = request.getHeader(hName);
			out.println("<b>" + hName + " : </b>" + header + "<br>");
		}
	}
}