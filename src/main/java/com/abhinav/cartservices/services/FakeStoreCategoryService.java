package com.abhinav.cartservices.services;

import com.abhinav.cartservices.models.Category;
import org.springframework.sterotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;

public class FakeStoreCategoryService{
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<Category> getAllCategories() {
        String[] fakeStoreCategories = restTemplate.getForObject(
                "https://fakestoreapi.com/products/categories",
                String[].class
        );

        if (fakeStoreCategories != null) {
            List<Category> categories = new ArrayList<>();
            for (String category : fakeStoreCategories) {
                Category category1 = new Category();
                category1.setName(category);
                categories.add(category1);
            }

            return categories;
        }

        return null;
    }
}
