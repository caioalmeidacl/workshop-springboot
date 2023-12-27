package com.educandoweb.course.model.repositories;

import com.educandoweb.course.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
