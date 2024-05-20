package com.dd.practice.controller;

import com.dd.practice.model.Product;
import com.dd.practice.model.RequestedData;
import com.dd.practice.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class SearchController {
    @Autowired
    ProductRepo productRepo;

    @Transactional
    @PostMapping(value = "search" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getProduct(@RequestBody RequestedData data) {
       List<Product> products =  productRepo.getSearchedProducts(data.getSearchText());
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
