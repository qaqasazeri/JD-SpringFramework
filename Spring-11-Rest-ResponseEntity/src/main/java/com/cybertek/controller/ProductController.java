package com.cybertek.controller;

import com.cybertek.entity.Product;
import com.cybertek.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value="/{id}")
    public  Product getProduct(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){

        HttpHeaders responseHttpHeaders=new HttpHeaders();
        responseHttpHeaders.set("Version","Cybertek.V1");
        responseHttpHeaders.set("Operation","GetList");


        return ResponseEntity
                .ok()
                .headers(responseHttpHeaders)
                .body(productService.getProducts());
    }

    @PostMapping
    public  List<Product> createProducts(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping(value="/{id}")
    public  List<Product> deleteProducts(@PathVariable("id") long id){
        return productService.delete(id);
    }

    @PutMapping(value="/{id}")
    public  List<Product> updateProducts(@PathVariable("id") long id,@RequestBody Product product){
        return productService.updateProduct(id,product);
    }
}
