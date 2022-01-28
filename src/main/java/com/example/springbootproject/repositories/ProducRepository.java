package com.example.springbootproject.repositories;

import com.example.springbootproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducRepository extends JpaRepository<Product,Long> {
}
