package com.deloitte.estore.service;

import java.sql.Connection;
import java.util.List;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService{

	
	
	public ProductServiceImpl() {
		
	}

	ProductRepo repo;
	
	@Override
	public boolean addProduct(Product product) throws Exception {
		repo = new ProductRepoImpl();
		boolean forReturn = repo.addProduct(product);
		return forReturn;
	}

	@Override
	public boolean deleteProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int productId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getDbConnection() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
