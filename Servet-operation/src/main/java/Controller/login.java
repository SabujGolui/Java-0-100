package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MyDao;
import Dto.Mydto;

@WebServlet("/login")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long id = Long.parseLong(req.getParameter("id"));
		String Pass = req.getParameter("pasaword");

		MyDao dao = new MyDao();
		Mydto mydto = dao.login(id);

		if (mydto == null) {
			resp.getWriter().println("<h1> Invalid ID </h>");
		} else {
			if (mydto.getPassword().equals(Pass)) {
				resp.getWriter().println("<h1> login Done</h>");
			} else {
				resp.getWriter().println("<h1> Invalid password </h>");
			}
		}

	}

}
