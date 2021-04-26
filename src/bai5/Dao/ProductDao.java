package bai5.Dao;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bai5.Conection.ConnectionJDBC;
import bai5.model.Product;



public class ProductDao {
	private Connection ketNoi;

	public ProductDao() {
		// TODO Auto-generated constructor stub
		ketNoi = ConnectionJDBC.getKetNoi();
	}
	public List<Product> getAll(){
		List<Product> listProduct=new ArrayList<>();
		PreparedStatement stmt = null;
		String sql="select * from Product";
		try {
			stmt=ketNoi.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setProductID(rs.getString("productID"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getDouble("price"));
				p.setQuantity(rs.getInt("quantity"));
				p.setImage(rs.getBlob("img").getBinaryStream());
				listProduct.add(p);
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listProduct;
		
	}
	public Product getProduct(String id){
		Product p=new Product();
		PreparedStatement stmt = null;
		String sql="select * from Product where productID="+id+"";
		try {
			stmt=ketNoi.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				p.setProductID(rs.getString("productID"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getDouble("price"));
				p.setQuantity(rs.getInt("quantity"));
				p.setImage(rs.getBlob("img").getBinaryStream());
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return p;
		
	}
}
