package com.example.demo.Repository;

import com.example.demo.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order , Long> {

    Order findByProductNameAndId(String name , long id);
    List<Order> findByPurchaseDateBetween(Date dateS , Date dateE);
    List<Order> findByStatus(String status);
}
