package dz.test.TestSpBoot.web.Dao;

import java.util.List;

import dz.test.TestSpBoot.web.Model.Product;

public interface ProductDao {
    public List<Product>findAll();
    public Product ProductfindById(int id);
    public void Productsave(Product product);
}