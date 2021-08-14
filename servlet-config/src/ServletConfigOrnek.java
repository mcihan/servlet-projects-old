import java.io.*;
import java.util.Enumeration;
import javax.servlet.*; 
import javax.servlet.http.*;

public class ServletConfigOrnek extends HttpServlet
{ 
	  
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) 
			 throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletConfig sConfig = getServletConfig();

		String marka = sConfig.getInitParameter("Marka");
		String model = sConfig.getInitParameter("Model");
		String renk = sConfig.getInitParameter("Renk");

		out.print("Marka : " + marka + "<br/>");
		out.print("Model : " + model + "<br/>");
		out.print("Renk : " + renk + "<br/>");
		out.print("<hr/>");
		
		///////////////////////////////////////

		Enumeration<String> params = sConfig.getInitParameterNames();

		while( params.hasMoreElements() ) 
		{			 		
			out.print(params.nextElement() +  "<br/>");
		}

	}

}