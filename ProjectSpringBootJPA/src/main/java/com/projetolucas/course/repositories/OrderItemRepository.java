package com.lucasbac.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasbac.course.entities.OrderItem;
import com.lucasbac.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
