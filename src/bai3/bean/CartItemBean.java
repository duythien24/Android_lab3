package bai3.bean;

public class CartItemBean {
	private String strPartNumber;
	private String strModelDescription;
	private double dblUnitCost;
	private int iQuantity;
	private double dblTotalCost;
	public String getPartNumber() {
		return strPartNumber;
	}
	public void setPartNumber(String strPartNumber) {
		this.strPartNumber = strPartNumber;
	}
	public String getModelDescription() {
		return strModelDescription;
	}
	public void setModelDescription(String strModelDescription) {
		this.strModelDescription = strModelDescription;
	}
	public double getUnitCost() {
		return dblUnitCost;
	}
	public void setUnitCost(double dbUnitCost) {
		this.dblUnitCost = dbUnitCost;
	}
	public int getQuantity() {
		return iQuantity;
	}
	public void setQuantity(int iQuantity) {
		this.iQuantity = iQuantity;
	}
	public double getTotalCost() {
		return dblTotalCost;
	}
	public void setTotalCost(double dbTotalCost) {
		this.dblTotalCost = dbTotalCost;
	}
	public CartItemBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItemBean(String strPartNumber, String strModelDescription, double dblUnitCost, int iQuantity,
			double dblTotalCost) {
		super();
		this.strPartNumber = strPartNumber;
		this.strModelDescription = strModelDescription;
		this.dblUnitCost = dblUnitCost;
		this.iQuantity = iQuantity;
		this.dblTotalCost = dblTotalCost;
	}
	
}
