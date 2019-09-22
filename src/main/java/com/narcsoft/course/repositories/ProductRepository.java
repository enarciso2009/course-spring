package com.narcsoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narcsoft.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
