package com.example.OnlineShoppingCart;

import com.example.OnlineShoppingCart.entity.Product;
import com.example.OnlineShoppingCart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShoppingCartApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingCartApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
