package bai5.model;

import java.util.List;

public class Cart {
	private List<CartItem> listCartItems;
	private double totalOrder;
	
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
	public Cart(List<CartItem> listCartItems, double totalOrder) {
		super();
		this.listCartItems = listCartItems;
		this.totalOrder = totalOrder;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cart [listCartItems=" + listCartItems + ", totalOrder=" + totalOrder + "]";
	}
	
}
