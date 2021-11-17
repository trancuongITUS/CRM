package cybersoft.java14.backend.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "taskServlet", urlPatterns = {
		"/task-list",
		"/task-progress",
		"/task-statistics"
})
public class TaskServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String servletPath = req.getServletPath();
		
		switch (servletPath) {
		case "/task-list":
			req.getRequestDispatcher("/WEB-INF/views/task/tasklist.jsp").forward(req, resp);
			break;
		case "/task-progress":
			req.getRequestDispatcher("/WEB-INF/views/task/taskprogress.jsp").forward(req, resp);
			break;
		case "/task-statistics":
			req.getRequestDispatcher("/WEB-INF/views/task/taskstatistics.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}
}
