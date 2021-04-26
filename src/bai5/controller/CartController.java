package bai5.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bai5.Dao.CartDao;

@WebServlet("/cart")
public class CartController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stubString id=req.getParameter("id");
		String action=req.getParameter("action");
		if(action!=null && !action.equals("")) {
			if(action.equals("add")) {
				addToCart(req);
			}
			if(action.equals("Remove")) {
				deleteCartItem(req);
			}
		}
		resp.sendRedirect("Cart.jsp");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	public void addToCart(HttpServletRequest req) {
		HttpSession session=req.getSession();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String quantity=req.getParameter("quantity");
		String price=req.getParameter("price");
		
		CartDao cartDao=null;
		Object objCart=session.getAttribute("Cart");
		if(objCart!=null) {
			cartDao=(CartDao) objCart;
		}
		else {
			cartDao=new CartDao();
			session.setAttribute("Cart", cartDao);
		}
		cartDao.addCartItem(quantity, price, id, name);
	}
	public void deleteCartItem(HttpServletRequest req) {
		HttpSession session=req.getSession();
		String srtIndex=req.getParameter("index");
		CartDao cartdao=null;
		Object obj=session.getAttribute("Cart");
		if(obj!=null) {
			cartdao=(CartDao) obj;
		}else {
			cartdao=new CartDao();
		}
		cartdao.deleteCartItem(srtIndex);
	}

}
