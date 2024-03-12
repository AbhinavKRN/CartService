package com.abhinav.cartservices.services;

import com.abhinav.cartservices.models.Category;
import com.abhinav.cartservices.models.Product;
import java.util.*;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(long id);
    Product createProduct(Product product);
    List<Product> getProductByCategory(String category);
    void deleteProduct(long id);
    void updateProduct(Product product, long id);
}
