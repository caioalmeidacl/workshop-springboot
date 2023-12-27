package com.educandoweb.course.model.repositories;

import com.educandoweb.course.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
