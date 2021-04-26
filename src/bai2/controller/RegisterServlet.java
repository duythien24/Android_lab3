package bai2.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bai2.dao.RegisterDao;
import bai2.model.Register;

@WebServlet("/")
public class RegisterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterDao registerDao;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		registerDao=new RegisterDao();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=req.getServletPath();
		try {
			switch (action) {
			case "/insert":
				insertRegister(req, resp);
				break;
			case "/list":
				listRegister(req, resp);
				break;

			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new ServletException(e);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("utf-8");
        doGet(req, resp);
	}
	private void insertRegister(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		String firstName=req.getParameter("fisrtname");
		String lastName=req.getParameter("lastname");
		String email=req.getParameter("email");
		String passWord=req.getParameter("password");
		String date=req.getParameter("date");
		String gender=req.getParameter("gender");

		
		Register res=new Register(firstName, lastName, email, passWord, date, gender);
		registerDao.saveRegister(res);

		resp.sendRedirect("list");
	}
	private void listRegister(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
		List<Register> listRegister=registerDao.getAllRegister();
		req.setAttribute("listRegister", listRegister);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/list-register.jsp");
        dispatcher.forward(req, resp);
	}
}
