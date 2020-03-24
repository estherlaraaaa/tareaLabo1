package com.uca.capas.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = "estherlara";
		String pass = "123";
		
		String userParam = request.getParameter("user");
		String passParam = request.getParameter("pass");
		
		if(user.equals(userParam) && pass.equals(passParam)) { 
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style=\"color:green;\"> Usuario Autorizado </h1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body");
			out.println("<h1 style=\"color:red;\"> Usuario NO Autorizado </h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
