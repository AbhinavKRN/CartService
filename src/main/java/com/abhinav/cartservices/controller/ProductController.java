package com.abhinav.cartservice.controllers;

import com.abhinav.cartservice.models.Product;
import com.abhinav.cartservice.services.ProdutServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") long id){

        return productService.getSingleProduct(id);
    }

    @PostMapping("/products")
    public  Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping ("/products/catogery/{name}")
    public List<Product> getProductByCatogery(@PathVariable("name") String name ){
        return productService.getProductByCatogery(name);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") long id){
        productService.deleteProduct("id");
    }

    @PutMapping("/products/{id}")
        public void updateProduct(@RequestBody Product product, @PathVariable("id") long id){
            productService.updateProduct(product,id);
        }

}