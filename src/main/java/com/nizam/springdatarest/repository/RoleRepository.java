package com.nizam.springdatarest.repository;

import com.nizam.springdatarest.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
