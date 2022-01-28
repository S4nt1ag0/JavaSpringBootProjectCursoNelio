package com.example.springbootproject.services;

import com.example.springbootproject.entities.Product;
import com.example.springbootproject.repositories.ProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProducRepository producRepository;

    public List<Product> findAll(){return producRepository.findAll();}

    public Product findById(Long id){
        Optional<Product> response =  producRepository.findById(id);
        return response.get();
    }
}
