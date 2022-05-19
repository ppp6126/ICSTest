package com.example.demo;

import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public void adddata(){

		Category category1 = new Category("Plain",new String[]{"M","L","XL"},new String[]{"ชาย"});
//		"SX","S","M","L","XL"
		Category category2= new Category("Color",new String[]{"SX","S","M","L","XL"},new String[]{"ชาย","หญิง"});
		Category category3 = new Category("Pattern",new String[]{"S","M","L","XL"},new String[]{"ชาย","หญิง"});
		Category category4 = new Category("Figure",new String[]{"SX","S","M"},new String[]{"หญิง"});

//		categoryRepository.save(category1);
//		categoryRepository.save(category2);
//		categoryRepository.save(category3);
//		categoryRepository.save(category4);

		Product product1 = new Product("เสื้อผู้ชาย1",100,100,category1);
//		Product product2 = new Product("เสื้อผู้หญิง",200,200,category5);
		Product product3 = new Product("เสื้อแขนยาว",200,30,category2);
		Product product4 = new Product("เสื้อผยืด",200,10,category3);
		Product product5 = new Product("เสื้อผู้หญิง",50,150,category4);


//		productRepository.save(product2);
//		productRepository.save(product1);
//		productRepository.save(product3);
//		productRepository.save(product4);
//		productRepository.save(product5);


	}
}
