package bai5.model;

import java.io.InputStream;



public class Product {
	private String productID;
	private String name;
	private int quantity;
	private double price;
	private InputStream image;


	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}
	public Product(String productID, String name, int quantity, double price, InputStream image) {
		super();
		this.productID = productID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.image = image;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", image=" + image + "]";
	}

	public Product(String productID, String name, int quantity, double price) {
		super();
		this.productID = productID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	
	
	
	
}
