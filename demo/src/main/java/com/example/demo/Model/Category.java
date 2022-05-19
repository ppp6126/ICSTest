package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="category")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String categoryName ;
    private String[] sizes ;
    private String[] gender ;

    public Category(String categoryName,String[] sizes,String[] gender) {
        this.categoryName = categoryName;
        this.sizes = sizes;
        this.gender = gender;
    }
}
