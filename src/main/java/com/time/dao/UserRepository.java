package com.time.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.time.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
