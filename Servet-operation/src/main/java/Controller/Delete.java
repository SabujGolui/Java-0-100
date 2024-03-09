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

@WebServlet("/delete")
public class Delete extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		long sid = Long.parseLong(id);

		MyDao myDao = new MyDao();
		Mydto mydto = myDao.fetchStudentInfoById(sid);

		myDao.deleteById(mydto);

		resp.getWriter().print("<h1>data has been deleted successfully</h1>");

		List<Mydto> list = myDao.fetchAll();
		req.setAttribute("list", list);

		req.getRequestDispatcher("viewstudentsinformation.jsp").include(req, resp);

	}
}
