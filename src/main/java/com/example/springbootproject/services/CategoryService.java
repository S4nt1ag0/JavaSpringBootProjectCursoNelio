package com.example.springbootproject.services;

import com.example.springbootproject.entities.Category;
import com.example.springbootproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){ return categoryRepository.findAll();}

    public Category findById(Long id){
        Optional<Category> response = categoryRepository.findById(id);
        return response.get();
    }
}
