package com.abhinav.cartservices.models;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Product{
    private String description;
    private String title;
    private String imageUrl;
    private long id;
    private Category category;
    private double prices;
}