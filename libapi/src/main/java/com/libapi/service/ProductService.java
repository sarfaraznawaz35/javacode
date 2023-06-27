package com.libapi.service;

import com.libapi.entity.Product;
import com.libapi.helper.Helper;
import com.libapi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void save(MultipartFile file)
    {
        try {
            List<Product> products = Helper.convertExcelToListOfProduct((file.getInputStream()));
            this.productRepo.saveAll(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAllProducts(){
        return this.productRepo.findAll();
    }


}
