package unit00;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletE")
public class ServletE extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		int A = Integer.parseInt(request.getParameter("A"));
		int B = Integer.parseInt(request.getParameter("B"));

		PrintWriter out = response.getWriter();
		
		out.print("<html><head><head>");
		out.print("<body><h1>" + name + "</h1>");
		out.print(A + " + " + B + " = " + (A + B) + "<br>");
		out.print(A + " - " + B + " = " + (A - B) + "<br>");
		out.print(A + " * " + B + " = " + (A * B) + "<br>");
		out.print(A + " / " + B + " = " + (Math.round((((double)A / B) * 100)) / (double)100) + "<br>");
		out.print(A + " + " + name + " = " + (A + name));
		out.print("</body></html>");
	}

}
