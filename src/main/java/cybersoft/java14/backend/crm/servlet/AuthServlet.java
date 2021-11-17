package cybersoft.java14.backend.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "authServlet", urlPatterns = {
		"/login",
		"/signup"
})
public class AuthServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		
		switch (servletPath) {
		case "/login":
			req.getRequestDispatcher("WEB-INF/views/auth/login.jsp").forward(req, resp);
			break;
		case "/signup":
			req.getRequestDispatcher("WEB-INF/views/auth/signup.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}
}
