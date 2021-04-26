package bai5.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bai5.Dao.ProductDao;
import bai5.model.Product;

@WebServlet("/List-Product")
public class ListProductController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductDao productDao; 
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		productDao= new ProductDao();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> list = productDao.getAll();
		req.setAttribute("sp", list);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ModelListProduct.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
