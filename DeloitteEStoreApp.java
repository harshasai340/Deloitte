package com.deloitte.estore.applicaiton;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

public class DeloitteEStoreApp {

	public static void main(String[] args) {
		ProductService service = new ProductServiceImpl();
        Product p =new Product(104,"Mobile",40000);
        try {
        	if(service.addProduct(p)) {
        	System.out.println("Product added..");	
        	}
        	else {
        		System.out.println("Product Not Added..");
        	}
        }
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
