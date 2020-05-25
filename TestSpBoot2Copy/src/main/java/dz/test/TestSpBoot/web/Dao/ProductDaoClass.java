package dz.test.TestSpBoot.web.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import dz.test.TestSpBoot.web.Model.Product;
@Repository
public class ProductDaoClass implements ProductDao {
    public static Map<Integer,Product>products= new HashMap<Integer,Product>();
    static {
        products.put(1,new Product(1, "Ordinateur portable", 350));
        products.put(2,new Product(2, "Ordinateur portable2", 750)); 
        products.put(3,new Product(3, "Ordinateur portable3", 1450));
    }
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList(products.values());
	}

	@Override
	public Product ProductfindById(int id) {
		return products.get(id);
		
	}

	@Override
	public void Productsave(Product product) {
		products.put(product.getId(),product);
		
	}

}
