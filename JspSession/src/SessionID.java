

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionID
 */
@WebServlet("/SessionID")
public class SessionID extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("userName");
		String password=request.getParameter("userPass");
		System.out.println("Your Username And Passwords Are ::"+user+" "+password );
		request.setAttribute("userName", user);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/first.jsp");
		
		dispatcher.forward(request, response);
		HttpSession session = request.getSession();
		session.getAttribute(user);
		
		//response.sendRedirect("first.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
