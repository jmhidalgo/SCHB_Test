package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerActions
 */
@WebServlet("/ControllerActions")
public class ControllerActions extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerActions() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		String param = request.getParameter("action");

		if (param == null)
			throw new ServletException("Missing parameter in Controller.");
		else if (param.equals("doLogin"))
			dispatcher = getServletContext().getNamedDispatcher("Weather");
		else
			throw new ServletException("Improper parameter passed to Controller.");

		/*
		if (dispatcher != null)
			dispatcher.forward(request, response);
		else
			throw new ServletException("Controller received a null dispatcher.");
		*/
		
	}

}
