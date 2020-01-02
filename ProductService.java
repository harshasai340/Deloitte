package com.deloitte.estore.service;

import java.sql.Connection;
import java.util.List;

import com.deloitte.estore.model.Product;

public interface ProductService {
	boolean addProduct(Product product) throws Exception;
	boolean deleteProduct(Product product) throws Exception;
	boolean updateProduct(Product product) throws Exception;
	Product getProductById(int productId) throws Exception;
	List<Product> getAllProducts() throws Exception;
	Connection getDbConnection() throws Exception;
}
