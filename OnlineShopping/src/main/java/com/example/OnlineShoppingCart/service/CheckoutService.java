package com.example.OnlineShoppingCart.service;

import com.example.OnlineShoppingCart.entity.Checkout;
import com.example.OnlineShoppingCart.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {


    @Autowired
    CheckoutRepository checkoutRepository;

    public Checkout saveCheckoutDetails(Checkout checkout) {

        return checkoutRepository.save(checkout);

    }

    public Object getAllProducts() {
        return checkoutRepository.findAll();
    }
}
