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

@WebServlet("/create")
public class MyController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String Name = req.getParameter("name");
		String Pass = req.getParameter("pasaword");
		long mob = Long.parseLong(req.getParameter("mobile"));
		String Email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");

		Mydto mydto = new Mydto();

		mydto.setName(Name);
		mydto.setMobile(mob);
		mydto.setPassword(Pass);
		mydto.setEmail(Email);
		mydto.setGender(gender);
		mydto.setDob(dob);
//		resp.getWriter().println("<h1>" + "Name: " + Name + "</h1>");
//		resp.getWriter().println("<h1>" + "Pass: " + Pass + "</h1>");
//		resp.getWriter().println("<h1>" + "mob: " + mob + "</h1>");
//		resp.getWriter().println("<h1>" + "Email: " + Email + "</h1>");
//		resp.getWriter().println("<h1>" + "dob: " + dob + "</h1>");
//		resp.getWriter().println("<h1>" + "gender: " + gender + "</h1>");

		MyDao dao = new MyDao();
		List<Mydto> list = dao.Check(Email);
		if (list.isEmpty()) {
			dao.Save(mydto);
			List<Mydto> list2 = dao.Check(Email);

			if (gender.equals("Male")) {
				resp.getWriter().println("<h1> Thank You Sir : " + Name + ", your account has been created </h>");
			} else {
				resp.getWriter().println("<h1> Thank You Maa'm : " + Name + ", your account has been created </h>");
			}
			resp.getWriter().println("<h1> Your ID is : " + list2.get(0).getId() + " </h>");

			req.getRequestDispatcher("login.html").include(req, resp);
		} else {
			resp.getWriter().println("<h1> Azama </h>");
		}

	}
}
