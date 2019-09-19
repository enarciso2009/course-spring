package com.narcsoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narcsoft.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
