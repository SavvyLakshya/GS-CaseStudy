package com.example.OnlineShoppingCart.controller;


import com.example.OnlineShoppingCart.entity.Cart;
import com.example.OnlineShoppingCart.entity.Checkout;
import com.example.OnlineShoppingCart.entity.Product;
import com.example.OnlineShoppingCart.service.CartService;
import com.example.OnlineShoppingCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {

    @Autowired
    ProductService productService;

    @Autowired
    CartService cartService;

    //method to handle list and return model and view



    @GetMapping("/cart")
    public String viewCart(Model model){
        model.addAttribute("products",cartService.getAllProducts());
        return "view_cart";
    }



    @GetMapping("/addTocart")
    public String addToCart(Model model){

        model.addAttribute("products",productService.getAllProducts());
        return "add_to_cart";

    }

    @GetMapping("/cart/checkout")
    public String Checkout(Model model){
        Checkout checkoutDetails = new Checkout();
        model.addAttribute("checkout",checkoutDetails);
        return "checkout";
    }

    @GetMapping("/addToCart/{id}")
    public String editProduct(@PathVariable int id, Model model){
        Product product = productService.getProductById(id);
        Cart cart = new Cart(product.getProduct_id(),product.getProduct_name(),product.getProduct_price(),product.getProduct_category());
        cartService.saveProductToCart(cart);
        return "redirect:/addTocart";

    }


    @GetMapping("/removeFromCart/{id}")
    public String deleteCartItem(@PathVariable int id){
        cartService.deleteProductById(id);
        return "redirect:/addTocart";
    }

    @GetMapping("/removeFromCartinCartPage/{id}")
    public String deleteStudentFromCart(@PathVariable int id){
        cartService.deleteProductById(id);
        return "redirect:/cart";
    }








}
