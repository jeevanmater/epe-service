package com.nisum.epe_servie.controller;

import com.nisum.epe_servie.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    private List<Product> products = new ArrayList<>();

    @GetMapping(value = "/allProducts")
    public ResponseEntity<List<Product>> allProducts(){
        List<Product> allProdeucts = Arrays.asList(new Product(1, "Applle", new BigDecimal(1200.00)),
                new Product(2, "Orange", new BigDecimal(500))
        );
        return ResponseEntity.status(HttpStatus.OK).body(allProdeucts);
    }
}
