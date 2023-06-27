package com.libapi.controller;


import com.libapi.entity.Product;
import com.libapi.helper.Helper;
import com.libapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file) throws InterruptedException {
        if (Helper.checkExcelFormat(file)){
            //true
            this.productService.save(file);
            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file");
    }

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(){
        return this.productService.getAllProducts();
    }

}
