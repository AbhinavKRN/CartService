package com.abhinav.cartservice.controllers;

import com.abhinav.cartservice.models.Category;
import com.abhinav.cartservice.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CategoryController{
    private CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping("/products/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}