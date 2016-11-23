package package6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiniFacebookServlet
 */
@WebServlet("/MiniFacebookServlet")
public class MiniFacebookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public MiniFacebookServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String vorname = request.getParameter("vname");
		String nachname = request.getParameter("nname");
		writer.write("<html><head></head><body><h1>Hallo World</h1>" + vorname + " " + nachname + "</body></html>");
		writer.flush();
		writer.close();
	}

	// protected void doGet(HttpServletRequest request, HttpServletResponse
	// response)
	// throws ServletException, IOException {
	//
	// response.setContentType("text/html;charset=UTF-8");
	//
	// PrintWriter out = response.getWriter();
	//
	// out.write("<html>");
	// out.write("<title>Mini Facebook</title>");
	// out.write("<body>");
	// out.write("<h2>Bitte eintragen</h2>");
	//
	//
	// out.write("<form method= \"POST\">");
	// out.write("Feldbeschreibung: <br/>");
	// out.write("<input type =\"text\" name=\"message\"><br/>");
	// out.write("<input type =\"submit\" value=\"Absenden\">");
	// out.write("</form>");
	// out.write("</body>");
	// out.write("</html>");
	//
	// if (out != null)
	// out.close();

	// PrintWriter writer = response.getWriter();
	// String feldbeschreibung = request.getParameter("fbeschreibung");
	// String vorname = request.getParameter("vname");
	// writer.write("<html><head></head><body><h1>Mini Facebook</h1>" +
	// feldbeschreibung + " " + vorname
	// + "</body></body>");
	// writer.flush();
	// writer.close();
	//
	// response.getWriter().append("Served at:
	// ").append(request.getContextPath());
	// }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
