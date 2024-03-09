package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MyDao;
import Dto.Mydto;

@WebServlet("/Teacherlogin")
public class Teacher_login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		MyDao myDao = new MyDao();
		if (username.equals("headmaster") && password.equals("hm")) {
			resp.getWriter().print("<h1>Teaccher_login_success</h1>");
			List<Mydto> list = myDao.fetchAll();

			// session tracking - to use the current information in future.

			req.setAttribute("list", list);
			req.getRequestDispatcher("viewstudentsinformation.jsp").include(req, resp);

		} else {
			resp.getWriter().print("<h1>Invalid_credentials</h1>");
		}

	}
}
