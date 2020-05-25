package dz.test.TestSpBoot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dz.test.TestSpBoot.web.Dao.ProductDaoClass;
import dz.test.TestSpBoot.web.Model.Product;

@RestController
public class ProductController {
	@Autowired
    private ProductDaoClass productDaoClass;
	
	@RequestMapping(value="/produit",method=RequestMethod.GET)
	public List<Product> getAllProduit() {
		return productDaoClass.findAll();
	}
	
	@GetMapping(value="/produit/{id}")
	public Product getProduct(@PathVariable int id ) {
		return productDaoClass.ProductfindById(id);
	}
	
	@PostMapping(value = "/Produits")
	public Product saveProduct(@RequestBody Product p) {
		productDaoClass.Productsave(p);
		return p;
	}
}
