package cybersoft.java14.backend.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "userServlet", urlPatterns = {
		"/user-list",
		"/user-create",
		"/user-delete",
		"/user-authorization"
})
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		switch (servletPath) {
		case "/user-list":
			req.getRequestDispatcher("/WEB-INF/views/user/userlist.jsp").forward(req, resp);
			break;
		case "/user-create":
			req.getRequestDispatcher("/WEB-INF/views/user/usercreate.jsp").forward(req, resp);
			break;
		case "/user-delete":
			req.getRequestDispatcher("/WEB-INF/views/user/userdelete.jsp").forward(req, resp);
			break;
		case "/user-authorization":
			req.getRequestDispatcher("/WEB-INF/views/user/userauthorization.jsp").forward(req, resp);
		default:
			break;
		}
	}
}
