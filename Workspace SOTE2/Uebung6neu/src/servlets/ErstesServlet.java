package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ErstesServlet")
public class ErstesServlet extends HttpServlet {
    public ErstesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String feldbeschreibung = request.getParameter("fbeschreibung");
		String wert = request.getParameter("wert");
		String aendern = request.getParameter("ändern");
		
		writer.write("<html><head></head><body><h1>HTWG-Book</h1> <table style=\"width:100%\">\r\n" + 
				"  <tr>\r\n" + 
				"    <th>Parameter</th>\r\n" + 
				"    <th>Wert</th>\r\n" + 
				"    <th>Button</th>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>"+ feldbeschreibung + "</td>\r\n" + 
				"    <td>"+ wert + "</td>\r\n" + 
				"    <td>" + aendern + "</td>\r\n" + 
				"  </tr>\r\n" + 
				"</table> </body></html>");
		writer.flush();
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
