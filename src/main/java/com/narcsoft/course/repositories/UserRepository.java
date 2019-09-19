package com.narcsoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narcsoft.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
