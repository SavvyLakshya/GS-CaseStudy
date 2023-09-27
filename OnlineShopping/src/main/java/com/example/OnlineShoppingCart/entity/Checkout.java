package com.example.OnlineShoppingCart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "checkout")
public class Checkout {

    @Id
    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    private String address;
    @Column(name = "total_amount")
    private int total_amount;


    public Checkout() {
    }

    public Checkout(String first_name, String last_name, String address, int total_amount) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.total_amount = total_amount;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }
}


