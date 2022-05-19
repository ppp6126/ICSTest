package com.example.demo.Controller;

import com.example.demo.Config.Request.RequestFilter;
import com.example.demo.Config.Request.RequestFilterOrder;
import com.example.demo.Config.Request.RequestOrder;
import com.example.demo.Model.Order;
import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService ;


    @PostMapping("/addOrder")
    public void AddOrder(@RequestBody RequestOrder requestOrder){
        productService.AddOrder(requestOrder);
    }

    @PostMapping("/SearchFilter")
    public List<Product> ListProduct(@RequestBody RequestFilter requestFilter){
        return productService.getListProduct(requestFilter);
    }

    @PostMapping("/SearchFilterOrder")
    public List<Order> ListOrder(@RequestBody RequestFilterOrder filterOrder){
        return productService.getListOrder(filterOrder);
    }

    @PostMapping("/updateStatus")
    public Order UpdateOrder(@RequestBody Order order){
        return productService.UpdateOrder(order);
    }
}
