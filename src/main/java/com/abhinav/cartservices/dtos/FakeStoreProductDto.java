package com.abhinav.cartservices.dtos;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class FakeStoreProductDto {
    private String image;
    private long id;
    private String title;
    private String description;
    private double price;
    private String category;


}
