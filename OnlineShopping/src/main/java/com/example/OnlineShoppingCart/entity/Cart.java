package com.example.OnlineShoppingCart.entity;

import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "product_name")
    private String product_name;

    @Column(name = "product_price")
    private int product_price;
    @Column(name = "product_category")
    private String product_category;



    public Cart() {
    }

    public Cart(int product_id, String product_name, int product_price, String product_category) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_category = product_category;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }


    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

}
