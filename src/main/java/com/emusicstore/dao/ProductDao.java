package com.emusicstore.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.emusicstore.model.Product;

public class ProductDao {

	private List<Product> productList = new ArrayList<Product>();

	public List<Product> getProductList() {

		Product product1 = new Product();

		product1.setProductId("P12");
		product1.setProductName("Guitar");
		product1.setProductCategory("Instrument");
		product1.setProductDescription("Great for music");
		product1.setProductCondition("New");
		product1.setProductManufacturer("Fender");
		product1.setProductPrice(1200);
		product1.setProductStatus("Active");
		product1.setUnitInStock(10);

		Product product2 = new Product();

		product1.setProductId("P13");
		product2.setProductName("Drum");
		product2.setProductCategory("Instrument");
		product2.setProductDescription("Great for music");
		product2.setProductCondition("New");
		product2.setProductManufacturer("XYZ");
		product2.setProductPrice(3200);
		product2.setProductStatus("Active");
		product2.setUnitInStock(5);

		Product product3 = new Product();

		product1.setProductId("P14");
		product3.setProductName("Piano");
		product3.setProductCategory("Instrument");
		product3.setProductDescription("Great for music");
		product3.setProductCondition("New");
		product3.setProductManufacturer("PPT");
		product3.setProductPrice(2200);
		product3.setProductStatus("Active");
		product3.setUnitInStock(3);

		productList.add(product1);
		productList.add(product2);
		productList.add(product3);

		return productList;

	}

	public Product getProductById(String productId) throws IOException {

		for (Product product : getProductList()) {
			if (product.getProductId().equals(productId)) {
				return product;
			}
		}
		throw new IOException("No Product Found");
	}
}
