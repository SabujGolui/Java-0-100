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

@WebServlet("/updatestudentinfo")
public class Update_Studentinfo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Name = req.getParameter("name");
		String Pass = req.getParameter("pasaword");
		long mob = Long.parseLong(req.getParameter("mobile"));

		MyDao myDao = new MyDao();

//Mydto mydto	=new Mydto();

		// Mydto mydto = (Mydto) req.getseegetAttribute("mydto");
		Mydto mydto = (Mydto) req.getSession().getAttribute("mydto");
		mydto.setName(Name);
		mydto.setPassword(Pass);
		mydto.setMobile(mob);
		myDao.update(mydto);

		resp.getWriter().println("<h1>Data has been updated successfully</h1>");

		List<Mydto> list = myDao.fetchAll();
		req.setAttribute("list", list);

		req.getRequestDispatcher("viewstudentsinformation.jsp").include(req, resp);
	}

}
