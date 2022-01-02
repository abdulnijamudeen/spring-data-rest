package com.nizam.springdatarest.repository;

import com.nizam.springdatarest.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
