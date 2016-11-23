package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Integer zahl = (Integer)session.getAttribute("schluessel");
		if(null == zahl) {
			zahl = new Integer(0);
		}
		int i = zahl.intValue() + 1;
		zahl = new Integer(i);
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>Sie sind zum " + zahl + ".ten Mal hier.</body></html>");
		session.setAttribute("schluessel", zahl);
	}
}
