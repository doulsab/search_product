package com.dd.practice.repository;

import com.dd.practice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Procedure(procedureName = "products_search")
    List<Product> getSearchedProducts(@Param("search_text") String searchText);
}
