package com.dd.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Product {
    @Id
    private int productId;
    private String title;
    private String description;
    private double price;
    private String thumbnailPath;
    private double rating;
}
