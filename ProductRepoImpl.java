package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.deloitte.estore.model.Product;

public class ProductRepoImpl implements ProductRepo {

	@Override
	public boolean addProduct(Product product) throws Exception{
		Connection con = getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into product value(?,?,?)");
		pstmt.setInt(1, product.getProductId());
		pstmt.setString(2,product.getProductName());
		pstmt.setFloat(3, product.getPrice());
		boolean forReturn = pstmt.execute();
		return forReturn;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getDbConnection() throws Exception {
		//Create Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		
		if(con!=null)
			System.out.println("Connection successful");
		return con;
	}

	
	
	
	
}
