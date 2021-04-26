package bai3.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bai3.bean.CartBean;

@WebServlet("/CartController")
public class CartController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String strAction=req.getParameter("action");
		if(strAction !=null && !strAction.equals("")) {
			if(strAction.equals("add")) {
				addToCart(req);
			}else if(strAction.equals("Update")) {
				updateCart(req);
			}else if(strAction.equals("Delete")) {
				deleteCart(req);
			}
		}
		resp.sendRedirect("/Lab03_18087531_DuongCatLuynh/ShoppingCart.jsp");
	}
	protected void deleteCart(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String strItemIndex=request.getParameter("itemIndex");
		CartBean cartBean=null;
		Object objCartBean=session.getAttribute("cart");
		if(objCartBean!=null) {
			cartBean=(CartBean) objCartBean;
		}
		else {
			cartBean=new CartBean();
		}
		cartBean.deleteCartItem(strItemIndex);
	}
	protected void updateCart(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String strQuantity=request.getParameter("quantity");
		String strItemIndex=request.getParameter("itemIndex");
		CartBean cartBean=null;
		Object objCartBean=session.getAttribute("cart");
		if(objCartBean!=null) {
			cartBean=(CartBean) objCartBean;
		}
		else {
			cartBean=new CartBean();
		}
		cartBean.updateCartItem(strItemIndex, strQuantity);
	}
	protected void addToCart(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String strModelNo=request.getParameter("modelNo");
		String strDescription=request.getParameter("description");
		String strPrice=request.getParameter("price");
		String strQuantity=request.getParameter("quantity");
		CartBean cartBean=null;
		Object objCartBean=session.getAttribute("cart");
		if(objCartBean!=null) {
			cartBean=(CartBean) objCartBean;
		}
		else {
			cartBean=new CartBean();
			session.setAttribute("cart", cartBean);
		}
		cartBean.addCartItem(strModelNo, strDescription, strPrice, strQuantity);
	}
}
