package cybersoft.java14.backend.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "projectServlet", urlPatterns = {
		"/project-manage",
		"/project-create",
		"/project-assignment",
		"/project-statistics"
})
public class ProjectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		
		switch (servletPath) {
		case "/project-manage":
			req.getRequestDispatcher("/WEB-INF/views/project/projectmanage.jsp").forward(req, resp);
			break;
		case "/project-create":
			req.getRequestDispatcher("/WEB-INF/views/project/projectcreate.jsp").forward(req, resp);
			break;
		case "/project-assignment":
			req.getRequestDispatcher("/WEB-INF/views/project/projectassignment.jsp").forward(req, resp);
			break;
		case "/project-statistics":
			req.getRequestDispatcher("/WEB-INF/views/project/projectstatistics.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}
}
