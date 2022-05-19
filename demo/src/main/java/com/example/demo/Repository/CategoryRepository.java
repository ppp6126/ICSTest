package com.example.demo.Repository;

import com.example.demo.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryName(String Cname);

    Category findBySizesLike(String size);

    Category findByGender(String gender);
}
