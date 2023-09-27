package com.example.OnlineShoppingCart.repository;

import com.example.OnlineShoppingCart.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout,Integer>{
}
