package com.nirmal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmal.blog.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByNameIgnoreCase(String name);
}
