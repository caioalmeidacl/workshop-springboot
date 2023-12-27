package com.educandoweb.course.model.repositories;

import com.educandoweb.course.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
