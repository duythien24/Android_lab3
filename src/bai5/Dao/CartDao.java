package bai5.Dao;

import java.util.ArrayList;
import java.util.List;

import bai5.model.CartItem;

public class CartDao {
	private static List<CartItem> listCartItems=new ArrayList<CartItem>();
	private static double totalOrder=0.0;
	
	public int getLineItemCount() { 
		  return listCartItems.size();
	  }
		 
	public CartItem getCartItem(int item) {
		CartItem cartItem=null;
		if(listCartItems.size()>item) {
			cartItem=(CartItem) listCartItems.get(item);
		}
		return cartItem;
	}


	public List<CartItem> getListCartItems() {
		return listCartItems;
	}

	public void setListCartItems(List<CartItem> listCartItems) {
		this.listCartItems = listCartItems;
	}

	public double getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(double totalOrder) {
		this.totalOrder = totalOrder;
	}
	public void calculateOrderTotal(List<CartItem> cartItem) {
		double total=0.0;
		for (CartItem item : cartItem) {
			total += item.calculateTotal(item.getPrice(), item.getQuantity());
		}
		setTotalOrder(total);
	}
	public void addCartItem(String strQuantity, String strPrice, String strID,String strName) {
		int quantity=0;
		double price=0.0;
		double total=0.0;
		CartItem cartItem=new CartItem();
		try {
			price=Double.parseDouble(strPrice);
			quantity=Integer.parseInt(strQuantity);
			if(quantity>0) {
				total=price*quantity;
				cartItem.setName(strName);
				cartItem.setProductID(strID);
				cartItem.setPrice(price);
				cartItem.setQuantity(quantity);
				cartItem.setTotal(total);
				listCartItems.add(cartItem);
				calculateOrderTotal(listCartItems);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void deleteCartItem(String srtItemIndex) {
		int itemIndex=0;
		try {
			itemIndex=Integer.parseInt(srtItemIndex);
			listCartItems.remove(itemIndex-1);
			calculateOrderTotal(listCartItems);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	 
}
