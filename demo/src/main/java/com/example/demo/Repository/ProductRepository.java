package com.example.demo.Repository;

import com.example.demo.Model.Order;
import com.example.demo.Model.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {

    Product findByCategory_Id(long id);

    @Query("SELECT p FROM Product p ")
    List<Product> getProductPageCount(PageRequest of);
}
