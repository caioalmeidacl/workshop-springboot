package com.educandoweb.course.model.repositories;

import com.educandoweb.course.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
