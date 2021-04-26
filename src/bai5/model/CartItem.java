package bai5.model;

public class CartItem {
	private String strProductID;
	private String strName;
	private int Iquantity;
	private double dblPrice;
	private double dblTotal;
	public String getProductID() {
		return strProductID;
	}
	public void setProductID(String strProductID) {
		this.strProductID = strProductID;
	}
	public String getName() {
		return strName;
	}
	public void setName(String strName) {
		this.strName = strName;
	}
	public int getQuantity() {
		return Iquantity;
	}
	public void setQuantity(int iquantity) {
		Iquantity = iquantity;
	}
	public double getPrice() {
		return dblPrice;
	}
	public void setPrice(double dblPrice) {
		this.dblPrice = dblPrice;
	}
	public double getTotal() {
		return dblTotal;
	}
	public void setTotal(double dblTotal) {
		this.dblTotal = dblTotal;
	}
	public CartItem(String strProductID, String strName, int iquantity, double dblPrice, double dblTotal) {
		super();
		this.strProductID = strProductID;
		this.strName = strName;
		Iquantity = iquantity;
		this.dblPrice = dblPrice;
		this.dblTotal = dblTotal;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double calculateTotal(double price, int quantity) {
		double total=0.0;
		total=price*quantity;
		return total;
	}
	
}
