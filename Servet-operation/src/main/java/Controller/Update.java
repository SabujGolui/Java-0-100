package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MyDao;
import Dto.Mydto;

@WebServlet("/update")
public class Update extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");

		long sid = Long.parseLong(id);

		MyDao myDao = new MyDao();
		Mydto mydto = myDao.fetchStudentInfoById(sid);

//		 req.setAttribute("mydto", mydto); // HERE iM Setting the current information to utilize it in future.

		req.getSession().setAttribute("mydto", mydto);
		req.getRequestDispatcher("Update.jsp").include(req, resp);
	}

}
