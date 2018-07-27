package com.emusicstore;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;

@Controller
public class HelloWorldController {

	private ProductDao productDao = new ProductDao();

	@RequestMapping("/productList")
	public ModelAndView productList() {
		List<Product> products = productDao.getProductList();
		ModelAndView model = new ModelAndView("ProductList");
		model.addObject("products", products);
		return model;
	}
}
