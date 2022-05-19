package com.example.demo.Service;

import com.example.demo.Config.Request.RequestFilter;
import com.example.demo.Config.Request.RequestFilterOrder;
import com.example.demo.Config.Request.RequestOrder;
import com.example.demo.Model.Order;
import com.example.demo.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getListProduct(RequestFilter requestFilter);

    void AddOrder(RequestOrder requestOrder);

    Order UpdateOrder(Order order);

    List<Order> getListOrder(RequestFilterOrder filterOrder);
}
