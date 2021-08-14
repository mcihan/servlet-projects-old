import java.io.*;
import java.util.Date;

import javax.servlet.http.*;
import javax.servlet.ServletException;

  
public class SessionOrnek extends HttpServlet 
{
 
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException
	{
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);

		String baslik = "Merhaba Eski Oturum";
		String kullaniciId = session.getId();
		int ziyaretSayisi = 0;
		
		Date olusmaZamani = new Date(session.getCreationTime());
		Date sonErisim = new Date(session.getLastAccessedTime());
		

		if (session.isNew()) 
		{
			baslik = "Merhaba Yeni Oturum";
		} 
		else
		{
			ziyaretSayisi = (int) session.getAttribute("ziyaretci") + 1;
		}
		session.setAttribute("ziyaretci", ziyaretSayisi);

		out.print(	"<h2>" + baslik + "</h2>"+
					"<b>kullaniciId : </b>" + kullaniciId + "<br/>"+
					"<b>olusmaZamani : </b>" + olusmaZamani + "<br/>"+
					"<b>sonErisimi : </b>" + sonErisim + "<br/>"+
					"<b>ziyaret sayisi : </b>" + ziyaretSayisi + "<br/>");


	}
}
