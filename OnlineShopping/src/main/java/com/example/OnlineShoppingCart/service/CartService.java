package com.example.OnlineShoppingCart.service;

import com.example.OnlineShoppingCart.entity.Cart;
import com.example.OnlineShoppingCart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartService{


    @Autowired
    CartRepository cartRepository;

    public void saveProductToCart(Cart cart) {
        cartRepository.save(cart);
    }

    public void deleteProductById(int id) {
        cartRepository.deleteById(id);
    }


    public List<Cart> getAllProducts() {
        return cartRepository.findAll();
    }


}
