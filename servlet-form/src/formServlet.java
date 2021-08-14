import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/formServlet")
public class formServlet extends HttpServlet 
{
	
	protected void doGet( HttpServletRequest request,
			              HttpServletResponse response)
			              throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String kullanici = request.getParameter("user");
		String sifre = request.getParameter("password");
		String gitar = request.getParameter("guitar");
		String notalar = request.getParameter("notes");
		String piyano[] = request.getParameterValues("piano");
		
		out.print("<html><body>");
		out.println("<h2>doGet Metodu</h2>");
		out.print("Kullanici : " + kullanici + " <br/>");
		out.print("Sifre : " + sifre + " <br/>");
		out.print("Gitar : " + gitar + " <br/>");
		out.print("Nota : " + notalar + " <br/>");
		out.print("Piyano : ");
		
		for (int i = 0; i < piyano.length; i++) 
		{
			out.print(piyano[i]+ "  ");
		}
		out.print("</html></body>");
	}		 

	protected void doPost( HttpServletRequest request,
						   HttpServletResponse response)
						   throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2>doPost Metodu</h2>");
		String kullanici = request.getParameter("user");
		String sifre = request.getParameter("password");
		String gitar = request.getParameter("guitar");
		String notalar = request.getParameter("notes");
		String piyano[] = request.getParameterValues("piano");
		
		out.print("<html><body>");
		
		out.print("Kullanici : " + kullanici + " <br/>");
		out.print("Sifre : " + sifre + " <br/>");
		out.print("Gitar : " + gitar + " <br/>");
		out.print("Nota : " + notalar + " <br/>");
		out.print("Piyano : ");
		
		for (int i = 0; i < piyano.length; i++) 
		{
			out.print(piyano[i]+ "  ");
		}
		out.print("</html></body>");
	}
}