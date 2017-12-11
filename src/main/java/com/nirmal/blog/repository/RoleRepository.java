package com.nirmal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmal.blog.model.Role;

/**
 * 
 * @author muthu_m
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> 
{

    Role findByName(String name);
}
