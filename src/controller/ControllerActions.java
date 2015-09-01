package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDAO;
import model.dao.UserDAOFactory;
import model.vo.User;

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
		String action = request.getParameter("action");

		if (action == null){		
			throw new ServletException("Missing parameter in Controller.");
		} else if (action.equals("doLogin")){
			
			String username = request.getParameter("user");
			String password = request.getParameter("pass");
			
			if (checkUserLogin(username, password)){
				request.setAttribute("user", username);
				dispatcher = request.getRequestDispatcher("profile.jsp");
			}
	
		} else {
			throw new ServletException("Improper action parameter passed to Controller.");
		}
			
		if (dispatcher != null){
			dispatcher.forward(request, response);
		} else {
			throw new ServletException("Controller received a null dispatcher.");
		}
		
	}
	
	
	private boolean checkUserLogin(String username, String password){
		UserDAO userDAO = UserDAOFactory.getUserDAO();
		User user = userDAO.findUser(username);
		return user != null && password.equals(user.getPassword());
	}

}
