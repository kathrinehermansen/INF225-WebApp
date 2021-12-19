package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import inf225.examples.ServletMethod;

/**
 * Servlet implementation class ParseServlet
 */
@WebServlet("/parseServlet")
public class ParseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String math = request.getParameter("math");
		
		ServletMethod s = new ServletMethod();
		String result = s.equate(math);
		
		PrintWriter writer = response.getWriter();
		writer.println("You typed " + math + " and the result is " + result);
		writer.close();
	}

}
