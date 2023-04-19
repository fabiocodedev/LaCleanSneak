package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Product;
import connector.Connect;

public class ProductDao implements IDAO<Product>{

	Connection connect = Connect.getConnect();
	PreparedStatement sql = null; 
	ResultSet rs = null;
	
	@Override
	public boolean create(Product product) {
		
		try {
			sql = connect.prepareStatement("INSERT INTO product (title,description,price,productPicPath)"
					+ " VALUES (?,?,?,?)");
			
			sql.setString(1, product.getTitle());
			sql.setString(2, product.getDescription());
			sql.setInt(3, product.getPrice());
			sql.setString(4, product.getProductPicPath());
			
			sql.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public ArrayList<Product> read() {
		
		ArrayList<Product> productsList = new ArrayList<>();
		
		try {
			sql= connect.prepareStatement("SELECT * FROM product");
			rs = sql.executeQuery();
			
			while (rs.next()) {
				Product product = new Product(rs.getString("title"),rs.getString("description"),
						rs.getInt("price"),rs.getString("productPicPath"));
				
				productsList.add(product);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return productsList;
	}

	@Override
	public boolean update(Product product) {

		try {
			sql = connect.prepareStatement("UPDATE product SET title=?, description=?, price=?, productPicPath? "
					+ "WHERE id=?");
			
			sql.setString(1, product.getTitle());
			sql.setString(2, product.getDescription());
			sql.setInt(3, product.getPrice());
			sql.setString(4, product.getProductPicPath());
			
			sql.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean delete(Product product) {

		try {
			sql = connect.prepareStatement("DELETE * FROM product WHERE id=?");
			
			sql.setInt(1 , product.getId());

			sql.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}

	@Override
	public Product findById(int id) {
		
		Product product = new Product();
		
		try {
			sql = connect.prepareStatement("SELECT * FROM product WHERE id=?");
			rs = sql.executeQuery();
			
			while (rs.next()) {
				product = new Product(rs.getString("title"),rs.getString("description"),rs.getInt("price"),
						rs.getString("productPicPath"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
	}

}
