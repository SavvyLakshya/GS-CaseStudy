package com.example.OnlineShoppingCart.service;

import com.example.OnlineShoppingCart.entity.Product;
import com.example.OnlineShoppingCart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService{

    @Autowired
    ProductRepository productRepository;




    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


    public Product updateProduct(Product product) {

        return productRepository.save(product);
    }


    public Product getProductById(int id) {
        return productRepository.findById((long) id).get();
    }


    public void deleteProductBtId(int id) {
        productRepository.deleteById((long) id);
    }
}
