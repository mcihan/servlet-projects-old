import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;
 
public class BackgroundChange extends HttpServlet 
{

	 
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			             HttpServletResponse response) 
			  throws ServletException, IOException {

		PrintWriter yaz = response.getWriter();
		String[] colors = { "red", "blue", "green", "yellow", "cyan", "gray" };     

		yaz.println("<html>");
		yaz.println("<head>");
		yaz.println("<title>Baslik</title>");
		yaz.println("</head>");

		int i = (int) (Math.random() * 6); 										    

		yaz.println("<body bgcolor='" + colors[i] + "'>");						   
		yaz.println("<h1> COLOR CHANGE</h1>");
		yaz.print("<input type='button' onClick='history.go(0)' value='Yenile'>");  
		yaz.println("</body>");
		yaz.println("</html>");

	}

}