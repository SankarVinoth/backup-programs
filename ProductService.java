package in.sankarvinoth.service;

import java.util.ArrayList;
import java.util.List;


import in.sankarvinoth.model.Product;

public class ProductService {
	
	private ProductService() {
		//private constructor to avoid object creation
	}
	private static final List<Product> products = new ArrayList<>();
	static {
		// List of products in the map
		products.add(new Product("Air Conditioner",10000));
		products.add(new Product("Washing Machine",15000));
		products.add(new Product("Water Purifier",7500));
		products.add(new Product("Television",75000));
		products.add(new Product("vacuum Cleaner",6800));
		products.add(new Product("Refrigerator",16800));
		products.add(new Product("Induction Stove",10500));
		products.add(new Product("Camera",100500));
		products.add(new Product("Microwave Oven",15500));
		products.add(new Product("Mixer Grinder",12500));

	}

	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static List<Product> getProducts() {
		return products;
	}
}
