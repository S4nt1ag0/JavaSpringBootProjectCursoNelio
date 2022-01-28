package com.example.springbootproject.repositories;

import com.example.springbootproject.entities.OrderItem;
import com.example.springbootproject.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
