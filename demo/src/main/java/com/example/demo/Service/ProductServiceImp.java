package com.example.demo.Service;

import com.example.demo.Config.Request.RequestFilter;
import com.example.demo.Config.Request.RequestFilterOrder;
import com.example.demo.Config.Request.RequestOrder;
import com.example.demo.Model.Category;
import com.example.demo.Model.Order;
import com.example.demo.Model.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    OrderRepository orderRepository ;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> getListProduct(RequestFilter requestFilter) {
        List<Product> listproduct = new ArrayList<>();
        if(requestFilter.getGender() != null && requestFilter.getGender().length > 0){
            int id =0;
            for (int i = 0; i < requestFilter.getGender().length; i++) {
                String gender = requestFilter.getGender()[i];
                List<Category> categoryList = categoryRepository.findAll();
                for(int n=0 ; n<categoryList.size() ; n++){
                    List<String[]> gender2 = Collections.singletonList(categoryList.get(n).getGender());
                    if(gender2.size() <= 1) {
                        for (int j = 0; j < gender2.get(0).length; j++) {
                            System.out.println(gender2.get(0)[j]);
                            if (gender2.get(0)[j].equals(gender)) {
                                id = (int) categoryList.get(j).getId();
                                Product product = (Product) productRepository.findByCategory_Id(id);
                                listproduct.add(product);
                            }
                        }

                    }
                }
            }
        }
        if(requestFilter.getSize() != null && requestFilter.getSize().length > 0){
            int id =0;
            for (int i = 0; i < requestFilter.getSize().length; i++) {
                String size = requestFilter.getSize()[i];
                List<Category> categoryList = categoryRepository.findAll();
                for(int n=0 ; n<categoryList.size() ; n++){
                    List<String[]> size2 = Collections.singletonList(categoryList.get(n).getSizes());
                    if(size2.size() <= 1) {
                        for (int j = 0; j < size2.get(0).length; j++) {
                            System.out.println(size2.get(0)[j] +" = "+ size);
                            if (size2.get(0)[j].equals(size)) {
                                id = (int) categoryList.get(n).getId();
                                Product product = (Product) productRepository.findByCategory_Id(id);
                                listproduct.add(product);
                            }
                        }

                    }
                }
            }
        }
        if(requestFilter.getCategory() != null && requestFilter.getCategory().length >0) {
            for (int i = 0; i < requestFilter.getCategory().length; i++) {
                String name = requestFilter.getCategory()[i];
                Category c = categoryRepository.findByCategoryName(name);
                long id = (int) c.getId();
                listproduct = (List<Product>) productRepository.findByCategory_Id(id);
            }
        }
        if (requestFilter.getCountProduct() > 0){
            listproduct = productRepository.getProductPageCount(PageRequest.of(0,requestFilter.getCountProduct()));
        }
        return listproduct;
    }


    @Override
    public void AddOrder(RequestOrder requestOrder) {
        Order order = new Order();
        order.setAddress(requestOrder.getAddress());
        order.setCountProduct(requestOrder.getCountProduct());
        order.setStatus("รอชำระเงิน");
        order.setProductName(requestOrder.getProductName());

        orderRepository.save(order);
    }

    @Override
    public Order UpdateOrder(Order order) {
        Order orders = orderRepository.findByProductNameAndId(order.getProductName(),order.getId());
        orders.setStatus(order.getStatus());
        orders.setPurchaseDate(new Date());

        orderRepository.save(orders);
        return orders;
    }

    @Override
    public List<Order> getListOrder(RequestFilterOrder filterOrder) {
        String status = filterOrder.getStatus();
        Date dateS = filterOrder.getDatestart();
        Date dateE = filterOrder.getDateend();
        List<Order> orders = new ArrayList<>();
        if(status != null && !status.equals("")){
            System.out.println(status);
            orders = orderRepository.findByStatus(status);
        }
        if((dateS != null && !dateS.equals("")) || (dateE != null && !dateE.equals(""))){
             orders = orderRepository.findByPurchaseDateBetween(dateS,dateE);
        }
        return orders;
    }

//    List<Product> product = productRepository.getProductPageCount(PageRequest.of(0,requestFilter.getCountProduct()));
}
